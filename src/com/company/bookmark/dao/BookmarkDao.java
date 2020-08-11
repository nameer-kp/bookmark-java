package com.company.bookmark.dao;

import com.company.bookmark.DataStore;
import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.UserBookmark;

import java.util.List;

public class BookmarkDao {
    public List<List<Bookmark>> getBookmark (){
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.saveUserBookmark(userBookmark);
    }
}
