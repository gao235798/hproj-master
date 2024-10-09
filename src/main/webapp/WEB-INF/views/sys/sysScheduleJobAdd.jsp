<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/global.jsp" %>
<script type="text/javascript">
    $(function () {
        $('#jobAddForm').form({
            url: '${ctx}/sysScheduleJob/add',
            onSubmit: function () {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success: function (result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');
                    parent.$.modalDialog.handler.dialog('close');
                    $.messager.show({
                        title: '提示',
                        msg: result.msg,
                        timeout: 1000
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
        <form id="jobAddForm" method="post">
            <table class="grid">
                <tr>
                    <td>任务名</td>
                    <td>
                        <input name="name" class="easyui-textbox" prompt="请输入任务名称" data-options="required:true"
                               value="${sysScheduleJob.name}"/>
                    </td>
                </tr>
                <tr>
                    <td>任务组</td>
                    <td>
                        <input name="group" class="easyui-textbox" prompt="请输入任务组名称"
                               data-options="required:true" value="${sysScheduleJob.group}"/>
                    </td>
                </tr>
                <tr>
                    <td>表达式</td>
                    <td>
                        <input name="cronExpression" class="easyui-textbox" prompt="请输入Cron表达式"
                               data-options="required:true" value="${sysScheduleJob.cronExpression}"/>
                    </td>
                </tr>
                <tr>
                    <td>任务类</td>
                    <td>
                        <input name="className" class="easyui-textbox" prompt="请输入有效类(全路径)"
                               data-options="required:true" value="${sysScheduleJob.className}"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>