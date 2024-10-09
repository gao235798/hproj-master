<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/global.jsp" %>
<script type="text/javascript">
    $(function () {

        <%-- 处理List对象 --%>
        var roleName;
        <c:forEach items="${userVo.roleList}" var="sysRole" varStatus="i">
        <c:choose>
        <c:when test="${i.index == 0}">
        roleName = "" + "${sysRole.roleName}";
        </c:when>
        <c:otherwise>
        roleName = roleName + "，" + "${sysRole.roleName}";
        </c:otherwise>
        </c:choose>
        </c:forEach>

        $('#userEditForm').form({
            url: '${ctx}/sysUser/currentUserEdit',
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
                    parent.$.modalDialog.handler.dialog('close');
                    $.messager.show({
                        title: '提示',
                        msg: result.msg,
                        timeout: 1000
                    });
                } else {
                    $.messager.alert('错误', result.msg, 'error');
                }
            }
        });

        $('#roleNames').val(roleName);
        $('#sex').val('${userVo.sex}');
        $('#userStatus').val('${userVo.userStatus}');

    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div class="gridDiv" data-options="region:'center',border:false">
        <form id="userEditForm" method="post">
            <div class="gridDiv light-info">
                <div>支持修改部分信息</div>
            </div>
            <table class="grid">
                <tr>
                    <td>登录名</td>
                    <td>
                        <input type="hidden" value="${userVo.userId}">
                        <input class="easyui-textbox" data-options="readonly:true,iconCls:'icon-metro-lock'"
                               value="${userVo.loginName}"/>
                    </td>
                    <td>姓名</td>
                    <td>
                        <input class="easyui-textbox" data-options="readonly:true,iconCls:'icon-metro-lock'"
                               value="${userVo.userName}"/>
                    </td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>
                        <select name="sex" id="sex" class="easyui-combobox"
                                data-options="editable:false,panelHeight:'auto'">
                            <option value="1" selected="selected">男</option>
                            <option value="2">女</option>
                        </select>
                    </td>
                    <td>登陆次数</td>
                    <td>
                        <input class="easyui-textbox" data-options="readonly:true,iconCls:'icon-metro-lock'"
                               value="${userVo.loginCount}"/>
                    </td>
                </tr>
                <tr>
                    <td>部门</td>
                    <td>
                        <input class="easyui-textbox" data-options="readonly:true,iconCls:'icon-metro-lock'"
                               value="${userVo.sysOrg.orgName}"/>
                    </td>
                    <td>用户状态</td>
                    <td>
                        <select id="userStatus" class="easyui-combobox"
                                data-options="readonly:true,iconCls:'icon-metro-lock',editable:false,panelHeight:'auto'">
                            <option value="1">正常</option>
                            <option value="0">停用</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>角色</td>
                    <td colspan="3"><input id="roleNames" class="easyui-textbox"
                                           data-options="readonly:true,iconCls:'icon-metro-lock'"/></td>
                </tr>
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
                    <td colspan="3">
                        <input class="easyui-textbox" multiline="true"
                               data-options="readonly:true,iconCls:'icon-metro-lock'" value="${userVo.address}"/></td>
                </tr>
                <tr>
                    <td>描述</td>
                    <td colspan="3">
                        <input class="easyui-textbox" multiline="true"
                               data-options="readonly:true,iconCls:'icon-metro-lock'" value="${userVo.description}"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>