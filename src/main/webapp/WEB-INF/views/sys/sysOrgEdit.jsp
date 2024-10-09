<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {

    	$('#pid').combotree({
            url : '${ctx}/sysOrg/allTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            value : '${sysOrg.orgPid}'
        });

        
        $('#sysOrgEditForm').form({
            url : '${ctx}/sysOrg/edit',
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
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div class="gridDiv" data-options="region:'center',border:false">
        <form id="sysOrgEditForm" method="post">
            <table class="grid">
                <tr>
                    <td>机构名称</td>
                    <td>
                    	<input name="orgId" type="hidden"  value="${sysOrg.orgId}">
                    	<input name="orgName" class="easyui-textbox" prompt="请输入机构名称" data-options="required:true" value="${sysOrg.orgName}">
                    </td>
                    <td>排 序</td>
                    <td>
                    	<input name="orgSeq"  class="easyui-numberspinner" data-options="editable:false" value="${sysOrg.orgSeq}">
                    </td>
                </tr>
                <tr>
					<td>地 址</td>
					<td colspan="3">
						<input name="orgAddress" class="easyui-textbox" prompt="请输入地址" value="${sysOrg.orgAddress}"/>
					</td>
                </tr>
                <tr>
                    <td>描述信息</td>
                    <td colspan="3">
                    	<input name="description" class="easyui-textbox" prompt="请输入描述信息" value="${sysOrg.description}"/>
                    </td>
				</tr>
				<tr>
                <td>上级资源</td>
               		<td colspan="3">
               			<select id="pid" name="orgPid"></select>
                		<a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#pid').combotree('clear');" >清空</a>
                	</td>
           		</tr>
            </table>
        </form>
    </div>
</div>