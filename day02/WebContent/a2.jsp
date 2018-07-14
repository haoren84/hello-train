<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<!-- 引入JQuery -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.4/jquery.min.js"></script>
	<!-- 引入EasyUI -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>
	<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.4/locale/easyui-lang-zh_CN.js"></script>
	<!-- 引入EasyUI的样式文件-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.4/themes/default/easyui.css" type="text/css"/>
	<!-- 引入EasyUI的图标样式文件-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.4/themes/icon.css" type="text/css"/>
</head>
<body>
	<div class="easyui-panel" title="注册" style="width:100%;max-width:300px;padding:30px 60px;">
		<form id="ff" method="post" >  
	        <div style="margin-bottom:20px">
	            <label for="username">用户名:</label>
	            <input id="username" class="easyui-validatebox" data-options="prompt:'请输入用户名.',required:true,validType:'length[3,10]'">
	        </div>
	        <div style="margin-bottom:20px">
	            <label for="email">邮箱:</label>
	            <input id="email" class="easyui-validatebox" data-options="prompt:'请输入正确的邮箱.',required:true,validType:'email'">
	        </div>
	        <div style="margin-bottom:20px">
	            <label for="phone">手机:</label>
	            <input id="phone" class="easyui-validatebox" data-options="prompt:'请输入你的手机号.',required:true">
	        </div>
        </form>
        <div style="text-align:center;padding:5px 0">
            <a href="#" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">注册</a>
            <a href="#" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">清除</a>
        </div>
    </div>
    <script>
        $(function(){
            $('input.easyui-validatebox').validatebox({
                validateOnCreate: false,
                err: function(target, message, action){
                    var opts = $(target).validatebox('options');
                    message = message || opts.prompt;
                    $.fn.validatebox.defaults.err(target, message, action);
                }
            });
            
        });
        function submitForm(){
	        $('#ff').form('submit');
	    }
	    function clearForm(){
	        $('#ff').form('clear');
	    }
    </script>
</body>
</html>