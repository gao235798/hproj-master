<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>日志管理</title>
    <script type="text/javascript">

        var dataGrid;
        var logTypeTree;

        $(function () {
            logTypeTree = $('#logTypeTree').tree({
                url: '${ctx}/sysQrtzLog/allTypeTree/json',
                parentField: 'pid',
                lines: true,
                checkbox: true,
                onCheck: function (node, checked) {
                    searchFun();
                }
            });

            dataGrid = $('#dataGrid').datagrid({
                url: '${ctx}/sysQrtzLog/dataGrid/json',
                fit: true,
                fitColumns: true,
                striped: true,
                rownumbers: true,
                pagination: true,
                singleSelect: true,
                idField: 'log_id',
                sortName: 'create_date',
                sortOrder: 'desc',
                pageSize: 20,
                pageList: [10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
                frozenColumns: [[{
                    width: '150',
                    title: '类型',
                    field: 'logTypeName'
                }]],
                columns: [[{
                    width: '200',
                    title: '单号',
                    field: 'codeNo'
                }, {
                    width: '80',
                    title: '状态',
                    field: 'logStatus'
                }, {
                    width: '80',
                    title: '类型代码',
                    field: 'logType',
                    hidden: true

                }, {
                    width: '400',
                    title: '描述',
                    field: 'description'
                }, {
                    width: '130',
                    title: '创建时间',
                    field: 'create_date',
                    sortable: true
                }, {

                    field: 'action',
                    title: '操作',
                    width: 30,
                    formatter: function (value, row, index) {
                        var str = '';
                        var permissionCount = 0;
                        <shiro:hasPermission name="sys:qtrzLog:edit">
                        permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount++;
                        str += $.formatString('<a class="user-easyui-linkbutton-edit" onclick="editFun(\'{0}\');" >重发</a>', row.logType + '=' + row.codeNo + '=' + row.logStatus);
                        </shiro:hasPermission>

                        return str;
                    }
                }]],
                onLoadSuccess: function (data) {
                    $('.user-easyui-linkbutton-edit').linkbutton({text: '重发', plain: true, iconCls: 'icon-redo'});

                },
                toolbar: '#toolbar',
            });
        });

        function addFun() {
            parent.$.modalDialog({
                title: '用户添加',
                width: 500,
                height: 400,
                href: '${ctx}/sysUser/addPage',
                buttons: [{
                    text: '提交',
                    handler: function () {
                        parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#userAddForm');
                        f.submit();
                    }
                }]
            });
        }

        function deleteFun(id) {
            if (id == undefined) {//点击右键菜单才会触发这个
                var rows = dataGrid.datagrid('getSelections');
                id = rows[0].user_id;
            } else {//点击操作里面的删除图标会触发这个
                dataGrid.datagrid('unselectAll').datagrid('uncheckAll');
            }
            parent.$.messager.confirm('询问', '您确定要删除当前用户？', function (b) {
                if (b) {
                    var currentUserId = '${sessionScope.session_userId}';/*当前登录用户的ID*/
                    if (currentUserId != id) {
                        progressLoad();
                        $.post('${ctx}/sysUser/delete', {
                            id: id
                        }, function (result) {
                            if (result.success) {
                                parent.$.messager.alert('提示', result.msg, 'info');
                                dataGrid.datagrid('reload');
                            }
                            progressClose();
                        }, 'JSON');
                    } else {
                        parent.$.messager.show({
                            title: '提示',
                            msg: '不可以删除自己！'
                        });
                    }
                }
            });
        }

        function editFun(id) {
            if (id == undefined) {//点击右键菜单才会触发这个
                var rows = dataGrid.datagrid('getSelections');
                id = rows[0].user_id;
            } else {//点击操作里面的删除图标会触发这个
                dataGrid.datagrid('unselectAll').datagrid('uncheckAll');
            }

            var row = dataGrid.datagrid('getSelections');

            var arr = id.split("=")
            if (arr[0] == '2') {
                parent.$.messager.show({
                    title: '提示',
                    msg: '该类型单据无需重发！'
                });
                return;
            }

            if (arr[0] == '3') {
                parent.$.messager.show({
                    title: '提示',
                    msg: '该类型单据无需重发！'
                });
                return;
            }
            if (arr[0] == '4') {
                parent.$.messager.show({
                    title: '提示',
                    msg: '该类型单据无需重发！'
                });
                return;
            }
            if (arr[2] == '成功') {

                parent.$.messager.show({
                    title: '提示',
                    msg: '单据为成功状态，无需重发！'
                });
                return;
            }

            parent.$.messager.confirm('询问', '您确定要重发此单据吗？', function (b) {
                if (b) {

                    progressLoad();
                    $.post('${ctx}/sysQrtzLog/edit', {
                        code: arr[1], logType: arr[0]
                    }, function (result) {
                        if (result.success) {
                            parent.$.messager.alert('提示', result.msg, 'info');
                            dataGrid.datagrid('reload');
                        }
                        progressClose();
                    }, 'JSON');

                }
            });

        }

        //获取树所有选中项Id(以,分隔)
        function getLogTypeCheckId() {
            var checknodes = logTypeTree.tree('getChecked');
            var checkIds = [];
            for (var i = 0; i < checknodes.length; i++) {
                if (checknodes[i].attributes && checknodes[i].attributes.dictCode) {
                    checkIds.push(checknodes[i].attributes.dictCode);
                }
            }
            return checkIds;
        }

        function searchFun() {
            var parmFilter = $.serializeObject($('#searchForm'));
            //获取日志类型树勾选项
            var checkIds = getLogTypeCheckId();
            if (checkIds) {
                parmFilter['filter_logType'] = checkIds;
            }
            dataGrid.datagrid('load', parmFilter);
        }

        function cleanFun() {
            $('#searchForm input').val('');
            dataGrid.datagrid('load', {});
            //取消日志类型树勾选
            var checknodes = logTypeTree.tree('getChecked');
            for (var i = 0; i < checknodes.length; i++) {
                logTypeTree.tree('uncheck', checknodes[i].target);
            }
        }
    </script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
<div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;">
    <form id="searchForm">
        <table>
            <tr>
                <th>单号:</th>
                <td><input name="filter_operateCode" class="easyui-textbox" prompt="请输入操作代号"/></td>
                <th>创建时间:</th>
                <td>
                    <input name="filter_createDateStart" type="text" class="Wdate" prompt="点击选择时间"
                           onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" readonly="readonly"/>
                    至
                    <input name="filter_createDateEnd" type="text" class="Wdate" prompt="点击选择时间"
                           onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" readonly="readonly"/>

                    <a href="javascript:void(0);" class="easyui-linkbutton"
                       data-options="iconCls:'icon-search',plain:true" onclick="searchFun();">查询</a>
                    <a href="javascript:void(0);" class="easyui-linkbutton"
                       data-options="iconCls:'icon-cancel',plain:true" onclick="cleanFun();">清空</a>
                </td>
            </tr>
        </table>
    </form>
</div>
<div data-options="region:'center',border:true,title:'日志列表'">
    <table id="dataGrid" data-options="fit:true,border:false">
    </table>
</div>
<div data-options="region:'west',border:true,split:false,title:'日志类型'" style="width:200px;overflow: hidden; ">
    <ul id="logTypeTree" style="width:160px;margin: 10px 10px 10px 10px">
    </ul>
</div>
<div id="toolbar" style="display: none;">
</div>
</body>
</html>