package com.sai.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import com.sai.bo.StudentBo;

public class CustomStoredProcedure extends StoredProcedure {

	     public  CustomStoredProcedure(JdbcTemplate template, String procName) {
	    	super(template,procName);
	    	//ResultSetExtractor<List<StudentBo>> rm=new StudentResultSetExtractor();
	    	RowMapper rm=new RowMapper() {

				@Override
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					return rs.getString(1);
				}
	    		
	    	};
	    	declareParameter(new SqlReturnResultSet("RESULt_LIST",rm));
	       declareParameter(new SqlParameter("sid" , Types.INTEGER));
	    	compile();
	     }
	     
	     public Map getStudents() {
	    	 Map map=execute();
	    	 
	    	 return map;
	     }
	     public Map getName() {
	    	 Map map=execute(1);
	    	 
	    	 return map;
	     }
}
