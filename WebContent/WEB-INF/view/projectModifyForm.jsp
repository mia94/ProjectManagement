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
	}
	td{
		border:1px solid black;
		padding: 5px;
	}
</style>
</head>
<body>
	<form action="modify.do?project_no=${project.project_no}" method="post">
		<fieldset>
			<p>
				<label>프로젝트 이름</label>
				<input type="text" name="project_name" value="${project.project_name }">
			</p>
			<p>
				<label>프로젝트 내용</label>
				<textarea rows="10" cols="45" name="content" value="${content.content }"></textarea>
			</p>
			<p>
				<label>시작날짜</label>
				<input type="date" name="startdate" value="${project.startdate }">
			</p>
			<p>
				<label>종료날짜</label>
				<input type="date" name="enddate" value="${project.enddate }">
			</p>
			<p>
				<select name="progress">
					<option value="준비">준비</option>
					<option value="진행중">진행중</option>
					<option value="종료">종료</option>
					<option value="보류">보류</option>
				</select>
			</p>
			<p>
				<input type="submit" value="저장">
				<input type="reset" value="취소">
			</p>
		</fieldset>
	</form>
</body>
</html>