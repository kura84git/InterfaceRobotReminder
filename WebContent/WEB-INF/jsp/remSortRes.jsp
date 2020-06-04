<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%@ page import="java.util.List" %>
<%
List<Remind> remSortList = (List<Remind>)request.getAttribute("remSortList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<h2>カテゴリソート検索結果</h2>
	<% for(Remind remind : remSortList) { %>
		<p><%= remind.getRemind() %></p>
	<% } %>

	<p><a href="/InterfaceRobotReminder/RemSort">カテゴリソート検索へ戻る</a></p>
	<p><a href="/InterfaceRobotReminder/Reminder">リマインダーアプリトップへ戻る</a></p>

</body>
</html>