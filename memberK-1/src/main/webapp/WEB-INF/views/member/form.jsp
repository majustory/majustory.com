<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="/school/formOK.do"  method="post">
<h1> ȸ �� �� �� </h1>
<table border=1 height="160">
<tr><td>�й�</td><td><input  type=text  name="sno" ></td></tr> 
<tr><td>�̸� </td><td> <input  type=text  name="sname" > </td></tr>
<tr><td>���� </td><td> <input  type=text  name="email" > </td></tr> 
<tr><td colspan=2  align="center" ><input  type=submit value="ȸ������"></td></tr> 
</table>
</form>
</div>
</body>
</html>