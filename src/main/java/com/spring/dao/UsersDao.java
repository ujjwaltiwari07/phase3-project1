package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.users.UsersEntity;

@Repository
public class UsersDao {

	@Autowired
	JdbcTemplate template;
	
	
	public List<UsersEntity> getAllUsers(){
		
		return template.query("select * from users", new RowMapper<UsersEntity>() {

			@Override
			public UsersEntity mapRow(ResultSet result, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				UsersEntity object = new UsersEntity();
				object.setUserid(result.getInt(1));
				object.setUserName(result.getString(2));
				object.setPhone(result.getInt(3));
				return object;
			}
		});
	}
	
	public UsersEntity getRequestedUser(int userid) {
		
		return template.query("select * from users where User_id="+userid, new ResultSetExtractor<UsersEntity>() {

			@Override
			public UsersEntity extractData(ResultSet result) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(result.next()) {
				UsersEntity object = new UsersEntity();
				object.setUserid(result.getInt(1));
				object.setUserName(result.getString(2));
				object.setPhone(result.getInt(3));
				
				return object;
			}
			return null;
			}
		});
	}
	
	
	public UsersEntity getEmpById(int id){    
	    String sql="select * from users where User_Id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<UsersEntity>(UsersEntity.class));    
	} 
	
	
	public int update(UsersEntity p){    
	    String sql="update users set User_Name='"+p.getUserName()+"', Phone_Number="+p.getPhone()+" where User_Id="+p.getUserid()+"";    
	    return template.update(sql);    
	}    
}
