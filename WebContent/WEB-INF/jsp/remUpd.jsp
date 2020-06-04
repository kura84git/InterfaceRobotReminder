<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%
Remind remUpd = (Remind)session.getAttribute("remUpd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<h1>編集</h1>
	<h2>編集内容を入力してください</h2>
	<form action="/InterfaceRobotReminder/RemUpd?action=done" method="post">
		<p>リマインド：<input type="text" name="specifiedRemind"  value="<%= remUpd.getRemind() %>"></p>
		<p>カテゴリ：<input type="text" name="specifiedCategory" value="<%= remUpd.getCategory() %>"></p>
		<p><input type="submit" value="更新！"></p>
	</form>
	<p><a href="/InterfaceRobotReminder/Reminder">リマインダーアプリトップへ戻る</a></p>
</body>
</html>