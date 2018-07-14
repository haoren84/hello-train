<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<!-- 引入JQuery -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/jquery-easyui-1.5.5.4/jquery.min.js"></script>
	<!-- 引入EasyUI -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>
	<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/jquery-easyui-1.5.5.4/locale/easyui-lang-zh_CN.js"></script>
	<!-- 引入EasyUI的样式文件-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/jquery-easyui-1.5.5.4/themes/default/easyui.css" type="text/css"/>
	<!-- 引入EasyUI的图标样式文件-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/jquery-easyui-1.5.5.4/themes/icon.css" type="text/css"/>
</head>
<body>
	<form action="../src/LoginServlet.java" method="get">
	    <input name="Username" type="text" value="">
	    <input name="Password" type="password" value="">
	    <input name="Login" type="submit" value="Login">
	</form>
</body>
</html>