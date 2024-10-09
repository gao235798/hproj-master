<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<script type="text/javascript">
    var resourceTree;
    $(function() {
        resourceTree = $('#resourceTree').tree({
            url : '${ctx}/sysResource/allTree/json',
            parentField : 'pid',
            lines : true,
            checkbox : true,
            cascadeCheck : true,
            onClick : function(node) {
            },
            onLoadSuccess : function(node, data) {
                progressLoad();
                $.post( '${ctx}/sysResource/findResourceIdByRoleId/json', {
                    roleId : '${id}'
                }, function(result) {
                    var ids;
                    if (result.success == true && result.obj != undefined) {
                        ids = $.stringToList(result.obj + '');
                    }
                    if (ids.length > 0) {
                        for ( var i = 0; i < ids.length; i++) {
                            var note = resourceTree.tree('find', ids[i]);
                            if (note != null && note.attributes != null) {
								if (note.attributes.noteType == 'left'){ //叶子节点
                                	resourceTree.tree('check', resourceTree.tree('find', ids[i]).target);
								}
                            }
                        }
                    }
                }, 'json');
                progressClose();
            }
        });

        $('#roleGrantForm').form({
            url : '${ctx}/sysRole/grant',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                var ids = [];
                var checknodes = resourceTree.tree('getChecked');
                if (checknodes && checknodes.length > 0) {
                    for ( var i = 0; i < checknodes.length; i++) {
                        ids.push(checknodes[i].id);
                    }
                }
                var CheckIndeterminate = resourceTree.tree('getChecked','indeterminate'); //半选中状态
                if (CheckIndeterminate && CheckIndeterminate.length > 0) {
                    for ( var i = 0; i < CheckIndeterminate.length; i++) {
                        ids.push(CheckIndeterminate[i].id);
                    }
                }
                $('#resourceIds').val(ids);
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为sysRole.jsp页面预定义好了
                    parent.$.modalDialog.handler.dialog('close');
                    parent.index_menu_tree.tree('reload');
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
    });

    function getAllCheck(){
         var ids = [];
    	 var checknodes = resourceTree.tree('getChecked');
    	 var CheckIndeterminate = resourceTree.tree('getChecked','indeterminate');
         if (checknodes && checknodes.length > 0) {
             for ( var i = 0; i < checknodes.length; i++) {
                 ids.push(checknodes[i].id);
             }
         }
         if (CheckIndeterminate && CheckIndeterminate.length > 0) {
             for ( var i = 0; i < CheckIndeterminate.length; i++) {
                 ids.push(CheckIndeterminate[i].id);
             }
         }
        return ids;
    }

    function checkAll() {
        var nodes = resourceTree.tree('getChecked', 'unchecked');
        if (nodes && nodes.length > 0) {
            for ( var i = 0; i < nodes.length; i++) {
                resourceTree.tree('check', nodes[i].target);
            }
        }
    }
    function uncheckAll() {
        var nodes = resourceTree.tree('getChecked');
        if (nodes && nodes.length > 0) {
            for ( var i = 0; i < nodes.length; i++) {
                resourceTree.tree('uncheck', nodes[i].target);
            }
        }
    }
    function checkInverse() {
        var unchecknodes = resourceTree.tree('getChecked', 'unchecked');
        var checknodes = resourceTree.tree('getChecked');
        if (unchecknodes && unchecknodes.length > 0) {
            for ( var i = 0; i < unchecknodes.length; i++) {
                resourceTree.tree('check', unchecknodes[i].target);
            }
        }
        if (checknodes && checknodes.length > 0) {
            for ( var i = 0; i < checknodes.length; i++) {
                resourceTree.tree('uncheck', checknodes[i].target);
            }
        }
    }

    function expandCollapseAll(){
        var type = $('#expandCollapseAll')[0].value;
        if (type == 1){
        	$('#resourceTree').tree('expandAll');//展开所有
        	$('#expandCollapseAll')[0].value = 0;
        	$('#expandCollapse').linkbutton({ text:'折叠所有' });
        }else if (type == 0){
        	$('#resourceTree').tree('collapseAll');//折叠所有
        	$('#expandCollapseAll')[0].value = 1;
        	$('#expandCollapse').linkbutton({ text:'展开所有' });
        }
    }
</script>
<div id="roleGrantLayout" class="easyui-layout" data-options="fit:true,border:false">
   <div data-options="region:'center',border:false" style="overflow: auto;padding: 5px;">
	   <form id="roleGrantForm" method="post">
	       <input name="id" type="hidden"  value="${id}" readonly="readonly">
	       <ul id="resourceTree"></ul>
	       <input id="resourceIds" name="resourceIds" type="hidden" />
	   </form>
    </div>
        <div>
        	<button id="expandCollapseAll" class="btn btn-success" onclick="expandCollapseAll();" value="0" style="display: none;">展开折叠所有</button>
            <button id="getCheck" class="btn btn-success" onclick="getCheck();" style="display: none;">获取选中项</button>
            <button id="checkAll" class="btn btn-success" onclick="checkAll();" style="display: none;">全选</button>
            <button id="checkInverse" class="btn btn-warning" onclick="checkInverse();" style="display: none;">反选</button>
            <button id="uncheckAll"  class="btn btn-inverse" onclick="uncheckAll();" style="display: none;">取消</button>
        </div>
</div>