package com.holder.entities;


// this saves all the bookmarks a user creates
// mantains the relation between a user and bookmarks
public class UserBookmark {
	
	private User user;
	private Bookmark bookmark;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bookmark getBookmark() {
		return bookmark;
	}
	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}

}
