<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	form{
		margin: 30px auto;
		width:700px;
	}
	fieldset{
		padding: 40px;
		width:700px;
	}
	label{
		display: block
	}
</style>
</head>
<body>
	<div id="contanier">
	<header>
		<h1>Project Management System</h1>
	</header>
	<form action="${pageContext.request.contextPath }/project/modify.do?project_no=${project.project_no}" method="post">
		<fieldset>
			<p>
				<label>프로젝트 이름</label>
				<input type="text" name="project_name" value="${project.project_name }">
			</p>
			<p>
				<label>프로젝트 내용</label>
				<textarea rows="10" cols="45" name="content">${content.content }</textarea>
			</p>
			<p>
				<label>시작날짜</label>
				<input type="text" name="startdate">
			</p>
			<p>
				<label>종료날짜</label>
				<input type="text" name="enddate">
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
	</div>
</body>
</html>