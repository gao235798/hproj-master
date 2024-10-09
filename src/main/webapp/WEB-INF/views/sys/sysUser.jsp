<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>用户管理</title>
  <script type="text/javascript">

    var dataGrid;
    var orgTree;

 
    
    $(function() {
    	/**
    	//单击文本框，弹出对话框，选择数据返回
        $("input",$("#filter_userName").next("span")).click(function(){
        	  alert("2");
      	  parent.$.modalDialog({
                title : '用户选择',
                width : 800,
                height : 680,
                href : '${ctx}/sysUser/searchUser',
                buttons : [ {
                    text : '提交',
                    handler : function() {
                       
                        //var f = parent.$.modalDialog.handler.find('#userAddForm');
                        var row = parent.$.modalDialog.handler.find('#dataGrid').datagrid('getSelected');
                        if (row){
                        	alert('user_id:'+row.user_id+"login_name:"+row.login_name,+"user_name:"+row.user_name);
                        }
                        parent.$.modalDialog.handler.dialog('close');
                    }
                } ]
            });
        });
    	
       */
		/*
    	//下拉模糊查询
    	$('#roleIds').combobox({
            prompt:'输入首关键字自动检索',
            required:false,
            url: '${ctx}/sysRole/allTree/json',
            editable:true,
            hasDownArrow:true,
            filter: function(q, row){
                var opts = $(this).combobox('options');
                return row[opts.textField].indexOf(q) >= 0;
            }
   
        });

		*/
    	orgTree = $('#orgTree').tree({
        	url : '${ctx}/sysOrg/allTree/json',
            parentField : 'pid',
            lines : true,
            checkbox : true,
            onCheck : function(node, checked){
        		searchFun();
        	}
        });

        dataGrid = $('#dataGrid').datagrid({
            url : '${ctx}/sysUser/dataGrid/json',
            fit : true,
            fitColumns : true,//自适应宽度
            striped : true,//隔行变色
            rownumbers : true,//行号显示
            pagination : true, //启用分页
            singleSelect : true,
            idField : 'user_id',//指示哪个字段是标识字段。
            sortName : 'create_date',
            sortOrder : 'asc',
            pageSize : 20,
            pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
            frozenColumns : [ [ {
                title : '用户Id',
                field : 'user_id',
                width : 40,
                hidden : true
            },{
                width : '80',
                title : '登录名',
                field : 'login_name',
                sortable : true
            },{
                width : '80',
                title : '姓名',
                field : 'user_name',
                sortable : true
            } ] ],
            columns : [ [ {
                width : '130',
                title : '创建时间',
                field : 'create_date',
                sortable : true
            },{
                width : '50',
                title : '性别',
                field : 'sex',
                sortable : true,
                formatter : function(value, row, index) {
                    switch (value) {
                    case "1":
                        return '男';
                    case "2":
                        return '女';
                    }
                }
            },{
                width : '120',
                title : '电话',
                field : 'phone',
                sortable : true
            },{
                width : '80',
                title : '机构代号',
                field : 'org_id',
                hidden : true
            },{
                width : '120',
                title : '机构名称',
                field : 'sysOrg',
                formatter : function(value, row, index) {
                    var orgs = [];
                    if (value != null){
	                    var orgName = value.orgName;
	                    orgs.push(orgName);
	                    return (orgs.join('\n'));
                    }
                    return "";
                }
            },{
                width : '200',
                title : '角色',
                field : 'roleList',
                formatter : function(value, row, index) {
                    var roles = [];
                    for(var i = 0; i< value.length; i++) {
                        var roleName = value[i].roleName;
                        if(i != 0){
                            roleName = "," + roleName;
                        }
                        roles.push(roleName);
                    }
                    return (roles.join('\n'));
                }
            },{
                width : '60',
                title : '状态',
                field : 'user_status',
                sortable : true,
                formatter : function(value, row, index) {
                    switch (value) {
                    case "1":
                        return '正常';
                    case "0":
                        return '停用';
                    }
                }
            },{
                width : '80',
                title : '登陆次数',
                field : 'login_count',
                sortable : true,
                hidden : true
            },{
                width : '120',
                title : '最后登陆时间',
                field : 'lastvisit_date',
                sortable : true,
                hidden : true
            },{
                width : '80',
                title : '地址',
                field : 'address',
                hidden : true
            },{
                width : '80',
                title : '描述',
                field : 'description'
            },{
                field : 'action',
                title : '操作',
                width : 130,
                formatter : function(value, row, index) {
                    var str = '';
                    var permissionCount = 0 ;
                        <shiro:hasPermission name="sys:user:edit">
                        	permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="user-easyui-linkbutton-edit" onclick="editFun(\'{0}\');" >编辑</a>', row.user_id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="sys:user:del">
                       		permissionCount == 1 ? str += '&nbsp;|&nbsp;' : permissionCount ++ ;
                            str += $.formatString('<a class="user-easyui-linkbutton-del" onclick="deleteFun(\'{0}\');" >删除</a>', row.user_id);
                        </shiro:hasPermission>
                    return str;
                }
            }] ],
            onLoadSuccess:function(data){
                $('.user-easyui-linkbutton-edit').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
                $('.user-easyui-linkbutton-del').linkbutton({text:'删除',plain:true,iconCls:'icon-del'});
            },
            toolbar : '#toolbar'
        });
    });

    function addFun() {
        parent.$.modalDialog({
            title : '用户添加',
            width : 500,
            height : 380,
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
            height : 380,
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

  	//获取机构树所有选中项Id(以,分隔)
    function getOrgCheckId(){
    	var checknodes = orgTree.tree('getChecked');
        var orgIds = [];
        for ( var i = 0; i < checknodes.length; i++) {
            orgIds.push(checknodes[i].id);
        }

        return orgIds;
    }
	

 
    function searchFun() {
    	var parmFilter = $.serializeObject($('#searchForm'));
		//获取机构树勾选项
		var orgIds = getOrgCheckId();
		if (orgIds)
		{
			parmFilter['filter_orgId'] = orgIds;
		}
		
        dataGrid.datagrid('load', parmFilter);
    }

    function cleanFun() {
        $('#searchForm input').val('');
        dataGrid.datagrid('load', {});
        //取消机构树勾选
        var checknodes = orgTree.tree('getChecked');
        for (var i = 0; i < checknodes.length; i++) {
	        orgTree.tree('uncheck',checknodes[i].target);
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
                    <th>姓名:</th>
                    <td>
                    	<input name="filter_userName"     class="easyui-textbox" prompt="请输入用户姓名"/>
                    <!-- 
                    	<input name="filter_userName" id="filter_userName"   data-options="iconCls:'icon-search'"  readonly="readonly" class="easyui-textbox" prompt="请输入用户姓名"/>
                   -->
                    </td>
                    <th>创建时间:</th>
                    <td>
                    <input name="filter_createDateStart" type="text"   class="Wdate" prompt="点击选择时间" onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" readonly="readonly" />
                    	至
                    <input  name="filter_createDateEnd" type="text"    class="Wdate" prompt="点击选择时间" onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" readonly="readonly" />
<!--  
<input class="easyui-combobox" name="roleIds" id="roleIds" data-options="valueField:'id',textField:'text',panelHeight:'auto',panelMaxHeight:200,panelMinHeight:100"  />
-->
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchFun();">查询</a>
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true" onclick="cleanFun();">清空</a>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div data-options="region:'center',border:true,title:'用户列表'" >
        <table id="dataGrid" data-options="fit:true,border:false"></table>
    </div>
    <div data-options="region:'west',border:true,split:false,title:'组织机构'"  style="width:150px;overflow: hidden; ">
        <ul id="orgTree" style="width:160px;margin: 10px 10px 10px 10px">
        </ul>
    </div>
    <div id="toolbar" style="display: none;">
        <shiro:hasPermission name="sys:user:add">
            <a onclick="addFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'">添加用户</a>
        </shiro:hasPermission>
    </div>
</body>
</html>