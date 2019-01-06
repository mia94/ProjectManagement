package com.yi.projectManagement.model;

import java.util.Date;

public class Project {
	private int ProjectNo;
	private String projectName;
	private Date startDate;
	private Date endDate;
	private String progress;
	
	public Project() {

	}
	

	public Project(int projectNo, String projectName, Date startDate, Date endDate, String progress) {
		ProjectNo = projectNo;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.progress = progress;
	}

	public int getProjectNo() {
		return ProjectNo;
	}

	public void setProjectNo(int projectNo) {
		ProjectNo = projectNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}


	@Override
	public String toString() {
		return "Project [ProjectNo=" + ProjectNo + ", projectName=" + projectName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", progress=" + progress + "]";
	}

}
