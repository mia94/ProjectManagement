package com.yi.projectManagement.dao;


import java.sql.SQLException;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.yi.projectManagement.model.Project;
import com.yi.projectManagement.model.ProjectContent;
import com.yi.projectManagement.service.ProjectService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectServiceTest {

	SqlSession session = null;
	ProjectService service = ProjectService.getInstance();
	
	@Test
	public void test01insert(){
		int res = service.insertProject("추가확인용", "추가확인용 내용", "2018-10-11", "2019-01-21", "준비");
		Assert.assertNotEquals(1, res);
	}
	
	@Test
	public void test02projectList(){
		List<Project> list = service.projectList();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test03delete(){
		boolean res = service.delete(4);
		Assert.assertEquals(true,res);
	}
	
	@Test
	public void test04update(){
		boolean res = service.update(5, "수정", "수정", "2018-12-11", "2019-12-21", "준비");
		Assert.assertEquals(true,res);
	}
	
	@Test
	public void test04selectByNo() throws SQLException{
		Project project = service.selectByNo(8);
		Assert.assertNotNull(project);
	}
	
	@Test
	public void test05selectContentByNo() throws SQLException{
		ProjectContent content = service.selectContentByNo(8);
		Assert.assertNotNull(content);
	}
	
	
}

















