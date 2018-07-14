<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>   
<% 
	String url="jdbc:mysql://localhost:3306/easyui";    //声明JDBC使用的数据库的URL
	String user="root";       //数据库用户名
    String pwd="root1234";    //数据库密码
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection(url,user,pwd);
    Statement stmt=conn.createStatement();
    String sql="select * from users";
    ResultSet rs=stmt.executeQuery(sql);
     
    List<String> list = new ArrayList<String>();         //list
    while(rs.next()){//遍历结果集
    	list.add (rs.getString("firstname"));
    }
    out.println("打印 list:");
    out.print(list);
     
    //关闭资源
    rs.close();   
    stmt.close();   
    conn.close();
%> 