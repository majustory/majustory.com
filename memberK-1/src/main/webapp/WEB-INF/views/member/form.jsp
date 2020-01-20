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
<h1> 회 원 가 입 </h1>
<table border=1 height="160">
<tr><td>학번</td><td><input  type=text  name="sno" ></td></tr> 
<tr><td>이름 </td><td> <input  type=text  name="sname" > </td></tr>
<tr><td>메일 </td><td> <input  type=text  name="email" > </td></tr> 
<tr><td colspan=2  align="center" ><input  type=submit value="회원가입"></td></tr> 
</table>
</form>
</div>
</body>
</html>