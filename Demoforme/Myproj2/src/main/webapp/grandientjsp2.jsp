<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>グラデーション JSP その 2</title>
</head>
<body>
<% int add = 42; %>
<h1>グラデーション JSP その 2</h1>
グラデーションの幅:<%= add %><p></p>
<table border="1">
<%
	int color = 0;
	for (int i = 0; i < 4; i++) {
		out.println("<tr>");
		
		for (int j = 0; j < 4; j++) {
			color += add;
			String colorHex = String.format("%02x", color); // color を 16 進数(2 ケタ)に変換
			String colorHTML = colorHex + colorHex + colorHex; // HTML の色指定形式の作成
			out.println("<td style=\"height: 50px; width: 50px; background-color: #"
			+ colorHTML + "\"><br></td>");
		}
		color = 0;
		color += 42; 
		out.println("</tr>");
	}
%>
</table>
</body>
</html>