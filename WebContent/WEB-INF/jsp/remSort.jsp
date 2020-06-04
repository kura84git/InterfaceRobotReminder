<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Remind" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.List" %>
<%
Set<Remind> categoryList = (Set<Remind>)request.getAttribute("categoryList");

//String errorMsg = (String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InterfaceRobot</title>
</head>
<body>
	<form action="/InterfaceRobotReminder/RemSort" method="post">
		<p>ソートしたいカテゴリを入力してください：<input type="text" name="category"></p>
		<p><input type="submit" value="このカテゴリでソートする！"></p>
	</form>

	<!-- エラーメッセージコメントアウト -->

	<p>カテゴリ一覧</p>
	<% for(Remind category : categoryList) { %>
		<p><%= category.getCategory() %></p>
	<% } %>


	<p><a href="/InterfaceRobotReminder/Reminder">リマインダーアプリトップへ戻る</a></p>
</body>
</html>