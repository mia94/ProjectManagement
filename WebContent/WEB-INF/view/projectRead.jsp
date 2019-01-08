<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	p{
		text-align: center;
	}
	a{
		color:gray;
		font-weight:bold;
		text-decoration: none;
	}
	a:hover{
		color:#B2CCFF;
	}
	table{
		border-collapse: collapse;
		width:700px;
		margin: 30px auto;
	}
	td, th{
		border:1px solid gray;
		padding: 10px;
	}
	th{
		width:150px;
	}
	
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function(){
		$("#delBtn").click(function(){
			var del = confirm("정말 삭제하시겠습니까?");
			if(del==true){
				location.href="${pageContext.request.contextPath }/project/delete.do?project_no=${map.project.project_no }";
			}
			return false;
		})
	})
</script>
</head>
<body>
	<div id="contanier">
	<header>
		<h1>Project Management System</h1>
	</header>
	<table>
		<tr>
			<th>프로젝트 이름</th>
			<td>${map.project.project_name }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${map.content.content }</td>
		</tr>
		<tr>
			<th>시작날짜</th>
			<td><fmt:formatDate value="${map.project.startdate }" type="date" dateStyle="long"/></td>
		</tr>
		<tr>
			<th>종료날짜</th>
			<td><fmt:formatDate value="${map.project.enddate }" type="date" dateStyle="long"/></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${map.project.progress }</td>
		</tr>
	</table>
	
	<p>
		<a href="${pageContext.request.contextPath }/project/modify.do?project_no=${map.project.project_no }">[수정]</a>
		<a href="${pageContext.request.contextPath }/project/delete.do?project_no=${map.project.project_no }" id="delBtn">[삭제]</a>
		<a href="${pageContext.request.contextPath }/project/list.do">[돌아가기]</a>
	</p>
	</div>
</body>
</html>