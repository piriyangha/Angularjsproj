package com.niit.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ForumDao;
import com.niit.model.Forum;

public class ForumTest {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	public static ForumDao forumDao;
	public static Forum forum;
	
	@BeforeClass
	public static void setUp() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		forumDao = (ForumDao) context.getBean("forumDao");
		forum= (Forum) context.getBean("forum");
		
	}
	@Test
	public void addForumTest() {
		
		forum.setFname("mathsfoeum");
		forum.setFcontent("algebra discussion");
		assertEquals("insert Successfully", true, forumDao.addForum(forum));
	}
@Test
	public void updateForumTest() {
		forum.setForumid(7);
		//forum.setFname("stackoverflow");
		forum.setFcontent("java discussion");
		assertEquals("insert Successfully", true, forumDao.updateForum(forum));
	}
@Test
	public void deleteForumTest() {
		forum.setForumid(7);
		/*forum.setFname("stackoverflow");
		forum.setFcontent("java doubts");*/
		assertEquals("insert Successfully", true, forumDao.deleteForum(forum));
	}
}
	


