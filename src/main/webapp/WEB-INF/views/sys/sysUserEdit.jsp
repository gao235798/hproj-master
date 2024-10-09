<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    $(function() {
        var roleIds = ${roleIds};

        $('#orgId').combotree({
            url : '${ctx}/sysOrg/allTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            value : '${userVo.orgId}'
        });

        $('#roleIds').combotree({
            url : '${ctx}/sysRole/allTree/json',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            multiple : true,
            cascadeCheck : false,
            value : roleIds
        });

        $('#userEditForm').form({
            url : '${ctx}/sysUser/edit',
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
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为sysUser.jsp页面预定义好了
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
        $("#sex").val('${userVo.sex}');
        $("#userStatus").val('${userVo.userStatus}');
        $("#address").val('${userVo.address}');
        $("#description").val('${userVo.description}');
        
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div class="gridDiv" data-options="region:'center',border:false">
        <form id="userEditForm" method="post">
            <div class="gridDiv light-info">
                <div>密码不支持修改!</div>
            </div>
            <table class="grid">
                <tr>
                    <td>登录名</td>
                    <td><input name="userId" type="hidden"  value="${userVo.userId}">
                    <input name="loginName" class="easyui-textbox" prompt="请输入登录名称" data-options="required:true" value="${userVo.loginName}"></td>
                    <td>姓名</td>
                    <td><input name="userName" class="easyui-textbox" prompt="请输入姓名" data-options="required:true" value="${userVo.userName}"></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>
                        <select name="sex" id="sex" class="easyui-combobox" data-options="editable:false,panelHeight:'auto'">
                            <option value="1" selected="selected">男</option>
                            <option value="2" >女</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>部门</td>
                    <td><select id="orgId" name="orgId" class="easyui-validatebox" data-options="required:true"></select></td>
                	<td>用户状态</td>
                    <td>
                        <select id="userStatus" name="userStatus" class="easyui-combobox" data-options="editable:false,panelHeight:'auto'">
                                <option value="1">正常</option>
                                <option value="0">停用</option>
                        </select>
                    </td>
                </tr>
                <shiro:hasPermission name="sys:user:editRole">
	                <tr>
	                	<td>角色</td>
	                    <td colspan="3"><select id="roleIds" name="roleIds"></select></td>
	                </tr>
	            </shiro:hasPermission>
                <tr>
                    <td>电话</td>
                    <td>
                        <input type="text" name="phone" class="easyui-numberbox" value="${userVo.phone}"/>
                    </td>
                     <td>Email</td>
                    <td>
                        <input type="text" name="email" class="easyui-textbox" value="${userVo.email}"/>
                    </td>
                </tr>
                <tr>
                    <td>地址</td>
                    <td colspan="3"><input name="address" id="address" multiline="true" class="easyui-textbox" prompt="请输入地址信息"></input></td>
                </tr>
                <tr>
                	<td>描述</td>
                    <td colspan="3"><input name="description" id="description" multiline="true" class="easyui-textbox" prompt="请输入描述信息"></input></td>
                </tr>
            </table>
        </form>
    </div>
</div>