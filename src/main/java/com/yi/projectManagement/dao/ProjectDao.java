package com.yi.projectManagement.dao;

import java.sql.SQLException;
import java.util.List;

import com.yi.projectManagement.model.Project;

public interface ProjectDao {
	public void insert(Project project)throws SQLException;
	public List<Project> select() throws SQLException;
	public int selectLastNo()throws SQLException;
	public Project selectByNo(Project project)throws SQLException;
	public int deleteByNo(Project project)throws SQLException;
	public int update(Project project)throws SQLException;
}
