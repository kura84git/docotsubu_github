<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.RegisterUser" %>
<%
RegisterUser registerUser = (RegisterUser)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>docotsubu_github</title>
</head>
<body>
	<header>
		<jsp:include page="/header.jsp"></jsp:include>
	</header>
	<main>
		<h2>登録内容確認</h2>
		<ul>
			<li>ユーザーID：<%= registerUser.getUserId() %></li>
			<li>名前：<%= registerUser.getName() %></li>
			<li>メールアドレス：<%= registerUser.getMail() %></li>
			<li>年齢：<%= registerUser.getAge() %></li>

			<!--  EL式
			<li>ユーザーID：${registerUser.userId}</li>
			<li>名前：${registerUser.name}</li>
			<li>メールアドレス：${registerUser.mail}</li>
			<li>年齢：${registerUser.age}</li>
			 -->

		</ul>

		<p>上記の内容で登録しますか？</p>
		<ul>
			<li><a href="/docotsubu_github/Register?action=done">登録する</a></li>
			<li><a href="/docotsubu_github/Register">戻る</a></li>
		</ul>
	</main>

	<footer>
		<jsp:include page="/footer.jsp"></jsp:include>
	</footer>

</body>
</html>