package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.BlogDao;
import com.niit.model.Blog;
import com.niit.model.BlogComment;
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
			blog.setStatus("A");
			sessionFactory.getCurrentSession().update(blog);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	public boolean rejectBlog(Blog blog) {
		
		try {
			blog.setStatus("NA");
			sessionFactory.getCurrentSession().update(blog);
			return true;
			}catch(Exception e) {
				return false;
			}	
	}

	public List<Blog> listBlog(String username) {
		try {
		return sessionFactory.getCurrentSession().createQuery("From Blog where username=:username",Blog.class).list();
		}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public boolean incrementLike(Blog blog) {
		 try{
			 int likes=blog.getLikes();
			 likes++;
			 blog.setLikes(likes);
			 sessionFactory.getCurrentSession().update(blog);
			 return true;
		 }catch(Exception e)
		 {
			 return false;
		 }
	}

	@Override
	public boolean addBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().delete(blogComment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public BlogComment getBlogComment(int commentId) {
		try {
		return sessionFactory.getCurrentSession().get(BlogComment.class,commentId);	
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<BlogComment> listBlogComments(int blogId) {
		try {
			return sessionFactory.getCurrentSession().createQuery("From BlogComment where blogid=:blogId",BlogComment.class).list();
			}
			catch(Exception e) {
				return null;
			}
	}
	

}
