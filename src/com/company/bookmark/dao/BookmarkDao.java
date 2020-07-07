package com.company.bookmark.dao;

import com.company.bookmark.DataStore;
import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmark (){
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.saveUserBookmark(userBookmark);
    }
}
