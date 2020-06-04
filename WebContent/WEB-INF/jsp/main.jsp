<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User"%>
<%
	User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<p>
		<%= loginUser.getId() %>さん、ログイン中！
		<a href="/InterfaceRobotReminder/Logout">ログアウト</a>
	</p>
	<input type="button" onClick="location.href='/InterfaceRobotReminder/Reminder'" value="リマインダー実行">
</body>
</html>