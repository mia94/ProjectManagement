package com.yi.projectManagement.model;

import java.util.Date;

public class Project {
	private int project_no;
	private String project_name;
	private Date startdate;
	private Date enddate;
	private String progress;
	
	public Project() {

	}

	public Project(int project_no, String project_name, Date startdate, Date enddate, String progress) {
		this.project_no = project_no;
		this.project_name = project_name;
		this.startdate = startdate;
		this.enddate = enddate;
		this.progress = progress;
	}

	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "Project [project_no=" + project_no + ", project_name=" + project_name + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", progress=" + progress + "]";
	}
	
	
	
	

	
}
