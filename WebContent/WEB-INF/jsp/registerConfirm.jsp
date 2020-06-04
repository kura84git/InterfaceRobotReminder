<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User registerUser = (User)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<h2>登録内容確認</h2>
	<ul>
		<li>ユーザーID：<%= registerUser.getId() %></li>
		<li>名前：<%= registerUser.getName() %></li>
		<li>メールアドレス：<%= registerUser.getMail() %></li>
		<li>ロボット名：<%= registerUser.getBotName() %></li>
	</ul>

	<p>上記の内容で登録しますか？</p>
	<ul>
		<li><a href="/InterfaceRobotReminder/Register?action=done">登録する</a></li>
		<li><a href="/InterfaceRobotReminder/Register">戻る</a></li>
	</ul>
</body>
</html>