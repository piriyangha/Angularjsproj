package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ForumDao;
import com.niit.model.Blog;
import com.niit.model.BlogComment;
import com.niit.model.Forum;
import com.niit.model.ForumComment;

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
		try {
		return sessionFactory.getCurrentSession().get(Forum.class,fid);
		}catch(Exception e) {
		return null;
		}
	}

	@Override
	public boolean approveForum(Forum forum) {
		try {
			forum.setStatus("A");
			sessionFactory.getCurrentSession().update(forum);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean rejectForum(Forum forum) {
		try {
			forum.setStatus("NA");
			sessionFactory.getCurrentSession().update(forum);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Forum> listForum(String username) {
		try {
			return sessionFactory.getCurrentSession().createQuery("From Forum where username=:username",Forum.class).list();
			}
			catch(Exception e) {
				return null;
			}
	}

	@Override
	public boolean addForumComment(ForumComment forumComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forumComment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteForumComment(ForumComment forumComment) {
		try {
			sessionFactory.getCurrentSession().delete(forumComment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ForumComment getForumComment(int commentId) {
		try {
			return sessionFactory.getCurrentSession().get(ForumComment.class,commentId);	
			}catch(Exception e) {
				return null;
			}
	}

	@Override
	public List<ForumComment> listForumComments(int forumId) {
		try {
			return sessionFactory.getCurrentSession().createQuery("From ForumComment where forumid=:forumId",ForumComment.class).list();
			}
			catch(Exception e) {
				return null;
			}
	}

}
