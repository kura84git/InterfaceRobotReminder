<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<h1>ログイン</h1>
	<form action="/InterfaceRobotReminder/Login" method="post">
		<p>ユーザーID：<input type="text" name="id"></p>
		<p>パスワード：<input type="password" name="pass"></p>
		<p><input type="submit" value="ログイン！"></p>
	</form>
	<p><a href="/InterfaceRobotReminder/Register">新規登録はこちら</a></p>
</body>
</html>