package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class BlogComment {
	
	    @Id
	    @GeneratedValue 
		private int bcommmentiD;
		private String commentText;
		@ManyToOne
		private User commentby;
        private Date commentDate;
        @ManyToOne
        private Blog blog;
        
      
		
		public Blog getBlog() {
			return blog;
		}
		public void setBlog(Blog blog) {
			this.blog = blog;
		}
		public int getBcommmentiD() {
			return bcommmentiD;
		}
		public void setBcommmentiD(int bcommmentiD) {
			this.bcommmentiD = bcommmentiD;
		}
		public String getCommentText() {
			return commentText;
		}
		public void setCommentText(String commentText) {
			this.commentText = commentText;
		}
	
		public User getCommentby() {
			return commentby;
		}
		public void setCommentby(User commentby) {
			this.commentby = commentby;
		}
		public Date getCommentDate() {
			return commentDate;
		}
		public void setCommentDate(Date commentDate) {
			this.commentDate = commentDate;
		}

}
