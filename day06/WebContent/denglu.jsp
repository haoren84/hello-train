<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录注册页面</title>
<style type="text/css">
	#f1,#f2{
		width: 280px;
		border: 2px solid #666;
	}
	#f1{
		border-bottom: 0;
	}
	#f2{
		border-top: 0;
		margin-top: -2px;
	}
</style>
</head>
<body>
	<form id="f1" action="DengluServlet" method="post">
		用户名：<input type="text" name="name"value="" /><br/><br/>
		密&nbsp;&nbsp;码：  <input type="password" name="pwd"value="" /><br/><br/>
		<input type="submit"value="登录"name="denglu">
		<input type="reset"value="重置"><br/><br/>
	</form>
	<form id="f2" action="zhuce.jsp">
		<input type="submit"value="新用户注册" />
	</form>
</body>
</html>