<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {

        $('#pid').combotree({
            url : '${ctx}/sysResource/allMenuTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto'
        });

        $('#sysResourceAddForm').form({
            url : '${ctx}/sysResource/add',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    parent.$.modalDialog.openner_treeGrid.treegrid('reload');
                    parent.$.modalDialog.handler.dialog('close');
                    $.messager.show({
                        title : '提示',
                        msg : result.msg,
                        timeout : 1000
                    });
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });

    });

    function openIconAllHtml(){
   		window.open("${staticPath}/icon/group/icon-all.html");
   	}

    function onTypeChange(){
        var type = $('#resourceType').combobox('getValue');
        if (type == 1) {//菜单
            $('#permCode').textbox('disable');
            $('#url').textbox('enable');
        } else if(type == 2) {//按钮
            $('#permCode').textbox('enable');
            $('#url').textbox('disable');
        }
    }

</script>
<div class="gridDiv">
    <form id="sysResourceAddForm" method="post">
        <table class="grid">
            <tr>
                <td>资源名称</td>
                <td><input name="resourceName" class="easyui-textbox" prompt="请输入资源名称" data-options="required:true" ></td>
                <td>资源类型</td>
                <td><select name="resourceType" id="resourceType" class="easyui-combobox" data-options="onLoadSuccess:onTypeChange,onChange:onTypeChange,required:true,editable:false,panelHeight:'auto'">
                            <option value="1">菜单</option>
                            <option value="2">按钮</option>
                </select></td>
            </tr>
            <tr>
                <td>权限编号</td>
                <td><input name="permCode" id="permCode" class="easyui-textbox" prompt="请输入权限代号" data-options="height:28" ></td>
                <td>资源路径</td>
                <td><input name="url" id="url" class="easyui-textbox" prompt="请输入资源路径" data-options="height:28" ></td>
            </tr>
            <tr>
                <td>菜单图标</td>
                <td ><input  name="icon" id="icon" class="easyui-textbox" data-options="buttonIcon:'icon-search',onClickButton:openIconAllHtml"/></td>
                <td>排序</td>
                <td><input name="resourceSeq" class="easyui-numberspinner" value="0" data-options="editable:false"></td>
            </tr>
            <tr>
            	<td>资源状态</td>
                <td ><select name="resourceStatus" class="easyui-combobox" data-options="required:true,editable:false,panelHeight:'auto'">
                            <option value="1">正常</option>
                            <option value="0">停用</option>
                </select></td>
                <td>描述信息</td>
                <td><input name="description" class="easyui-textbox" prompt="请输入描述信息" ></td>
            </tr>
            <tr>
                <td>上级资源</td>
                <td colspan="3"><select id="pid" name="resourcePid"></select>
                <a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#pid').combotree('clear');" >清空</a></td>
            </tr>
            <tr>
                <td>描述信息</td>
                <td colspan="3"><input name="description" class="easyui-textbox" multiline="true" prompt="请输入描述信息" /></td>
            </tr>
        </table>
    </form>
</div>