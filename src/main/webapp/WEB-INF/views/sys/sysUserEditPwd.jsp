<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {

        $('#editUserPwdForm').form({
            url : '${ctx}/sysUser/editUserPwd',
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
                    parent.$.messager.alert('提示', result.msg, 'info');
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: hidden;">
            <form id="editUserPwdForm" method="post">
                <table class="grid">
                    <tr>
                        <td>登录名：</td>
                        <td><shiro:principal/></td>
                    </tr>
                    <tr>
                        <td>原密码：</td>
                        <td><input name="oldPwd" type="password" class="easyui-textbox" prompt="请输入原密码" data-options="required:true"></td>
                    </tr>
                    <tr>
                        <td>新密码：</td>
                        <td><input name="pwd" type="password" class="easyui-textbox" prompt="请输入新密码" data-options="required:true"></td>
                    </tr>
                    <tr>
                        <td>重复密码：</td>
                        <td><input name="rePwd" type="password" class="easyui-textbox" prompt="请再次输入新密码" data-options="required:true,validType:'eqPwd[\'#editUserPwdForm input[name=pwd]\']'"></td>
                    </tr>
                </table>
            </form>
    </div>
</div>