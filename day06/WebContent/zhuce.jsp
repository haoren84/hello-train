
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'BB.jsp' starting page</title>
  </head>
  <body >
  <form action="ZhuceServlet"method="post" style="padding-top:-700px;">
	   输入用户名:<input name="name" type="text"><br><br>
	   输入密码:<input name="pwd" type="password"><br><br>
	   选择性别:<input type="radio" name="sex" value="1"checked>男
	        <input type="radio" name="sex" value="0">女<br><br>
               填写个人信息:<br>
	   <textarea name="info" rows="5"cols="30"></textarea><br>
	   <input type="reset"value="重置"><input type="submit"value="注册">
   </form>
  </body>