<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {
        $('#pid').combotree({
            url : '${ctx}/sysOrg/allTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto'
        });

        $('#sysOrgAddForm').form({
            url : '${ctx}/sysOrg/add',
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
<div class="gridDiv">
    <form id="sysOrgAddForm" method="post">
        <table class="grid">
            <tr>
                <td>机构名称</td>
                <td><input name="orgName" class="easyui-textbox" prompt="请输入机构名称" data-options="required:true" ></td>
                <td>排  序</td>
                <td><input name="orgSeq" class="easyui-numberspinner" value="0"  data-options="editable:false"></td>
            </tr>
            <tr>
	            <td>地 址</td>
	            <td colspan="3">
	            <input name="orgAddress" class="easyui-textbox" prompt="请输入地址"/></td>
            </tr>
            <tr>
	            <td>描述信息</td>
	            <td colspan="3">
	            <input name="description" class="easyui-textbox" prompt="请输入描述信息" /></td>
            </tr>
            <tr>
                <td>上级资源</td>
                <td colspan="3"><select id="pid" name="orgPid"></select>
                <a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#pid').combotree('clear');" >清空</a></td>
            </tr>
        </table>
    </form>
</div>