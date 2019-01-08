<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container{
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
	h2{
	 	color:pink;
	 	text-align: center;
	}
	a{
		text-decoration: none;
		font-size: 1.1em;
		color:gray;
		font-weight: bold;
	}
	a:hover{
		text-decoration: none;
		font-size: 1.1em;
		color:black;
		font-weight: bold;
	}
</style>
</head>
<body>
	<div id="container">
		<header>
			<h1>Project Management System</h1>
		</header>
		<h2>프로젝트 관리 시스템</h2>
		<p><a href="project/list.do">프로젝트리스트보기</a></p><!-- 프로젝트상세보기, 수정, 삭제 가능해야함 -->
		<p><a href="project/insert.do">새 프로젝트 등록하기</a></p>
	</div>
</body>
</html>