package com.yi.projectManagement.dao;

import java.sql.SQLException;
import java.util.List;

import com.yi.projectManagement.model.ProjectContent;

public interface ProjectContentDao {
	public void insert(ProjectContent content)throws SQLException;
	public List<ProjectContent> select() throws SQLException;
	public int selectLastNo()throws SQLException;
	public ProjectContent selectByNo(ProjectContent content)throws SQLException;
	public int deleteByNo(ProjectContent content)throws SQLException;
	public int update(ProjectContent content)throws SQLException;
}
