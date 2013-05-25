package com.indu.data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;

/**
 * JPA Implementation for working with User tables
 * 
 * @author Indu Devanath
 *
 */
@Repository
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
	public void insert(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#update(com.indu.data.User)
	 */
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#deleteById(int)
	 */
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.indu.data.dao.UserDAO#findById(int)
	 */
	@Override
	public User findById(int id) {
		return em.find(User.class, id);
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
