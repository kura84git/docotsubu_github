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
		<h2>新規会員登録</h2>

		<form action="/docotsubu_github/Register" method="post">
			<p>ユーザーID：<input type="text" name="userId"></p>
			<p>名前：<input type="text" name="name"></p>
			<p>パスワード：<input type="password" name="pass"></p>
			<p>メールアドレス：<input type="text" name="mail"></p>
			<p>年齢：<input type="text" name="age"></p>
			<p><input type="submit" value="確認"></p>
		</form>

		<p><a href="index.jsp">ログインページへ戻る</a></p>
	</main>

	<footer>
		<jsp:include page="/footer.jsp"></jsp:include>
	</footer>

</body>
</html>