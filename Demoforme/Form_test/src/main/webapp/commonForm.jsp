<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日本語の送信データを扱うサーブレット</title>
</head>
<body>
<h1>POST送信フォーム</h1>
<form action="CommonReceiptServlet" method="POST">
お名前：
<input type="text" name="onamae" value="K020C1184 蒋皓">
<input type="submit" value="送信">
</form>
<hr/>
<h1>GET送信フォーム</h1>
<form action="CommonReceiptServlet" method="GET">
お名前：
<input type="text"  name="onamae" value="K020C1184 蒋皓">
<input type="submit" value="送信">
</form>
</body>
</html>