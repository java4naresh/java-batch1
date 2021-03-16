package com.sai.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
		StudentBo	sb=template.queryForObject("select * from student where id=?",new Object[] {2}, new StudentRowMapper());
		System.out.println(sb);
	}
		
	class StudentRowMapper implements RowMapper<StudentBo>{

		public StudentBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentBo sb=new StudentBo();
			while(rs.next()) {
				sb.setId(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setAddress(rs.getString(3));
				sb.setMobileNo(rs.getString(4));
			}
			return sb;
		}
	
	
	}
}

