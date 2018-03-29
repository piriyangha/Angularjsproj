package com.niit.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.JobDao;
import com.niit.model.Job;

public class JobTest {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	public static JobDao jobDao;
	public static Job job;

	@BeforeClass
	public static void setUp() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		jobDao = (JobDao) context.getBean("jobDao");
		job = (Job)context.getBean("job");
	}
	@Test
	public void addJobTestCase() {
		job.setJobname("java developer");
		job.setJobdescription("java requirements");
		assertEquals("insert Successfully", true, jobDao.addJob(job));
	}

}
