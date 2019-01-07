package com.yi.projectManagement.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectManagement.mvc.CommandHandler;
import com.yi.projectManagement.service.ProjectService;

public class ProjectInsertHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			return "/WEB-INF/view/projectInsertForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")){
			String name = req.getParameter("project_name");
			String content = req.getParameter("content");
			String startdate = req.getParameter("startdate");
			String enddate = req.getParameter("enddate");
			String progress  = req.getParameter("progress");
			System.out.println("name="+name);
			
			
			ProjectService service = ProjectService.getInstance();
			int error = service.insertProject(name, content, startdate, enddate, progress);
			
			if(error < 0){
				System.out.println("error : " + error);
			}
			return "/project/list.do";
	
		}
		return null;
	}

}
