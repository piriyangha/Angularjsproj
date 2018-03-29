package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.BlogDao;
import com.niit.model.Blog;
@Repository("blogDao")
@Transactional
public class BlogDaoImpl implements BlogDao {

	@Autowired
SessionFactory sessionFactory;
	
	public boolean addBlog(Blog blog) {
		try {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
		return true;
		}catch(Exception e) {
			return false;
		}	
	}

	public boolean deleteBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().delete(blog);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	public boolean updateBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().update(blog);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	public Blog getBlog(int blogid) {
		try {
			Session session=sessionFactory.openSession();
			Blog blog=session.get(Blog.class,blogid);
			session.close();
			return blog;
			}catch(Exception e) {
				return null;
			}	
	}

	public boolean approveBlog(Blog blog) {
		
		try {
			blog.setStatus("NA");
			sessionFactory.getCurrentSession().update(blog);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	public boolean rejectBlog(Blog blog) {
		
		return false;
	}

	public List<Blog> listBlog(String username) {
		
		return null;
	}
	

}
