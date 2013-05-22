package com.indu.data.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;

/**
 * JDBC implementation for User
 * 
 * @author Indu Devanath
 *
 */
public class JdbcUserDAO implements UserDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#insert(com.indu.data.User)
	 */
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findById(int)
	 */
	@Override
	public User findById(int id) {
		String sql = "select * from users where id=?";
		Connection connection = null;

		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				User user = new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("email"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;


	}

}
