package com.yi.projectManagement.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectManagement.model.Project;
import com.yi.projectManagement.model.ProjectContent;
import com.yi.projectManagement.mvc.CommandHandler;
import com.yi.projectManagement.service.ProjectService;

public class ProjectModifyHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			String sNo = req.getParameter("project_no");
			int project_no = Integer.parseInt(sNo);
			ProjectService service = ProjectService.getInstance();
			Project project = service.selectByNo(project_no);
			ProjectContent content = service.selectContentByNo(project_no);
			
			req.setAttribute("project", project);
			req.setAttribute("content", content);
			return "/WEB-INF/view/projectModifyForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")){
			
		}
		return null;
	}

}
