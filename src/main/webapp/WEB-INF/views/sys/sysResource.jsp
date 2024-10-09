<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="edge" />
<title>资源管理</title>
<script type="text/javascript">
    var treeGrid;
    $(function() {
        treeGrid = $('#treeGrid').treegrid({
        	url : '${ctx}/sysResource/treeGrid/json',
            fit : true,
            fitColumns : false,
            border : false,
            idField : 'resourceId',
            treeField : 'resourceName',
            parentField : 'pid',
            frozenColumns : [ [{
            	field : 'resourceId',
                title : '编号',
                width : 40,
                hidden:true
            },{
            	field : 'resourceName',
                title : '资源名称',
                width : 180
            } ] ],
            columns : [ [ {
            	field : 'url',
                title : '资源路径',
                width : 200
                
            },{
            	field : 'permCode',
                title : '权限编号',
                width : 150
            },{
                field : 'iconCls',
                title : '资源图标',
                width : 90,
                hidden : true
            },{
                field : 'resourceType',
                title : '资源类型',
                width : 80,
                formatter : function(value, row, index) {
                    switch (value) {
                    case '1':
                        return '菜单';
                    case '2':
                        return '按钮';
                    }
                }
            },{
                field : 'pid',
                title : '上级资源ID',
                width : 150,
                hidden : true
            },{
                field : 'resourceStatus',
                title : '资源状态',
                width : 60,
                formatter : function(value, row, index) {
                    switch (value) {
                    case '1':
                        return '正常';
                    case '0':
                        return '停用';
                    }
                }
            },{
                field : 'resourceSeq',
                title : '排序',
                width : 40,
                hidden : true
            },{
                field : 'resourceLevel',
                title : '资源级别',
                width : 150,
                hidden : true
            },{
                field : 'description',
                title : '描述信息',
                width : 150
            },{
                field : 'action',
                title : '操作',
                width : 160,
                formatter : function(value, row, index) {
                    var str = '';
                    var permissionCount = 0 ;
                        <shiro:hasPermission name="sys:resource:edit">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="resource-easyui-linkbutton-edit" onclick="editFun(\'{0}\');" >编辑</a>', row.resourceId);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="sys:resource:del">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="resource-easyui-linkbutton-del" onclick="deleteFun(\'{0}\');" >删除</a>', row.resourceId);
                        </shiro:hasPermission>
                    return str;
                }
            } ] ],
            onLoadSuccess:function(data){
                $('.resource-easyui-linkbutton-edit').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
                $('.resource-easyui-linkbutton-del').linkbutton({text:'删除',plain:true,iconCls:'icon-del'});
            },
            toolbar : '#toolbar'
        });
    });
    
    function editFun(id) {
        if (id != undefined) {
            treeGrid.treegrid('select', id);
        }
        var node = treeGrid.treegrid('getSelected');
        if (node) {
            parent.$.modalDialog({
                title : '编辑资源',
                width : 500,
                height : 330,
                href : '${ctx}/sysResource/editPage?id=' + node.resourceId,
                buttons : [ {
                    text : '保存',
                    iconCls:'icon-save',
                    handler : function() {
                        parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#sysResourceEditForm');
                        f.submit();
                    }
                } ]
            });
        }
    }
    
    function deleteFun(id) {
        if (id != undefined) {
            treeGrid.treegrid('select', id);
        }
        var node = treeGrid.treegrid('getSelected');
        if (node) {
            parent.$.messager.confirm('询问', '您是否要删除当前资源？删除当前资源会连同子资源一起删除!', function(b) {
                if (b) {
                    progressLoad();
                    $.post('${ctx}/sysResource/delete', {
                        id : node.resourceId
                    }, function(result) {
                        if (result.success) {
                            parent.$.messager.alert('提示', result.msg, 'info');
                            treeGrid.treegrid('reload');
                        }else{
                            parent.$.messager.alert('提示', result.msg, 'info');
                        }
                        progressClose();
                    }, 'JSON');
                }
            });
        }
    }
    
    function addFun() {
        parent.$.modalDialog({
            title : '添加资源',
            width : 500,
            height : 330,
            href : '${ctx}/sysResource/addPage',
            buttons : [ {
                text : '提交',
                handler : function() {
                    parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#sysResourceAddForm');
                    f.submit();
                }
            } ]
        });
    }
    </script>
</head>
<body>
    <div class="easyui-layout" data-options="fit:true,border:false">
        <div data-options="region:'center',border:false"  style="overflow: hidden;">
            <table id="treeGrid"></table>
        </div>
        
        <div id="toolbar" style="display: none;">
            <shiro:hasPermission name="sys:resource:add">
                <a onclick="addFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'">添加资源</a>
            </shiro:hasPermission>
        </div>
    </div>
</body>
</html>