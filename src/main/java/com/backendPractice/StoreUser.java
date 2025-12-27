package com.backendPractice;

import org.springframework.stereotype.Repository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class StoreUser {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	public void save(String Name,String passWord) {
		String sql="insert into loginpage (emailId,Password) values(?,?)";
		jdbctemplate.update(sql,Name,passWord);
	}
	
}
