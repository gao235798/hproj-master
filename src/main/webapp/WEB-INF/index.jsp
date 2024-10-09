<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.espread.common.constant.Global"%>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<%
	request.setAttribute("adminPath", Global.getAdminPath());
%>
<html>
  <body>
    <script type="text/javascript">
    	//进入后台管理首页
    	document.location = "${ctx}${adminPath}";
    </script>
  </body>
</html>
