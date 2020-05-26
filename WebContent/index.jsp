<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form action="/docotsubu_github/Login" method="post" name="form01" onSubmit="return check()">
			<p>ユーザ名：<input type="text" name="name"></p>
			<p>パスワード：<input type="password" name="pass"></p>
			<p><input type="submit" value="ログイン"></p>
		</form>

		<p><a href="/docotsubu_github/Register">新規登録はこちら</a></p>
	</main>

	<footer>
		<jsp:include page="/footer.jsp"></jsp:include>
	</footer>

	<script type="text/javascript" src="js/formCheck.js"></script>

</body>
</html>