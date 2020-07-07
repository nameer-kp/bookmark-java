package com.company.bookmark.controllers;

import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.User;
import com.company.bookmark.managers.BookmarkManager;

public class Controller {
    private Controller(){}
    private static Controller instance = new Controller();
    public static Controller getInstance() {
        return instance;
    }
    public static void saveUserBookmark(User user, Bookmark bookmark)
    {
        BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
    }
}
