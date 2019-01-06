package com.yi.projectManagement.model;

public class ProjectContent {
	private int projectNo;
	private String content;
	
	
	public ProjectContent() {

	}
	
	public ProjectContent(int projectNo, String content) {
		this.projectNo = projectNo;
		this.content = content;
	}

	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ProjectContent [projectNo=" + projectNo + ", content=" + content + "]";
	}
	
	
}
