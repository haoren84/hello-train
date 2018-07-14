<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<script type="text/javascript" src="resources/jquery-easyui-1.5.5.4/jquery.min.js"></script>
<script type="text/javascript"
    src="resources/jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>
<link rel="stylesheet"
    href="resources/jquery-easyui-1.5.5.4/themes/default/easyui.css" type="text/css" />
<link rel="stylesheet" href="resources/jquery-easyui-1.5.5.4/themes/icon.css"
    type="text/css" />
<script type="text/javascript"
    src="resources/jquery-easyui-1.5.5.4/locale/easyui-lang-zh_CN.js"></script>
</head>

<body>
    <!--
    一、页面基本架构
    ①toolbar="#toolbar"指定已经写好的工具栏div
    ②singleSelect="true"点击每个行，只能单选
    ③fitColumns="true"每个列的大小适应父类
     -->
    <table id="dg" style="width:800px" title="My Users" rownumbers="true"
        data-options="fit:true" toolbar="#toolbar" fitColumns="true"
        singleSelect="true"></table>
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
            onclick="newUser()">New User</a> <a href="#"
            class="easyui-linkbutton" iconCls="icon-edit" plain="true"
            onclick="editUser()">Edit User</a> <a href="#"
            class="easyui-linkbutton" iconCls="icon-remove" plain="true"
            onclick="destroyUser()">Remove User</a> <input id="searchByName"
            style="line-height:26px;border:1px solid #ccc"> <a href="#"
            class="easyui-linkbutton" plain="true" iconCls="icon-search"
            onclick="doSearch()">Search</a>
    </div>
    <!-- 
    二、增
    ①validType="email",自动附带邮件的正则表达式
    ②required="true"，要求为必填
     -->
    <div id="dlg" class="easyui-dialog"
        style="width:400px;height:280px;padding:10px 20px" closed="true"
        buttons="#dlg-buttons">
        <div class="ftitle">User Information</div>
        <form id="fm" method="post">
            <div class="fitem">
                <label>Name:</label> <input name="Name" class="easyui-validatebox"
                    required="true">
            </div>
            <br>
            <div class="fitem">
                <label>Email:</label> <input name="Email" class="easyui-validatebox"
                    validType="email">
            </div>
            <br>
            <div class="fitem">
                <label>Salary:</label> <input name="Salary"
                    class="easyui-validatebox">
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="#" class="easyui-linkbutton" iconCls="icon-ok"
            onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
            iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
    </div>

    <script type="text/javascript" src="resources/js/fun.js"></script>
    <script type="text/javascript" src="resources/js/search.js"></script>

</body>
</html>
