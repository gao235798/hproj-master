<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.espread.common.constant.Global"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
	request.setAttribute("adminPath", Global.getAdminPath());
%>
<html>
	<head>
		<title>ERP接口管理平台</title>
		<script src="${ctx}/static/plugins/easyui/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${ctx}/static/css/login.css" />
		<script type="text/javascript">
			$(function() {
				$("document").ready(function(){
					//防止在frame里面出现登录页面
					if(top.location != self.location){
						top.location.href=self.location.href;
					}
				});
			});
			var captcha;
			function refreshCaptcha(){
				document.getElementById("img_captcha").src="${ctx}/static/images/kaptcha.jpg?t=" + Math.random();
			}
		</script>
	</head>
	<body>
		<div class="main">
			<div class="logDiv">
				<h1>ERP接口管理平台</h1>
				<div class="logGet">
										
					<form id="loginForm" action="${ctx}${adminPath}/login" method="post">
							<h2>${msg}</h2>
						<div class="lgD">
							<img class="img1" src="${ctx}/static/images/login/logName.png" /><input type="text" name="username"  placeholder="输入用户名"  value="001" >
						</div class="lgD">
						<div class="lgD">
							<img class="img1" src="${ctx}/static/images/login/logPwd.png" /><input type="password" name="password" placeholder="输入用户密码"    value="123456">
						</div>
						<div class="lgD">
							<input type="text" name="captcha" class="text" placeholder="输入验证码"  value="" style="text-indent: 0rem; width: 50%;margin: 0px"/>
							<img alt="验证码" src="${ctx}/static/images/kaptcha.jpg" style="height:43px;width:39%;margin-left: 3px;vertical-align:bottom;" title="点击更换" id="img_captcha" onclick="javascript:refreshCaptcha();" />
						</div>
						<div class="sign">
							<input type="submit" value="登        录"  class="submit" />
						</div>
					</form>
				</div>
			</div>
		</div>

		<div class="copy-right ">
			<p >&copy; Copyright © 2019 power by Hoann</p>
		</div>
	</body>
</html>