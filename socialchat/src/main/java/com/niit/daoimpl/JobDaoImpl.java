package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.JobDao;
import com.niit.model.Job;
@Repository("jobDao")
@Transactional
public class JobDaoImpl implements JobDao{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addJob(Job job) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(job);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean deleteJob(Job job) {
		try {
			sessionFactory.getCurrentSession().delete(job);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean updateJob(Job job) {
		try {
			sessionFactory.getCurrentSession().update(job);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public Job getJob(int jobid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Job> listJob(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
