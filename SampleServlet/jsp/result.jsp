<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
    
    <%
    		// requestからキー"calc"を使って入力値を呼び出し、listに格納
    		ArrayList<String> list = (ArrayList<String>)request.getAttribute("calc");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP出力テスト</title>
</head>
<body>
	<p><strong>【計算結果を表示】</strong></p>
	<%
		// listの中身を繰り返し表示
		for(String str : list){
	%>
		<%= str + "</br>" %>
	<%
		}
	%>
</body>
</html>