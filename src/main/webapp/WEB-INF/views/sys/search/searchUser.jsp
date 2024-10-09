<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>

<script type="text/javascript">
    $(function() {

    	   dataGrid = $('#dataGrid').datagrid({
               url : '${ctx}/sysUser/dataGrid/json',
               fit : true,
               fitColumns : true,
               striped : true,
               rownumbers : true,
               pagination : true,
               singleSelect : true,
               idField : 'user_id',
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
                   width : 130
                  
               }] ]
           });
      
    });
    function searchFun() {
    	var parmFilter = $.serializeObject($('#searchForm'));
		<%-- for(parm in parmFilter){--%>
		<%-- 	alert(parm + ":" + parmFilter[parm]);--%>
		<%-- }--%>
		<%--
		//获取机构树勾选项
		var orgIds = getOrgCheckId();
		if (orgIds){
			parmFilter['filter_orgId'] = orgIds;
		}
		--%>
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
  
<div class="easyui-layout" data-options="fit:true,border:false">
  <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;">
        <form id="searchForm">
            <table>
                <tr>
                    <th>用户名:</th>
                    <td><input name="filter_loginName" class="easyui-textbox" prompt="请输入用户名"/></td>
                    <th>姓名:</th>
                    <td><input name="filter_userName" id="filter_userName" class="easyui-textbox" prompt="请输入用户姓名"/></td>
                    <th></th>
                    <td>
                    
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchFun();">查询</a>
                    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true" onclick="cleanFun();">清空</a>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div class="gridDiv" data-options="region:'center',border:false,title:'用户列表'">
      
       
        <table id="dataGrid" data-options="fit:true,border:false"></table>
   
    
      
     </div>
</div>