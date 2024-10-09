<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="edge" />
<title>机构管理</title>
<script type="text/javascript">
    var treeGrid;
    $(function() {
        treeGrid = $('#treeGrid').treegrid({
        	url : '${ctx}/sysOrg/treeGrid/json',
            fit : true,
            fitColumns : false,
            border : false,
            idField : 'orgId',
            treeField : 'orgName',
            parentField : 'pid',
            frozenColumns : [ [{
            	field : 'orgId',
                title : '编号',
                width : 80 ,
                hidden:true
            },{
            	field : 'orgName',
                title : '名称',
                width : 180
            } ] ],
            columns : [ [ {
            	field : 'orgAddress',
                title : '地址',
                width : 200
                
            },{
            	field : 'orgLevel',
                title : '部门级别',
                width : 150,
                hidden : true
            },{
                field : 'orgSeq',
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
                        <shiro:hasPermission name="sys:org:edit">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="org-easyui-linkbutton-edit" onclick="editFun(\'{0}\');" >编辑</a>', row.orgId);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="sys:org:del">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="org-easyui-linkbutton-del" onclick="deleteFun(\'{0}\');" >删除</a>', row.orgId);
                        </shiro:hasPermission>
                    return str;
                }
            } ] ],
            onLoadSuccess:function(data){
                $('.org-easyui-linkbutton-edit').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
                $('.org-easyui-linkbutton-del').linkbutton({text:'删除',plain:true,iconCls:'icon-del'});
            },
            toolbar : '#toolbar'
        });
    });

    function addFun() {
        parent.$.modalDialog({
            title : '添加机构',
            width : 500,
            height : 260,
            href : '${ctx}/sysOrg/addPage',
            buttons : [ {
                text : '提交',
                handler : function() {
                    parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#sysOrgAddForm');
                    f.submit();
                }
            } ]
        });
    }
    
    function editFun(id) {
        if (id != undefined) {
            treeGrid.treegrid('select', id);
        }
        var node = treeGrid.treegrid('getSelected');
        if (node) {
            parent.$.modalDialog({
                title : '编辑机构',
                width : 500,
                height : 260,
                href : '${ctx}/sysOrg/editPage?id=' + node.orgId,
                buttons : [ {
                    text : '保存',
                    iconCls:'icon-save',
                    handler : function() {
                        parent.$.modalDialog.openner_treeGrid = treeGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find('#sysOrgEditForm');
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
            parent.$.messager.confirm('询问', '您是否要删除当前机构？删除当前资源会连同下属机构一起删除!', function(b) {
                if (b) {
                    progressLoad();
                    $.post('${ctx}/sysOrg/delete', {
                        id : node.orgId
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
    
    </script>
</head>
<body>
    <div class="easyui-layout" data-options="fit:true,border:false">
        <div data-options="region:'center',border:false"  style="overflow: hidden;">
            <table id="treeGrid"></table>
        </div>
        
        <div id="toolbar" style="display: none;">
            <shiro:hasPermission name="sys:org:add">
                <a onclick="addFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'">添加机构</a>
            </shiro:hasPermission>
        </div>
    </div>
</body>
</html>