package com.yi.projectManagement.dao;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yi.projectManagement.model.Project;
import com.yi.projectManagement.mvc.MySqlSessionFactory;

public class ProjectDaoTest {

	@Test
	public void insert(){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			
			Project project = new Project();
			project.setProject_name("테스트용 제목");
			project.setStartdate(new Date());
			project.setEnddate(new Date());
			project.setProgress("준비");
			dao.insert(project);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void select(){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			
			List<Project> list = new ArrayList<>();
			list = dao.select();

			System.out.println(list);

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}

















