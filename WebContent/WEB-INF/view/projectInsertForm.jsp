<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form{
		margin: 0 auto;
		width:400px;
	}
	fieldset{
		padding: 20px;
	}
	label{
		display: block
	}
	
</style>
</head>
<body>
	<form action="" method="post">
		<fieldset>
			<p>
				<label>프로젝트 이름</label>
				<input type="text" name="project_name">
			</p>
			<p>
				<label>프로젝트 내용</label>
				<textarea rows="10" cols="45" name="content"></textarea>
			</p>
			<p>
				<label>시작날짜</label>
				<input type="date" name="project_name">
			</p>
			<p>
				<label>종료날짜</label>
				<input type="date" name="project_name">
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






















