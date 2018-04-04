package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

@Autowired
SessionFactory sessionFactory;
	@Override
	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public boolean updateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
