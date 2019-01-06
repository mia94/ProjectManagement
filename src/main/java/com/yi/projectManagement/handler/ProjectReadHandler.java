package com.yi.projectManagement.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectManagement.mvc.CommandHandler;
import com.yi.projectManagement.service.ProjectService;

public class ProjectReadHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			String projectNo = req.getParameter("no");
			int no = Integer.parseInt(projectNo);
			
			ProjectService service = ProjectService.getInstance();
			
			Map<String, Object> map = service.readProject(no);
			
			req.setAttribute("map", map);
			return "/WEB-INF/view/projectRead.jsp";
		}
		return null;
	}

}
