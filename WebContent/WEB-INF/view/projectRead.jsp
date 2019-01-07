<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
		width:400px;
	}
	td{
		border:1px solid black;
		padding: 5px;
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
	<table>
		<tr>
			<td>프로젝트 이름</td>
			<td>${map.project.project_name }</td>
		</tr>
		<tr>
			<td>프로젝트 내용</td>
			<td>${map.content.content }</td>
		</tr>
		<tr>
			<td>시작날짜</td>
			<td>${map.project.startdate }</td>
		</tr>
		<tr>
			<td>종료날찌</td>
			<td>${map.project.enddate }</td>
		</tr>
		<tr>
			<td>상태</td>
			<td>${map.project.progress }</td>
		</tr>
	</table>
	
	<p>
		<a href="${pageContext.request.contextPath }/project/modify.do?project_no=${map.project.project_no }">[수정]</a>
		<a href="${pageContext.request.contextPath }/project/delete.do?project_no=${map.project.project_no }" id="delBtn">[삭제]</a>
		<a href="${pageContext.request.contextPath }/project/list.do">[돌아가기]</a>
	</p>
</body>
</html>