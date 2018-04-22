package com.niit.daoimpl;

import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.niit.dao.UserDao;
import com.niit.model.User;


@Service
@Repository("userdao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean registerUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public List<User> listUsers() {
		try {
			return	sessionFactory.getCurrentSession().createQuery("FROM User",User.class).list();	
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public User checkLogin(User user) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where username=:username and password=:password");
		query.setParameter("username",user.getUsername());
		query.setParameter("password",user.getPassword());
		return (User)query.uniqueResult();
	}

	/*@Override
	public boolean updateOnlineStatus(String status, User user) {
		try {
			user.setIsonline(status);
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
*/
	@Override
	public User getUser(String loginname) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, loginname);
			} catch (Exception e) {
			return null;
		}
	}
	public User getUserByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where email=:email");
		query.setParameter("email", email);
		return (User) query.uniqueResult();
}
}