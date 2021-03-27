package com.divya.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/std") //std/getAllStudents
public class StudentController 
{
	@RequestMapping(value="/getAllStudents",method=RequestMethod.GET)
	public String getAllStudents(ModelMap map)
	{
		map.put("msg","Welcome to My First MVC Program");
		return "show";
		
	}
	@RequestMapping(value="/getStudentById",method=RequestMethod.GET)
	public String getStudentById(ModelMap map,HttpServletRequest req)
	{
		map.put("msg","Student Id = "+req.getParameter("Id"));
		return "show";
		
	}
	
}
