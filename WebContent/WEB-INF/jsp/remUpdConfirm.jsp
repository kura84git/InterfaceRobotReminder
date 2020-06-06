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
	<h2>こちらの内容で更新してもよろしいですか？？</h2><br>
	<p>リマインド：<%= remUpd.getRemind() %></p>
	<p>カテゴリ：<%= remUpd.getCategory() %></p>
	<p>
		<a href="/InterfaceRobotReminder/RemUpd?action=done">更新する</a>
		<a href="/InterfaceRobotReminder/RemUpd">戻る</a>
		</form>
	</p>
</body>
</html>