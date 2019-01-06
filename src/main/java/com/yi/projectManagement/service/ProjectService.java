package com.yi.projectManagement.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.yi.projectManagement.dao.ProjectContentDao;
import com.yi.projectManagement.dao.ProjectDao;
import com.yi.projectManagement.model.Project;
import com.yi.projectManagement.model.ProjectContent;
import com.yi.projectManagement.mvc.MySqlSessionFactory;

public class ProjectService {
	private static ProjectService service = new ProjectService();
	
	public static ProjectService getInstance(){
		return service;
	}
	
	public int insertProject(String name, String content,Date startdate, Date enddate, String progress){
		/*
		 * 1. project에 저장
		 * 2. project_content 저장  
		 * */
		
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			//project
			ProjectDao projectdao = session.getMapper(ProjectDao.class);
			Project project = new Project(0, name, startdate, enddate, progress);
			projectdao.insert(project);
			int no = projectdao.selectLastNo();
			if(no<0){
				return -2;
			}
			//project_content
			ProjectContentDao contentDao = session.getMapper(ProjectContentDao.class);
			ProjectContent projectContent = new ProjectContent(no, content);
			contentDao.insert(projectContent);
			
			session.commit();
			return 0;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return -4;//특수경우
	}
	
	public List<Project> projectList(){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			return dao.select();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public Map<String, Object> readProject(int no){
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectDao projectDao = session.getMapper(ProjectDao.class);
			ProjectContentDao contentDao = session.getMapper(ProjectContentDao.class);
			
			Project project = new Project();
			project.setProject_no(no);
			project = projectDao.selectByNo(project);
			
			ProjectContent content = new ProjectContent();
			content.setProject_no(no);
			content = contentDao.selectByNo(content);
			
			//두개 다 return 하기
			Map<String, Object> map = new HashMap<>();
			map.put("project", project);
			map.put("content", content);
			
			session.commit();
			return map;
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public boolean delete(int project_no){
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			
			Project project = new Project();
			project.setProject_no(project_no);
			project = dao.selectByNo(project);
			
			dao.deleteByNo(project);
			
			ProjectContentDao contentDao = session.getMapper(ProjectContentDao.class);
			
			ProjectContent content = new ProjectContent();
			content.setProject_no(project_no);
			content = contentDao.selectByNo(content);
			
			contentDao.deleteByNo(content);
			session.commit();
			return true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return false;
	}
	//내용업데이트
	public boolean update(int project_no, String string){
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			ProjectContentDao contentDao = session.getMapper(ProjectContentDao.class);
			
			Project project = new Project();
			project.setProject_no(project_no);
			project = dao.selectByNo(project);
			
			ProjectContent content = new ProjectContent();
			content.setProject_no(project_no);
			content = contentDao.selectByNo(content);
			
			contentDao.update(content);
			session.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	
	public Project selectByNo(int project_no)throws SQLException{
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			
			Project project = new Project();
			project.setProject_no(project_no);
			project = dao.selectByNo(project);
			return project;
		} finally {
			session.close();
		}
	}
	public ProjectContent selectContentByNo(int project_no) throws SQLException{
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectContentDao dao = session.getMapper(ProjectContentDao.class);
			
			ProjectContent content = new ProjectContent();
			content.setProject_no(project_no);
			content = dao.selectByNo(content);
			return content;
		} finally {
			session.close();
		}
	}
}























