package com.sai.controller;

import java.util.ArrayList;
import java.util.List;

public class ServiceSt {
	
	static List<StudentBo> st=new ArrayList<>();

	static {
		StudentBo sb=new StudentBo();
		sb.setId(1);
		st.add(sb);
	}
	
	
	public List<StudentBo> getAllStudentDeatils(){
		return st;
	}
	
	public StudentBo getStById(int id) {
		return st.get(id);
		
	}
	
    public String insertStudent(StudentBo bo) {
    	 st.add(bo);
    	 return "Success";
    }
    public String deleteStudent(int id) {
    	st.remove(id);
    	 return "Success";
    }
}



