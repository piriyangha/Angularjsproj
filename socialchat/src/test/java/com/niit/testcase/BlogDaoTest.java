package com.niit.testcase;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogDao;
import com.niit.model.Blog;

public class BlogDaoTest {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	public static BlogDao blogDao;
	public static Blog blog;

	@BeforeClass
	public static void setUp() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		blogDao = (BlogDao) context.getBean("blogDao");
		blog = (Blog) context.getBean("blog");
	}

	@Test
	public void addBlogTest() {
		
		blog.setBlogname("ishaan");
		blog.setBlogcontent("abcd");
		Date date = new Date(02 / 02 / 18);
		blog.setCreatedate(date);
		blog.setStatus("available");
		assertEquals("insert Successfully", true, blogDao.addBlog(blog));
	}
	@Test
	public void updateBlogTest() {
	    blog.setBlogid(3);
		blog.setBlogname("anbu");
		blog.setBlogcontent("rhymes");
		Date date = new Date(02 / 02 / 18);
		blog.setCreatedate(date);
		blog.setStatus("available");
		assertEquals("insert Successfully", true, blogDao.updateBlog(blog));
	}
	@Test
	public void deleteBlogTest() {
	    blog.setBlogid(2);
		blog.setBlogname("anbu");
		blog.setBlogcontent("rhymes");
		Date date = new Date(02 / 02 / 18);
		blog.setCreatedate(date);
		blog.setStatus("available");
		assertEquals("insert Successfully", true, blogDao.deleteBlog(blog));
	}
}
