package com.company.bookmark.controllers;

import com.company.bookmark.constants.KidsFriendlyStatus;
import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.User;
import com.company.bookmark.managers.BookmarkManager;
import com.company.bookmark.partner.Shareable;

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

    public void setKidFriendlyStatus(KidsFriendlyStatus kidFriendlyStatus, User user, Bookmark bookmark) {
        bookmark.setKidFriendlyStatus(kidFriendlyStatus);
        bookmark.setKidsFriendlyMarkedUser(user);
        System.out.println("kidfriendlyStatus"+","+kidFriendlyStatus+"--> "+bookmark+"  Marked by "+bookmark.getKidsFriendlyMarkedUser().getEmail());

    }

    public void share(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().share(user,bookmark);
        System.out.println("Shared Bookmark---> "+bookmark+" "+"Shared BY----->"+user);
    }
}
