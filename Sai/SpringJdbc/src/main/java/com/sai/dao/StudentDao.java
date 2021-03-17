package com.sai.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.stereotype.Component;

import com.sai.bo.StudentBo;

@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void allStudnets() {
		StudentBo	sb=template.queryForObject("select * from student where id=?",new Object[] {1}, new StudentRowMapper());
		System.out.println(sb);
	}
	
	/*
	 * public void allStudentRecords() { List<StudentBo>
	 * sb=template.query("select * from student", new Object[] {}, new
	 * StudentResultSetExtractor()); System.out.println(sb); }
	 */	
	public void allStudentRecords1() {
		List<StudentBo> sb=template.query("select * from student", new Object[] {}, new ResultSetExtractor<List<StudentBo>>() {

			public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<StudentBo> list= new ArrayList();
				while(rs.next()) {
			    StudentBo sb=new StudentBo();
				sb.setId(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setAddress(rs.getString(3));
				sb.setMobileNo(rs.getString(4));
				list.add(sb);
			}
			return  list;				
			}
		
		});
   System.out.println(sb);
	}
	

	 
	 
	 
	 
	 
	 
	class StudentRowMapper implements RowMapper<StudentBo>{

		public StudentBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentBo sb=new StudentBo();
				sb.setId(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setAddress(rs.getString(3));
				sb.setMobileNo(rs.getString(4));
			return sb;
		}
	}
		
	
	class StudentResultSetExtractor implements ResultSetExtractor<List<StudentBo>>{

		public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentBo> list= new ArrayList();
			while(rs.next()) {
		    StudentBo sb=new StudentBo();
			sb.setId(rs.getInt(1));
			sb.setName(rs.getString(2));
			sb.setAddress(rs.getString(3));
			sb.setMobileNo(rs.getString(4));
			list.add(sb);
		}
		return  list;
		
		}
		
	
	}


	
}

