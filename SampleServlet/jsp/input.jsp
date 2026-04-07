<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP入力テスト</title>
</head>
<body>

	<!-- 入力内容をコントローラーへ転送 -->
	<form action="<%= request.getContextPath()%>/ServletSample">
		
		<!-- 入力欄の生成 -->
		<input type="text" name="num1">
		<input type="text" name="num2">
		<input type="submit" name="send" value="send">
		
	</form>
</body>
</html>