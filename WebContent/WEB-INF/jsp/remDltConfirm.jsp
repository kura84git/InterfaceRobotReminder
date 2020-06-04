<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%
Remind remDlt = (Remind)session.getAttribute("remDlt");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<h2>こちらの内容で削除してもよろしいですか？？</h2><br>
	<p>リマインド：<%= remDlt.getRemind() %></p>
	<p>カテゴリ：<%= remDlt.getCategory() %></p>
	<p>
		<a href="/InterfaceRobotReminder/RemDlt">削除する</a>
		<a href="/InterfaceRobotReminder/Reminder">戻る</a>
	</p>
</body>
</html>