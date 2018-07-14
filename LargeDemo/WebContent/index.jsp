<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2018/7/13
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LargeDemo</title>
    <link rel="stylesheet" href="Resources/jquery-easyui-1.5.5.4/themes/default/easyui.css">
    <link rel="stylesheet" href="Resources/jquery-easyui-1.5.5.4/themes/icon.css">
    <script type="text/javascript" src="Resources/jquery-easyui-1.5.5.4/jquery.min.js"></script>
    <script type="text/javascript" src="Resources/jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>

    <style>
        <%-- 清除样式 --%>
        html, body{
            margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
        }
        .logo
        {
            font-family:"微软雅黑",	"Helvetica Neue",​Helvetica,​Arial,​sans-serif;
            font-size:28px;
            font-weight:bold;
            cursor:default;
            position:absolute;top:25px;left:14px;
            line-height:28px;
            color:#444;
        }
        .topNav
        {
            position:absolute;right:8px;top:12px;
            font-size:12px;
            line-height:25px;
        }
        .topNav a
        {
            text-decoration:none;
            font-weight:normal;
            font-size:12px;
            line-height:25px;
            margin-left:3px;
            margin-right:3px;
            color:#333;
        }
        .topNav a:hover
        {
            /* 下划线 */
            text-decoration:underline;
        }
    </style>
</head>
<body>
    <div class="easyui-layout" style="width: 100%;height: 100%;">
        <div id="nav" data-options="region:'north'" style="height: 80px;overflow:hidden;">
            <div class="logo">Demo示例</div>

            <div class="topNav">
                <a href="Html/cover.html">封面</a> |
                <a href="#">其他</a>
            </div>

            <div style="position:absolute;right:12px;bottom:8px;font-size:12px;line-height:25px;font-weight:normal;">
                皮肤：
                <select id="selectSkin" onchange="onSkinChange(this.value)" style="width:100px;margin-right:10px;" >
                    <optgroup label="传统风格">
                        <option value="default">default</option>
                        <option value="blue">blue</option>
                        <option value="pure">pure</option>
                        <option value="gray">gray</option>
                        <option value="olive2003">olive2003</option>
                        <option value="blue2003" >blue2003</option>
                        <option value="blue2010" >blue2010</option>
                        <option value="bootstrap">bootstrap</option>
                        <option value="jqueryui-cupertino">jqueryui-cupertino</option>
                        <option value="jqueryui-smoothness">jqueryui-smoothness</option>
                    </optgroup>
                    <optgroup label="扁平风格">
                        <option value="cupertino" selected>cupertino</option>
                        <option value="metro-white" >metro-white</option>
                        <option value="metro-green">metro-green</option>
                        <option value="metro-orange">metro-orange</option>
                        <option value="metro-gray">metro-gray</option>
                        <option value="metro-blue">metro-blue</option>
                    </optgroup>
                </select>
            </div>
        </div>
        <div data-options="region:'south',split:true" style="height:50px;"></div>
        <div data-options="region:'east',split:true" title="East" style="width:100px;"></div>
        <div data-options="region:'west',split:true" title="West" style="width:100px;">
	        <ul class="easyui-tree">
		        <li>
		            <span>Folder</span>
		            <ul>
		                <li>
		                    <span>Sub Folder 1</span>
		                    <ul>
		                        <li><span>File 11</span></li>
		                        <li><span>File 12</span></li>
		                        <li><span>File 13</span></li>
		                    </ul>
		                </li>
		                <li><span>File 2</span></li>
		                <li><span>File 3</span></li>
		            </ul>
		        </li>
		        <li><span>File21</span></li>
		    </ul>
    	</div>
    </div>
    <div data-options="region: center"></div>
    <script>

    </script>
</body>
</html>
