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
	public void update(User user);
	public void deleteById(int id);
	public User findById(int id);
	public User findByUserName(String userName);

}
