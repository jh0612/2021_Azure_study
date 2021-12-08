<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String tx1val = request.getParameter("text1");//商品単価（左）
	String tx2val = request.getParameter("text2");//商品単価（中）
	String tx3val = request.getParameter("text3");//商品単価（右）
	String tx4val = request.getParameter("text4");//支払金額
	
	Object lb1val = request.getAttribute("label1");//合計金額
	Object lb2val = request.getAttribute("label2");//お釣り
%>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>自動販売機</title>
    <meta name="author" content="reiwaxr">
    <style type="text/css">
      table{
      	margin-left: auto;
        margin-right: auto;
        border: 0;
      }
    </style>
    <script type="text/javascript">
    var input = document.getElementsById("text");
    input.value=" 	"；
    </script>
  </head>
  <body>
    <h1 style="text-align: center;">自動販売機</h1>
    <p style="text-align: center;">CD65-2　１１８４</p>
    <p style="text-align: center;">蒋皓</p>
    <form action="KonyuServlet" method="get">
    <table style="width: 318px;margin-left: auto; margin-right: auto">
      <tbody>
        <tr>
          <td style="width: 118px; margin-left: 17px; text-align: center;"><img
              src="img/sweets_cookie.png" alt="クッキー"
              title="クッキー" style="width: 150px; height: 150px;"><br>
          </td>
          <td style="width: 205.933px; text-align: center;"><img src="img/coffee_weinercoffee.png"
              alt="コーヒー" title="コーヒー" style="width: 150px; height: 150px;"><br>
          </td>
          <td style="width: 102px; text-align: center;"><img src="img/can_juice.png"
              alt="ジュース" title="ジュース" style="width: 150px; height: 150px;"></td>
        </tr>
        <tr>
          <td style="text-align: center;">２００円<br>
          </td>
          <td style="text-align: center;">３００円<br>
          </td>
          <td style="text-align: center;">１４０円<br>
          </td>
        </tr>
        <tr>
          <td style="text-align: right;"><input id="text" name="text1" value=<%= tx1val %> size="5"
              type="text">個<br>
          </td>
          <td style="text-align: right;"><input id="text" name="text2" value=<%= tx2val %> size="5"
              type="text">個 </td>
          <td style="text-align: right;"><input id="text" name="text3" value=<%= tx3val %> size="5"
              type="text">個 </td>
        </tr>
      </tbody>
    </table>
    <br>
    <p style="text-align: center;">合計金額：<%= lb1val %>円</p>
    <p style="text-align: center;">支払金額：<input id="text" name="text4" value=<%= tx4val %> size="5" type="text">個</p>
    <p style="text-align: center;">おつり：<%= lb2val %>円</p>
    <div style="text-align: center;">
    <input value="購入" type="submit"></div>
    </form>
    <div style="text-align: center;">
      <!--&nbsp; &nbsp;&nbsp; -->
      <a href="ClearServlet">クリア</a>
      </div>
    <p style="text-align: center;"><a href="index.htm">ホームページへ</a>
  </body>
</html>
