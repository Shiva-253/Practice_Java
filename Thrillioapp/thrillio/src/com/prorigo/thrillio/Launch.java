package com.prorigo.thrillio;

import com.prorigo.thrillio.entities.Bookmark;
import com.prorigo.thrillio.entities.User;
import com.prorigo.thrillio.managers.BookmarkManager;
import com.prorigo.thrillio.managers.UserManager;

public class Launch {
	
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	
	private static void loadData() {
		System.out.println("1. Loading Data.....");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Printing data...");
		//printUserData();
		//printBookmarkData();
	}
	
	private static void start() {
		//System.out.println("2. Bookmarking ...");
		
		for(User user: users) {
			View.browse(user, bookmarks);
		}
	}

	private static void printBookmarkData() {
		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark: bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void printUserData() {
		for(User user: users) {
			System.out.println(user);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
		start();
	}


}
