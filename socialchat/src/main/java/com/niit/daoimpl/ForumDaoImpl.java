package com.niit.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ForumDao;
import com.niit.model.Forum;

@Repository("forumDao")
@Transactional
public class ForumDaoImpl implements ForumDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addForum(Forum forum) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forum);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean deleteForum(Forum forum) {
		try {
			sessionFactory.getCurrentSession().delete(forum);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean updateForum(Forum forum) {
		try {
			sessionFactory.getCurrentSession().update(forum);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public Forum getForum(int fid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

}
