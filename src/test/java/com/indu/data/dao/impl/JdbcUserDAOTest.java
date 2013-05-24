package com.indu.data.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;

/**
 * Tests for JdbcUserDAO
 * 
 * @author Indu Devanath
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class JdbcUserDAOTest {
	
	UserDAO userDAO;
	User mockUser;
	
	/**
	 * Get the Application Context so you can test the jdbcUserDAO bean.
	 * Note that this test will connect to database as defined in the test resources configuration.
	 * 
	 */
	@Before
	public void initialize(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.userDAO = (UserDAO)context.getBean("jdbcUserDAO");
		
		this.mockUser = mock(User.class);
		when(this.mockUser.getId()).thenReturn(1);
		when(this.mockUser.getName()).thenReturn("Lisa");
		when(this.mockUser.getEmail()).thenReturn("lisa@email.com");
	}

	@Test
	public void findByUserName(){
		User testUser = this.userDAO.findByUserName("indu");
		assertEquals(testUser.getName(), "indu");
	}
	
	@Test
	public void insertTest(){
		this.userDAO.insert(this.mockUser);
		User testUser = this.userDAO.findByUserName(this.mockUser.getName());
		assertEquals(testUser.getEmail(), this.mockUser.getEmail());
	}
	
	@Test
	public void updateTest(){
		
	}
	
	@Test
	public void deleteByIdTest(){
		
	}
	
	@Test
	public void findById(){
		
	}

}
