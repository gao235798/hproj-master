<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="edge" />
<title>字典管理</title>
<script type="text/javascript">
    var treeGrid;
    $(function() {
        treeGrid = $('#treeGrid').treegrid({
        	url : '${ctx}/sysDict/treeGrid/json',
            fit : true,
            fitColumns : false,
            border : false,
            idField : 'dictId',
            treeField : 'dictName',
            parentField : 'pid',
            frozenColumns : [ [{
            	field : 'dictId',
                title : '编号',
                width : 40,
                hidden:true
            },{
                field: 'dictName',
                title: '名称',
                width: 150
            },{
                field : 'dictCode',
                title : '参数',
                width : 80
            } ] ],
            columns : [ [ {
                field : 'pid',
                title : '上级编号',
                width : 150,
                hidden : true
            },{
                field : 'dictType',
                title : '类型',
                width : 90
            },{
                field : 'dictSeq',
                title : '排序',
                width : 40,
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
                        <shiro:hasPermission name="sys:dict:edit">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="resource-easyui-linkbutton-edit" onclick="editFun(\'{0}\');" >编辑</a>', row.dictId);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="sys:dict:del">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="resource-easyui-linkbutton-del" onclick="deleteFun(\'{0}\');" >删除</a>', row.dictId);
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
                title : '编辑字典',
                width : 500,
                height : 280,
                href : '${ctx}/sysDict/editPage?id=' + node.dictId,
                buttons : [ {
                    text : '保存',
                    iconCls:'icon-save',
                    handler : function() {
                        parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#sysDictEditForm');
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
            parent.$.messager.confirm('询问', '当前删除操作会同下级一起被删除，是否继续？', function(b) {
                if (b) {
                    progressLoad();
                    $.post('${ctx}/sysDict/delete', {
                        id : node.dictId
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
            title : '添加字典',
            width : 500,
            height : 280,
            href : '${ctx}/sysDict/addPage',
            buttons : [ {
                text : '提交',
                handler : function() {
                    parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#sysDictAddForm');
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
            <shiro:hasPermission name="sys:dict:add">
                <a onclick="addFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'">添加</a>
            </shiro:hasPermission>
        </div>
    </div>
</body>
</html>