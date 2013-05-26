package com.indu.data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;
import com.indu.data.persistence.Users;

/**
 * JPA Implementation for working with User tables
 * 
 * @author Indu Devanath
 *
 */
@Repository(value="jpaUserDAO")
@Transactional
public class JPAUserDAO implements UserDAO {
	
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#insert(com.indu.data.User)
	 */
	@Override
	public boolean insert(User user) {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#update(com.indu.data.User)
	 */
	@Override
	public boolean update(User user) {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#deleteById(int)
	 */
	@Override
	public boolean deleteById(int id) {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findById(int)
	 */
	@Override
	public Users findById(int id) {
		return em.find(Users.class, id);
	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findByUserName(java.lang.String)
	 */
	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
