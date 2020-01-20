<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<br>
<table  border=1  width=800  align="center">
 <tr><th>번호 </th><th>제목 </th> <th>내용</th>
<c:forEach  items="${schoolList}"  var="board">
<tr><td> ${board.sno} </td>
<td> ${board.sname} </td>
<td><a href=/school/DeleteOK.do?sno=${board.sno}>${board.email}</a> </td>
</tr> 
</c:forEach>
</table>
<div align="center" >
<form action=/school/select.do >
<select  name="ch1"  >
  <option value="sno"> 학번 </option>
  <option value="sname"> 이름 </option>
  <option value="email"> 메일 </option>
</select>

<input   type=text  name="ch2" >
<input  type=submit value='검색하기' >  
</form>
</div>
</body>
</html>