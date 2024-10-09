<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/global.jsp" %>
<script type="text/javascript">
    $(function () {
        $('#pid').combotree({
            url: '${ctx}/sysDict/allTree/json',
            parentField: 'pid',
            lines: true,
            panelHeight: 'auto',
            onClick: function (node) {
                if (node.attributes && node.attributes.dictType) {
                    $('#dictType').val(node.attributes.dictType);
                }
            }
        });

        $('#sysDictAddForm').form({
            url: '${ctx}/sysDict/add',
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
                    parent.$.modalDialog.openner_treeGrid.treegrid('reload');
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

    function openIconAllHtml() {
        window.open("${staticPath}/icon/group/icon-all.html");
    }

</script>
<div class="gridDiv">
    <form id="sysDictAddForm" method="post">
        <table class="grid">
            <tr>
                <td>参数</td>
                <td><input name="dictCode" id="dictCode" class="easyui-textbox" prompt="请输入参数名"></td>
                <td>名称</td>
                <td><input name="dictName" class="easyui-textbox" prompt="请输入名称" data-options="required:true"></td>
            </tr>
            <tr>
                <td>上级</td>
                <td><select id="pid" name="dictPid"></select>
                    <a class="easyui-linkbutton" href="javascript:void(0)"
                       onclick="$('#pid').combotree('clear');">清空</a></td>
                <td>类型</td>
                <td colspan="4"><input name="dictType" id="dictType" class="easyui-textbox" prompt="请输入类型名称"
                                       data-options="required:true"></td>
            </tr>
            <tr>
                <td>排序</td>
                <td><input name="dictSeq" class="easyui-numberspinner" value="0" data-options="editable:false"></td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td>描述</td>
                <td colspan="3"><input name="description" multiline="true" class="easyui-textbox"
                                       prompt="请输入描述信息"></input></td>
            </tr>
        </table>
    </form>
</div>