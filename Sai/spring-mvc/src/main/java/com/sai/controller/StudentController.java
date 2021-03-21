package com.sai.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("st")
public class StudentController {
	
	@RequestMapping("/getallstudents")
	public String getAllStudent(ModelMap map) {
		map.put("msg", "Welcome to MVC");
		return "show";
		
	}
	@RequestMapping("/getStudentById")
	public String getStudentById(ModelMap map,HttpServletRequest rq) {
		map.put("msg", "Your studnet id="+rq.getParameter("id"));
		return "show";
		
	}

}
