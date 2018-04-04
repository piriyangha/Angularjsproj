package com.niit.dao;

import java.util.List;

import com.niit.model.Job;
import com.niit.model.JobApply;

public interface JobDao {
	public boolean addJob(Job job);
	public boolean deleteJob(Job job);
	public boolean updateJob(Job job);
	public Job getJob(int jobid);
	public List<Job> listAllJobs();
	public boolean applyJob(JobApply applyJob);
	public List<JobApply> getAllAppliedJobDetails();
}
