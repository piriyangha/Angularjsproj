package com.niit.testcase;

import static org.junit.Assert.assertEquals;

//import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.model.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	public static UserDao userDao;
	public static User user;

	@BeforeClass
	public static void setUp() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		userDao = (UserDao) context.getBean("userDao");
		user= (User) context.getBean("user");
	}
	@Test
	public void addUserTest() {
		user.setUsername("karthik");
		user.setPhone("0065456203");
		user.setEmail("karthikponniah@gmail.com");
		user.setAddress("singapore");
		user.setPassword("abc");
		assertEquals("insert Successfully", true, userDao.addUser(user));
	}
	}

