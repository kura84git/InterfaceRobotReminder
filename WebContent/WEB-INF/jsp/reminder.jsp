<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%@ page import="java.util.List" %>
<%
List<Remind> remindList = (List<Remind>)session.getAttribute("remindList");

//String errorMsg = (String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<form action="/InterfaceRobotReminder/Reminder" method="post">
		<p>リマインド内容：<input type="text" name="remind"></p>
		<p>カテゴリ：<input type="text" name="category"></p>
		<p><input type="submit" value="リマインド内容を保存する！"></p>
	</form>

	<input type="button" onClick="location.href='/InterfaceRobotReminder/RemSort'" value="カテゴリソート検索">

	<!-- エラーメッセージコメントアウト -->

	<% for(Remind remind : remindList) { %>
		<p><%= remind.getRemind() %> <br> カテゴリ：<%= remind.getCategory() %></p>
		<p>
			<form action="/InterfaceRobotReminder/RemUpd" method="post">
				<input type="hidden" name="remindId" value="<%= remind.getRemindId() %>">
				<input type="hidden" name="userId" value="<%= remind.getUserId() %>">
				<input type="submit" value="編集">
			</form>
			<form action="/InterfaceRobotReminder/RemDlt" method="post">
				<input type="hidden" name="remindId" value="<%= remind.getRemindId() %>">
				<input type="hidden" name="userId" value="<%= remind.getUserId() %>">
				<input type="submit" value="削除"><br><br>
			</form>
		</p>
	<% } %>

	<p><a href="/InterfaceRobotReminder/Main">トップへ戻る</a></p>
</body>
</html>