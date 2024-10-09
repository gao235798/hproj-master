<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {
        $('#roleEditForm').form({
            url : '${ctx}/sysRole/edit',
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
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');
                    parent.$.modalDialog.handler.dialog('close');
                    parent.index_menu_tree.tree('reload');
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
        
        $("#roleStatus").val('${sysRole.roleStatus}');
        $("#description").val('${sysRole.description}');
        
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div class="gridDiv" data-options="region:'center',border:false">
        <form id="roleEditForm" method="post">
            <table class="grid">
                <tr>
                    <td>角色名称</td>
                    <td><input name="roleId" type="hidden"  value="${sysRole.roleId}">
                    <input name="roleName" class="easyui-textbox" prompt="请输入角色名称" data-options="required:true" value="${sysRole.roleName}"></td>
                </tr>
                <tr>
                    <td>排序</td>
                    <td><input name="roleSeq"  class="easyui-numberspinner" required="required" data-options="editable:false" value="${sysRole.roleSeq}"></td>
                </tr>
                <tr>
                    <td>状态</td>
	                <td >
		                <select id="roleStatus" name="roleStatus" class="easyui-combobox" data-options="required:true,editable:false,panelHeight:'auto'">
		                            <option value="1">正常</option>
		                            <option value="0">停用</option>
		                </select>
	                </td>
                </tr>
                <tr>
                    <td>描述信息</td>
                    <td colspan="3"><input id="description" name="description"  multiline="true" class="easyui-textbox" prompt="请输入描述信息" style="height:40;width:95%"></input></td>
                </tr>
            </table>
        </form>
    </div>
</div>