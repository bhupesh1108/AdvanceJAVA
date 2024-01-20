package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.EmpleaveDetails;
import com.sun.tools.javac.jvm.Target;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	JdbcTemplate jdbctemp;
	static int a;
	
	public EmpleaveDetails getData() {
		int id=811234;
	try {	
	 return jdbctemp.queryForObject("select *from leavedetails where empno=?",new Object[] {id},BeanPropertyRowMapper.newInstance(EmpleaveDetails.class));
	}catch(EmptyResultDataAccessException e) {
		System.out.println(e.getMessage());
		return null;
	}
	
}

	public void add(EmpleaveDetails p) {
		
		a=1;
		jdbctemp.update(" insert into leavedetails values(?,?,?,?,?,?,?)",new Object[] {a,p.leave_applied_on,p.start_date,p.end_date,p.leave_type,p.leave_reason,p.empno}  );
		
	}

	public EmpleaveDetails getall() {
		// TODO Auto-generated method stub
		return null;
	}

//	public EmpleaveDetails getall() {
//		// TODO Auto-generated method stub
//		return jdbctemp.query("select * from leavedetails", (rs,num)->{
//			EmpleaveDetails e=EmpleaveDetails();
//			e.leave_id(rs.getInt(1));
//			e.leave_applied_on(rs.getDate(2));
//			
//		});
	
	}
