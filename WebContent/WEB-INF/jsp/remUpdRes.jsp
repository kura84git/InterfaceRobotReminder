<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% boolean remRes = (boolean)request.getAttribute("remRes"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interface_Robot_InnerApp</title>
</head>
<body>
	<% if(remRes) { %>
		<p>更新が完了しました！！</p>
	<% } else { %>
		<p>更新に失敗しました・・・</p>
	<% } %>
	<p><a href="/InterfaceRobotReminder/Reminder">リマインダーアプリトップへ戻る</a></p>
</body>
</html>