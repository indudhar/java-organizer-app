package org.indu.data.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.indu.data.User;
import org.indu.data.dao.UserDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		
		this.userDAO.insert(this.mockUser);
	}

	@Test
	public void insertAndFindByUserNameTest(){
		User testUser = (User)this.userDAO.findByUserName(this.mockUser.getName());
		assertEquals(testUser.getEmail(), this.mockUser.getEmail());
	}
	
	@Test
	public void updateTest(){
		final String newEmail = "new@email.com";
		User testUser = (User)this.userDAO.findByUserName("Lisa");
		testUser.setEmail(newEmail);
		this.userDAO.update(testUser);
		testUser = (User)this.userDAO.findByUserName("Lisa");
		assertEquals(testUser.getEmail(),newEmail);
	}
	
	@Test
	public void findById(){
		User testUser = (User)this.userDAO.findByUserName(this.mockUser.getName());
		User testUserById = (User)this.userDAO.findById(testUser.getId());
		assertEquals(testUser.getName(), testUserById.getName());
	}
	
	@After
	public void cleanup(){
		User testUser = (User)this.userDAO.findByUserName(this.mockUser.getName());
		this.userDAO.deleteById(testUser.getId());
	}
	
	

}
