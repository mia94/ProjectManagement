<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2{
	 color:pink;
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
	<h2>프로젝트 관리 시스템</h2>
	<p><a href="project/list.do">프로젝트리스트보기</a></p><!-- 프로젝트상세보기, 수정, 삭제 가능해야함 -->
	<p><a href="">새 프로젝트 등록하기</a></p>
</body>
</html>