<%--标签 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/global.jsp"%>
<meta http-equiv="X-UA-Compatible" content="edge" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

<%--浏览器中地址栏左侧显示的图标--%>
<link rel="shortcut icon" href="${staticPath}/images/core/favicon.ico" />
<!-- jQuery -->
<script type="text/javascript" src="${staticPath}/plugins/easyui/jquery.min.js" charset="utf-8"></script>
<!-- 核心JS -->
<script type="text/javascript" src="${staticPath}/js/main.js" charset="utf-8"></script>
<!-- my97日期时间控件 -->
<script type="text/javascript" src="${staticPath}/plugins/My97DatePicker/My97DatePicker/WdatePicker.js" charset="utf-8"></script>

<!-- EasyUI begin -->
<script type="text/javascript" src="${staticPath}/plugins/easyui/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
<link rel="stylesheet" id="themeCss" type="text/css" rel="stylesheet" href="${easyuiPath}/themes/<c:out value="${cookie.themeName.value}" default="gray"/>/easyui.css">
<link rel="stylesheet" type="text/css" href="${staticPath}/plugins/easyui/themes/icon.css">
<!-- 扩展组件 -->
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/jquery.edatagrid.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.combotree.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.datagrid.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.dialog.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.tree.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.treegrid.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticPath}/plugins/easyui/extension/easyui.ext.validatebox.js" charset="utf-8"></script>
<!-- Easyui End -->

<!-- 扩展样式 -->
<link rel="stylesheet" type="text/css" href="${staticPath}/css/common.css" />
<link rel="stylesheet" type="text/css" href="${staticPath}/icon/group/icon-all.css" />
<link rel="stylesheet" type="text/css" href="${staticPath}/icon/icommon.css" />

