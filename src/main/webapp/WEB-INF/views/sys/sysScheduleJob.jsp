<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="edge" />
<title>系统定时任务</title>
</head>
<body >
	<div id="tt" class="easyui-tabs">   
	    <div title="计划中的任务" data-options="refreshable: false">   
	        <div id="tb" style="padding:5px;height:auto">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock-add" plain="true" onclick="addFun();">添加</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock-pause" plain="true" onclick="stopFun();">暂停</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock" plain="true" onclick="resumeFun();">恢复</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock-delete" plain="true" onclick="delFun();">删除</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock-edit" plain="true" onclick="editFun();">修改</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-standard-clock-play" plain="true" onclick="startNowFun();">立即运行一次</a>
			</div>
			<table id="dg"></table>   
	    </div>
	    <!--  
	    <div title="运行中的任务" data-options="refreshable: false">   
	        <table id="dg_running"></table>    
	    </div>  
	    --> 
	</div> 
	
	<div id="dlg"></div>
	
<script type="text/javascript">
var dg;
var dg_running;
$(function(){
	dg = $('#dg').datagrid({    
		url:'${ctx}/sysScheduleJob/json', 
	    fit : true,
		fitColumns : true,
		border : false,
		idField : 'id',
		striped:true,
		pagination:true,
		rownumbers:true,
		pageNumber:1,
		pageSize : 20,
		pageList : [ 10, 20, 30, 40, 50 ],
		remoteSort:false,
		singleSelect:true,
	    columns:[[    
        	{field:'name',title:'任务名',sortable:true,width:30},    
	        {field:'group',title:'任务组',sortable:true,width:30},
	        {field:'cronExpression',title:'cron表达式',sortable:true,width:70,editor: "text"},
	        {field:'status',title:'状态',sortable:true,width:30},
	        {field:'className',title:'任务类',sortable:true},
	        {field:'description',title:'描述',sortable:true}
	    ]],
	    toolbar:'#tb',
	    onDblClickRow:function(index, row){
	    	editFun();//双击触发编辑
	    }
	});
	
});

$('#tt').tabs({    
	fit:true,
    border:false,    
    onSelect:function(title,index){    
		if(index==1){
   			dg_running=$('#dg_running').datagrid({    
   		    	url:'${ctx}/sysScheduleJob/running/json', 
    		    fit : true,
    			fitColumns : true,
    			border : false,
    			idField : 'id',
    			striped:true,
    			pagination:true,
    			rownumbers:true,
    			pageNumber:1,
    			pageSize : 20,
    			pageList : [ 10, 20, 30, 40, 50 ],
    			remoteSort:false,
    			singleSelect:true,
    		    columns:[[    
    		        {field:'name',title:'任务名',sortable:true,width:30},    
    		        {field:'group',title:'任务组',sortable:true,width:30},
    		        {field:'cronExpression',title:'cron表达式',sortable:true,width:70,editor: "text"},
    		        {field:'status',title:'状态',sortable:true,width:30},
    		        {field:'className',title:'任务类',sortable:true},
    		        {field:'description',title:'描述',sortable:true}
    		    ]]
    			});
    	}
    }    
});  

//添加
function addFun() {
	parent.$.modalDialog({
    	title : '添加任务',
		width : 300,
		height : 230,
		href : '${ctx}/sysScheduleJob/add',
		buttons : [ {
		    text : '提交',
		    handler : function() {
		        parent.$.modalDialog.openner_dataGrid = dg;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
		        var f = parent.$.modalDialog.handler.find('#jobAddForm');
		        f.submit();
		    }
		} ]
    });
}

//暂停
function stopFun(){
	var row = dg.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '确定要暂停任务？', function(data){
		if(data){
			$.ajax({
				type:'get',
				url:"${ctx}/sysScheduleJob/"+row.name+"/"+row.group+"/stop",
				success: function(result){
					result = $.parseJSON(result);
	               	if (result.success) {
						dg.datagrid('reload');
						$.messager.show({
	                        title : '提示',
	                        msg : result.msg,
	                        timeout : 1000
	                    });
					}else{
						parent.$.messager.alert('提示', result.msg, 'warning');
					}  
				}
			});
		}
	});
}

//恢复
function resumeFun(){
	var row = dg.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '确定要恢复任务？', function(data){
		if(data){
			$.ajax({
				type:'get',
				url:"${ctx}/sysScheduleJob/"+row.name+"/"+row.group+"/resume",
				success: function(result){
					result = $.parseJSON(result);
	               	if (result.success) {
						dg.datagrid('reload');
						$.messager.show({
	                        title : '提示',
	                        msg : result.msg,
	                        timeout : 1000
	                    });
					}else{
						parent.$.messager.alert('提示', result.msg, 'warning');
					}  
				}
			});
		}
	});
}

//删除
function delFun(){
	var row = dg.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '删除后无法恢复您确定要删除？', function(data){
		if(data){
			$.ajax({
				type:'get',
				url:"${ctx}/sysScheduleJob/"+row.name+"/"+row.group+"/delete",
				success: function(result){
					result = $.parseJSON(result);
	               	if (result.success) {
						dg.datagrid('reload');
						$.messager.show({
	                        title : '提示',
	                        msg : result.msg,
	                        timeout : 1000
	                    });
					}else{
						parent.$.messager.alert('提示', result.msg, 'warning');
					}  
				}
			});
		}
	});
}

//修改任务
function editFun(){
	var row = dg.datagrid('getSelected');
	if(rowIsNull(row)) return;
	var id = dg.datagrid('getRowIndex',row);
	var parm = 'name=' + row.name + '&group=' + row.group + '&cronExpression=' + row.cronExpression
				+ '&status=' + row.status + '&className=' + row.className + '&description=' + row.description;
	parent.$.modalDialog({
		title : '编辑任务',
		width : 300,
		height : 250,
		href : '${ctx}/sysScheduleJob/editPage?' + parm,
		buttons : [ {
			text : '保存',
			iconCls:'icon-save',
			handler : function() {
				parent.$.modalDialog.openner_dataGrid = dg;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
				var f = parent.$.modalDialog.handler.find('#jobEditForm');
				f.submit();
	       }
		} ]
	});
}

//立即运行一次
function startNowFun(){
	var row = dg.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '确定要立即运行一次该任务？', function(data){
		if(data){
			$.ajax({
				type:'get',
				url:"${ctx}/sysScheduleJob/"+row.name+"/"+row.group+"/startNow",
				success: function(result){
					result = $.parseJSON(result);
	               	if (result.success) {
						//dg.datagrid('reload');
               			$.messager.show({
	                        title : '提示',
	                        msg : result.msg,
	                        timeout : 1000
	                    });
					}else{
						parent.$.messager.alert('提示', result.msg, 'warning');
					}  
				}
			});
		}
	});
}

</script>
	
</body>
</html>