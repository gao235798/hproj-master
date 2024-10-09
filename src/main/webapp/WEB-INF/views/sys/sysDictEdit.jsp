<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {
        $('#pid').combotree({
            url : '${ctx}/sysDict/allTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            value : '${sysDict.dictPid}',
            onClick : function(node){
                if (node.attributes && node.attributes.dictType) {
                    $('#dictType').val(node.attributes.dictType);
                }
            }
        });

        $('#sysDictEditForm').form({
            url : '${ctx}/sysDict/edit',
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
        $("#description").val('${sysDict.description}');
    });

    function openIconAllHtml(){
   		window.open("${staticPath}/icon/group/icon-all.html");
   	}

</script>
<div class="gridDiv">
    <form id="sysDictEditForm" method="post">
        <div class="gridDiv light-info">
            <div>注意：修改类型或参数，可能会导致系统数据异常，谨慎操作！</div>
        </div>
        <table class="grid">
            <tr>
                <td>参数</td>
                <td>
                    <input name="dictId" type="hidden"  value="${sysDict.dictId}" >
                    <input name="dictCode" id="dictCode" class="easyui-textbox" prompt="请输入参数名" value="${sysDict.dictCode}">
                </td>
                <td>名称</td>
                <td><input name="dictName" class="easyui-textbox" prompt="请输入名称" value="${sysDict.dictName}" data-options="required:true" ></td>
            </tr>
            <tr>
                <td>上级</td>
                <td><select id="pid" name="dictPid"></select>
                    <a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#pid').combotree('clear');" >清空</a></td>
                <td>类型</td>
                <td colspan="4"><input name="dictType" id="dictType" type="text" class="easyui-textbox" prompt="请输入类型名称" value="${sysDict.dictType}" data-options="required:true" ></td>
            </tr>
            <tr>
                <td>排序</td>
                <td><input name="dictSeq" class="easyui-numberspinner" value="${sysDict.dictSeq}" data-options="editable:false"></td>
            </tr>
            <tr>
                <td>描述</td>
                <td colspan="3"><input name="description" id="description" multiline="true" class="easyui-textbox" prompt="请输入描述信息"></input></td>
            </tr>
        </table>
    </form>
</div>