<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>日志管理</title>
    <script type="text/javascript">

        var dataGrid;
        var logTypeTree;

        $(function() {
            logTypeTree = $('#logTypeTree').tree({
                url : '${ctx}/sysLog/allTypeTree/json',
                parentField : 'pid',
                lines : true,
                checkbox : true,
                onCheck : function(node, checked){
                    searchFun();
                }
            });

            dataGrid = $('#dataGrid').datagrid({
                url : '${ctx}/sysLog/dataGrid/json',
                fit : true,
                fitColumns : true,
                striped : true,
                rownumbers : true,
                pagination : true,
                singleSelect : true,
                idField : 'login_id',
                sortName : 'create_date',
                sortOrder : 'desc',
                pageSize : 20,
                pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
                frozenColumns : [ [ {
                    title : '用户编号',
                    field : 'user_id',
                    width : 60
                },{
                    width : '60',
                    title : '登录名',
                    field : 'login_name',
                    sortable : true
                },{
                    width : '60',
                    title : '类型',
                    field : 'logTypeName'
                } ] ],
                columns : [ [ {
                    width : '200',
                    title : '操作代号',
                    field : 'operateCode'
                },{
                    width : '260',
                    title : '请求参数',
                    field : 'requestParam'
                },{
                    width : '60',
                    title : '执行时间',
                    field : 'execute_time',
                    sortable : true
                },{
                    width : '260',
                    title : '描述',
                    field : 'description'
                },{
                    width : '80',
                    title : '操作系统',
                    field : 'os'
                },{
                    width : '80',
                    title : 'IP地址',
                    field : 'ip'
                },{
                    width : '120',
                    title : 'MAC',
                    field : 'mac'
                },{
                    width : '130',
                    title : '创建时间',
                    field : 'create_date',
                    sortable : true
                }] ],
                toolbar : '#toolbar'
            });
        });

        function addFun() {
            parent.$.modalDialog({
                title : '用户添加',
                width : 500,
                height : 400,
                href : '${ctx}/sysUser/addPage',
                buttons : [ {
                    text : '提交',
                    handler : function() {
                        parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#userAddForm');
                        f.submit();
                    }
                } ]
            });
        }

        function deleteFun(id) {
            if (id == undefined) {//点击右键菜单才会触发这个
                var rows = dataGrid.datagrid('getSelections');
                id = rows[0].user_id;
            } else {//点击操作里面的删除图标会触发这个
                dataGrid.datagrid('unselectAll').datagrid('uncheckAll');
            }
            parent.$.messager.confirm('询问', '您确定要删除当前用户？', function(b) {
                if (b) {
                    var currentUserId = '${sessionScope.session_userId}';/*当前登录用户的ID*/
                    if (currentUserId != id) {
                        progressLoad();
                        $.post('${ctx}/sysUser/delete', {
                            id : id
                        }, function(result) {
                            if (result.success) {
                                parent.$.messager.alert('提示', result.msg, 'info');
                                dataGrid.datagrid('reload');
                            }
                            progressClose();
                        }, 'JSON');
                    } else {
                        parent.$.messager.show({
                            title : '提示',
                            msg : '不可以删除自己！'
                        });
                    }
                }
            });
        }

        function editFun(id) {
            if (id == undefined) {
                var rows = dataGrid.datagrid('getSelections');
                id = rows[0].id;
            } else {
                dataGrid.datagrid('unselectAll').datagrid('uncheckAll');
            }
            parent.$.modalDialog({
                title : '用户编辑',
                width : 500,
                height : 400,
                href : '${ctx}/sysUser/editPage?id=' + id,
                buttons : [ {
                    text : '保存',
                    iconCls:'icon-save',
                    handler : function() {
                        parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#userEditForm');
                        f.submit();
                    }
                } ]
            });
        }

        //获取树所有选中项Id(以,分隔)
        function getLogTypeCheckId(){
            var checknodes = logTypeTree.tree('getChecked');
            var checkIds = [];
            for ( var i = 0; i < checknodes.length; i++) {
                if(checknodes[i].attributes && checknodes[i].attributes.dictCode){
                    checkIds.push(checknodes[i].attributes.dictCode);
                }
            }
            return checkIds;
        }

        function searchFun() {
            var parmFilter = $.serializeObject($('#searchForm'));
            //获取日志类型树勾选项
            var checkIds = getLogTypeCheckId();
            if (checkIds){
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
                logTypeTree.tree('uncheck',checknodes[i].target);
            }
        }
    </script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
<div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;">
    <form id="searchForm">
        <table>
            <tr>
                <th>用户名:</th>
                <td><input name="filter_loginName" class="easyui-textbox" prompt="请输入用户名"/></td>
                <th>操作代号:</th>
                <td><input name="filter_operateCode" class="easyui-textbox" prompt="请输入操作代号"/></td>
                <th>创建时间:</th>
                <td>
                    <input name="filter_createDateStart" class="easyui-textbox" prompt="点击选择时间" onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" readonly="readonly" />
                                                   至
                    <input  name="filter_createDateEnd" class="easyui-textbox" prompt="点击选择时间" onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" readonly="readonly" />
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchFun();">查询</a>
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true" onclick="cleanFun();">清空</a>
                </td>
            </tr>
        </table>
    </form>
</div>
<div data-options="region:'center',border:true,title:'日志列表'" >
    <table id="dataGrid" data-options="fit:true,border:false"></table>
</div>
<div data-options="region:'west',border:true,split:false,title:'日志类型'"  style="width:150px;overflow: hidden; ">
    <ul id="logTypeTree" style="width:160px;margin: 10px 10px 10px 10px">
    </ul>
</div>
<div id="toolbar" style="display: none;">
</div>
</body>
</html>