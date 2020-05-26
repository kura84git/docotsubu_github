<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.User" %>
<%@ page import="java.util.List" %>
<%@ page import="beans.Mutter" %>
<%
User loginUser = (User)session.getAttribute("loginUser");

List<Mutter> mutterList =(List<Mutter>)request.getAttribute("mutterList");

String errorMsg = (String)session.getAttribute("errorMsg");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>docotsubu_github</title>
</head>
<body>
	<header>
		<jsp:include page="header.jsp"></jsp:include>
	</header>

	<main>
		<p>
			<%= loginUser.getName() %>さん、ログイン中！

			<!-- ログアウト -->
			<a href="/docotsubu_github/Logout">ログアウト</a>
		</p>

		<!-- 更新ボタン -->
		<p><a href="/docotsubu_github/Main">更新</a></p>

		<!-- 投稿 -->
		<form action="/docotsubu_github/Main" method="post">
			<p>
				<input type="text" name="text">
				<input type="submit" value="投稿">
			</p>
		</form>

		<!-- 未入力のエラーメッセージを出力する -->
		<% if(errorMsg != null ){ %>
		<p><%= errorMsg %></p>
		<% } %>

		<!-- 閲覧 -->
		<% for(Mutter mutter: mutterList){%>
		<p><%= mutter.getUserName() %>：<%= mutter.getText() %></p>
		<% } %>
	</main>

	<footer>
		<jsp:include page="/footer.jsp"></jsp:include>
	</footer>


</body>
</html>