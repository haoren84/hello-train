<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>DEMO</title>
	<style type="text/css">
		ul,li{
			padding: 0;
			margin: 0;
			list-style: none;
		}
		a{text-decoration: none;color: #666;}
		a:hover{color: #f00;}
		div.left table{
			font-size: 20px;
			border: 2px solid #f60;
		}
		div.left{float: left;padding: 60px 200px 50px 80px;}
		div.right{padding-top: 60px;}
		div.right table{
			width: 276px;
			height: 276px;
			border: 3px solid #660;
		}
		td{text-align: center;width: 24px;border: 1px solid #660;padding-top: 0;}
	</style>
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
	<div class="easyui-layout" style="width: 100%;height: 750px">
		<div data-options="region:'north'" style="width: 100%;height: 72px;">
			<span style="font-size: 45px;padding-left: 20px;">Demo</span>
			<div id="top-btns" style="float: right;padding: 20px 20px 0px;">
				<span>欢迎您，Admin！</span>
				<a href="#" id="ab" class="easyui-linkbutton"">About</a>
				<a href="#" id="mb" class="easyui-menubutton" data-options="menu:'#mm',iconCls:'icon-more'">More</a>
				<div id="mm" style="width:150px;">
				    <div data-options="iconCls:'icon-man'">个人信息</div>
				    <div data-options="iconCls:'icon-help'">注意事项</div>
				    <div class="menu-sep"></div>
				    <div>注销</div>
				</div>
				<!-- 语言选择 -->
				<select class="easyui-combobox" name="language" label="Language:" labelPosition="left" style="width: 200px;height: auto;" >
					<option value="CHI" selected>简体中文</option>
					<option value="ENG">English</option>
				</select>
			</div>
		</div>
		<div class="easyui-accordion" data-options="region:'west'" style="width:200px;height:100%;">
			<div title="Menu" data-options="iconCls:'icon-tip',collapsed:false,collapsible:false" style="padding:10px;">
				<input class="easyui-searchbox" prompt="Search..." style="height:25px;">
			</div>
			<div title="n1" data-options="selected:true" style="padding:10px;">
				<ul>
					<li><a href="#" onclick="addTab('DataGrid','a1.jsp')">DataGrid Demo</a></li>
					<li><a href="#" onclick="addTab('Form','a2.jsp')">Form Demo</a></li>
					<li><a href="#" onclick="addTab('a3','a3.html')">a3</a></li>
				</ul>
			</div>
			<div title="n2" style="padding:10px">
				<ul class="easyui-tree">
		            <li>
		                <span>My Tree</span>
		                <ul>
		                    <li data-options="state:'closed'">
		                        <span>Fruits</span>
		                        <ul>
		                            <li>
		                                <span>Apple</span>
		                            </li>
		                            <li>
		                                <span>Banana</span>
		                            </li>
		                            <li>
		                                <span>Orange</span>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
		                        <span>Languages</span>
		                        <ul>
		                            <li>PHP</li>
		                            <li>Java</li>
		                            <li>C#</li>
		                            <li>Go</li>
		                        </ul>
		                    </li>
		                </ul>
		            </li>
		        </ul>
			</div>
			<div title="n3" style="padding:10px">
				<p>Content3</p>
			</div>
		</div>
		<div data-options="region:'center'">
			<div id="tt" class="easyui-tabs" style="width: 100%;height: 100%;">
				<div title="Home" style="padding:10px;">
					<!-- 首页内容 -->
					<div class="left">
						<table>
							<tr>
								<td><div class="item">1</div></td>
							</tr>
							<tr>
								<td><div class="item">2</div></td>
							</tr>
							<tr>
								<td><div class="item">3</div></td>
							</tr>
							<tr>
								<td><div class="item">4</div></td>
							</tr>
							<tr>
								<td><div class="item">5</div></td>
							</tr>
							<tr>
								<td><div class="item">6</div></td>
							</tr>
							<tr>
								<td><div class="item">7</div></td>
							</tr>
							<tr>
								<td><div class="item">8</div></td>
							</tr>
							<tr>
								<td><div class="item">9</div></td>
							</tr>
						</table>
					</div>
					<div class="right">
						<table>
							<tr>
								<td class="pla"></td>
								<td class="pla"></td>
								<td class="pla"></td>
							</tr>
							<tr>
								<td class="pla"></td>
								<td class="pla"></td>
								<td class="pla"></td>
							</tr>
							<tr>
								<td class="pla"></td>
								<td class="pla"></td>
								<td class="pla"></td>
							</tr>
							
						</table>
					</div>
				</div>
			</div>
			<div id="win" class="easyui-window" title="About" closed="true" style="width:300px;height:100px;padding:5px;">
				Something will tell you that you must know!
			</div>
		</div>
		<div id="footer" data-options="region:'south'" style="height: 24px;text-align: center;">
			Copyright&nbsp;&copy;&nbsp;Demo有限公司
		</div>
	</div>
	<script type="text/javascript">
		// 点击About弹出Window窗口
		$("#ab").click(function(){
		  	$('#win').window('open');
		});
		// 添加选项卡
		function addTab(title, url){
			if ($('#tt').tabs('exists', title)){
				$('#tt').tabs('select', title);
			} else {
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
				$('#tt').tabs('add',{
					title:title,
					content:content,
					closable:true
				});
			}
		}
		// 拖放
		$('.left .item').draggable({
			revert:true
		});
		$('.right td.pla').droppable({
			onDragEnter:function(){
				$(this).addClass('over');
			},
			onDragLeave:function(){
				$(this).removeClass('over');
			},
			onDrop:function(e,source){
				$(this).removeClass('over');
				if ($(source).hasClass('assigned')){
					$(this).append(source);
				} else {
					var c = $(source).clone().addClass('assigned');
					$(this).empty().append(c);
					c.draggable({
						revert:true
					});
				}
			}
		});
	</script>
</body>
</html>