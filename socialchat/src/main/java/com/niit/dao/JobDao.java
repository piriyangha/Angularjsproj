package com.niit.dao;

import java.util.List;

import com.niit.model.Job;

public interface JobDao {
	public boolean addJob(Job job);
	public boolean deleteJob(Job job);
	public boolean updateJob(Job job);
	public Job getJob(int jobid);
	public boolean approveJob(Job job);
	public boolean rejectJob(Job job);
	public List<Job> listJob(String username);
	

}
