package com.company.bookmark.dao;

import com.company.bookmark.DataStore;
import com.company.bookmark.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmark (){
        return DataStore.getBookmarks();
    }
}
