package com.yi.projectManagement.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectManagement.mvc.CommandHandler;
import com.yi.projectManagement.service.ProjectService;

public class ProjectDeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String project_id = req.getParameter("project_no");
		int project_no = Integer.parseInt(project_id);
		
		ProjectService service = ProjectService.getInstance();
		service.delete(project_no);
		
		return "list.do";
	}

}
