package com.indu.data.dao;

import com.indu.data.User;

/**
 * DAO interface for table 'users'
 * 
 * @author Indu Devanath
 *
 */
public interface UserDAO {
	
	public void insert(User user);
	public User findById(int id);

}
