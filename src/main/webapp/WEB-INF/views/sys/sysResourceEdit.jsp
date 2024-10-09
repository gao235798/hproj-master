<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {

        $('#resourcePid').combotree({
            url : '${ctx}/sysResource/allMenuTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            value : '${sysResource.resourcePid}'
        });
        
        $('#sysResourceEditForm').form({
            url : '${ctx}/sysResource/edit',
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
                    parent.index_menu_tree.tree('reload');
                    $.messager.show({
                        title : '提示',
                        msg : result.msg,
                        timeout : 1000
                    });
                }
            }
        });
        $("#resourceStatus").val('${sysResource.resourceStatus}');
        $("#resourceType").val('${sysResource.resourceType}');
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
    <form id="sysResourceEditForm" method="post">
        <table  class="grid">
            <tr>
                <td>资源名称</td>
                <td><input name="resourceId" type="hidden"  value="${sysResource.resourceId}" >
                <input name="resourceName" class="easyui-textbox" prompt="请输入资源名称" value="${sysResource.resourceName}" data-options="required:true" ></td>
                <td>资源类型</td>
                <td><select id="resourceType" name="resourceType" class="easyui-combobox" data-options="onLoadSuccess:onTypeChange,onChange:onTypeChange,required:true,editable:false,panelHeight:'auto'">
                            <option value="1">菜单</option>
                            <option value="2">按钮</option>
                </select></td>
            </tr>
            <tr>
                <td>权限编号</td>
                <td><input name="permCode" id="permCode" class="easyui-textbox" prompt="请输入资源路径" value="${sysResource.permCode}"></td>
                <td>资源路径</td>
                <td><input name="url" id="url" class="easyui-textbox" prompt="请输入资源路径" value="${sysResource.url}"></td>
            </tr>
            <tr>
                <td>菜单图标</td>
                <td ><input name="icon" class="easyui-textbox" data-options="buttonIcon:'icon-search',onClickButton:openIconAllHtml" value="${sysResource.icon}"/></td>
                <td>排序</td>
                <td><input name="resourceSeq" value="${sysResource.resourceSeq}"  class="easyui-numberspinner" data-options="editable:false"></td>
            </tr>
            <tr>
                <td>资源状态</td>
                <td ><select id="resourceStatus" name="resourceStatus"  class="easyui-combobox" data-options="required:true,editable:false,panelHeight:'auto'">
                            <option value="1">正常</option>
                            <option value="0">停用</option>
                </select></td>
			<%--
                <td>资源级别</td>
                <td><input type="text" value="${sysResource.resourceLevel}"  class="easyui-textbox" data-options="readonly:true,iconCls:'icon-metro-lock'></td>
            --%>
            </tr>
            <tr>
                <td>上级资源</td>
                <td colspan="3"><select id="resourcePid" name="resourcePid"></select>
                <a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#resourcePid').combotree('clear');" >清空</a></td>
            </tr>
            <tr>
                <td>描述信息</td>
                <td colspan="3"><input name="description" class="easyui-textbox" multiline="true" prompt="请输入描述信息" value="${sysResource.description}" /></td>
            </tr>
        </table>
    </form>
</div>
