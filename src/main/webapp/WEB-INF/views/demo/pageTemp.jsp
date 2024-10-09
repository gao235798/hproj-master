<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>DataGrid前台分页</title>
    <script type="text/javascript">
        $(function() {
            $('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());
        });                                         

        function getData(){//模拟数据
            var rows = [];
            for(var i=1; i<=80000; i++){
                var amount = Math.floor(Math.random()*1000);
                var price = Math.floor(Math.random()*1000);
                rows.push({
                    inv: 'Inv No '+i,
                    date: $.fn.datebox.defaults.formatter(new Date()),
                    name: '姓名 '+i,
                    amount: amount,
                    price: price,
                    cost: amount*price,
                    note: 'Note '+i
                });
            }
            //console.log(JSON.stringify(rows));
            return rows;

        }

        function pagerFilter(data){
            if (typeof data.length == 'number' && typeof data.splice == 'function'){    // 判断数据是否是数组
                data = {
                    total: data.length,
                    rows: data
                }
            }
            var dg = $(this);
            var opts = dg.datagrid('options');
            var pager = dg.datagrid('getPager');
            pager.pagination({
                onSelectPage:function(pageNum, pageSize){
                    opts.pageNumber = pageNum;
                    opts.pageSize = pageSize;
                    pager.pagination('refresh',{
                        pageNumber:pageNum,
                        pageSize:pageSize
                    });
                    dg.datagrid('loadData',data);
                }
            });
            if (!data.originalRows){
                data.originalRows = (data.rows);
            }
            var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = (data.originalRows.slice(start, end));
            return data;
        }

    </script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
<table id="dg" title="Client Side Pagination" style="width:700px;height:300px" data-options="
                fit : true,
                fitColumns : true,
                striped : true,
                rownumbers : true,
                pagination : true,
                singleSelect : true,
                pageSize:10">
    <thead>
        <tr>
            <th field="inv" width="80">Inv No</th>
            <th field="date" width="100">Date</th>
            <th field="name" width="80">Name</th>
            <th field="amount" width="80" align="right">Amount</th>
            <th field="price" width="80" align="right">Price</th>
            <th field="cost" width="100" align="right">Cost</th>
            <th field="note" width="110">Note</th>
        </tr>
    </thead>
</table>
</body>
</html>