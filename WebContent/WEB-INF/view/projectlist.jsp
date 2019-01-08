<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#contanier{
		margin: 30px auto;
		width:800px;
	}
	header{
		width:100%;
		height: 100px;
		line-height:100px;
		padding-left:20px;
		background-color: #B2CCFF;
		color:#A6A6A6;
		font-style: italic;
	}
	a{
		color:gray;
		font-weight:bold;
		text-decoration: none;
	}
	a:hover{
		color:#B2CCFF;
	}
	#new{
		margin-left: 680px;
	}
	table{
		border-collapse: collapse;
		width:700px;
		margin: 30px auto;
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
	<div id="contanier">
	<header>
		<h1>Project Management System</h1>
	</header>
	<a href="${pageContext.request.contextPath }/project/insert.do" id="new">새 프로젝트 등록</a>
	<table>
		<tr>
			<th>프로젝트이름</th>
			<th>시작날짜</th>
			<th>종료날짜</th>
			<th>상태</th>
		</tr>
		<c:forEach var="item" items="${list }">
			<tr>
				<td><a href="read.do?no=${item.project_no }">${item.project_name }</a></td>
				<td><fmt:formatDate value="${item.startdate }" type="date" dateStyle="long"/></td>
				<td><fmt:formatDate value="${item.enddate }" type="date" dateStyle="long"/></td>
				<td>${item.progress }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>