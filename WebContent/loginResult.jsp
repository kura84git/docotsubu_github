<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.User" %>
<%
User loginUser = (User)session.getAttribute("loginUser");
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

		<!-- ログイン成功した場合の出力 -->
		<%
			if (loginUser != null) {
		%>
		<p>ログイン成功</p>
		<p>ようこそ<%= loginUser.getName() %>さん</p>
		<p>
			<a href="/docotsubu_github/Main">投稿・閲覧ページへ</a>
		</p>
		<% } else { %>
		<!-- ログイン失敗した場合の出力 -->
		<p>ログイン失敗</p>
		<p>
			<a href="/docotsubu_github">トップへ戻る</a>
		</p>
		<% } %>

		<!-- ログアウト処理 -->
		<p>
			<a href="/docotsubu_github/Logout">ログアウト</a>
		</p>

	</main>

	<footer>
		<jsp:include page="/footer.jsp"></jsp:include>
	</footer>


</body>
</html>