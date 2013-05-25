package com.indu.data.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;

/**
 * JDBC implementation for User
 * 
 * For use of JDBC Template examples look at the following Spring DOC
 * http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/jdbc.html#jdbc-core
 * 
 * @author Indu Devanath
 *
 */
@Repository(value="jdbcUserDAO")
public class JdbcUserDAO implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findById(int)
	 */
	@Override
	public User findById(int id) {
		User user = this.jdbcTemplate.queryForObject(
				"select * from users where id=?",
				new Object[]{id},
				new RowMapper<User>(){
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("email"));
						return user;
					}
				});
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findByUserName(java.lang.String)
	 */
	@Override
	public User findByUserName(String userName) {
		User user = this.jdbcTemplate.queryForObject(
				"select * from users where user_name=?",
				new Object[]{userName},
				new RowMapper<User>(){
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("email"));
						return user;
					}
				});
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#insert(com.indu.data.User)
	 */
	@Override
	public void insert(User user) {
		this.jdbcTemplate.update("insert into users (user_name, email) values (?,?)", user.getName(), user.getEmail());
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#update(com.indu.data.User)
	 */
	@Override
	public void update(User user) {
		this.jdbcTemplate.update("update users set user_name=?, email=? where id=?", user.getName(), user.getEmail(), user.getId());
		
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#deleteById(int)
	 */
	@Override
	public void deleteById(int id) {
		this.jdbcTemplate.update("delete from users where id=?",id);
		
	}
	

}
