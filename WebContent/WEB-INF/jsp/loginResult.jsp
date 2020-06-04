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
	<%
		if (loginUser != null) {
	%>
	<p>ログイン成功</p>
	<p>ようこそ<%= loginUser.getId() %>さん</p>
	<p>
		<a href="/InterfaceRobotReminder/Main">メインページへ</a>
	</p>
	<% } else { %>
	<p>ログイン失敗</p>
	<p>
		<a href="/InterfaceRobotReminder/index.jsp">トップへ戻る</a>
	</p>
	<% } %>

	<p>
		<a href="/InterfaceRobotReminder/Logout">ログアウト</a>
	</p>

</body>
</html>