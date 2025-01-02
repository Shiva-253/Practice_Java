package com.prorigo.thrillio.dao;

import com.prorigo.thrillio.DataStore;
import com.prorigo.thrillio.entities.Bookmark;
import com.prorigo.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}
}
