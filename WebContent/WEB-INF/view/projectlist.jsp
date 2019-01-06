<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
	}
	td, th{
		border:1px solid black;
		padding: 10px;
	}
	table td:FIRST-CHILD {
		text-align: center;
	}
</style>
</head>
<body>
	<a href="">새 프로젝트 등록</a>
	<table>
		<tr>
			<th>프로젝트이름</th>
			<th>시작날짜</th>
			<th>종료날짜</th>
			<th>상태</th>
		</tr>
		
		<c:forEach var="item" items="${list }">
			<tr>
				<td><a href="">${item.project_name }</a></td>
				<td>${item.startdate }</td>
				<td>${item.enddate }</td>
				<td>${item.progress }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>