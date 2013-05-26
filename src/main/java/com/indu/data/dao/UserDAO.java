package com.indu.data.dao;

import com.indu.data.User;


/**
 * DAO interface for table 'users'
 * 
 * @author Indu Devanath
 *
 */
public interface UserDAO {
	
	public boolean insert(User user);
	public boolean update(User user);
	public boolean deleteById(int id);
	public User findById(int id);
	public User findByUserName(String userName);

}
