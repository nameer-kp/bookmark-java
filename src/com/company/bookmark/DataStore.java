package com.company.bookmark;

import com.company.bookmark.constants.Gender;
import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.User;
import com.company.bookmark.entities.UserBookmark;
import com.company.bookmark.managers.UserManager;

public class DataStore {

    public static final int USER_BOOKMARK_LIMIT = 5;
    public static final int BOOKMARK_COUNT_PER_TYPE = 5;
    public static final int TOTAL_USER_COUNT = 5;
    public static final int BOOKMARK_TYPES_COUNT = 3;

    private static User[] users=new User[TOTAL_USER_COUNT];
    private static Bookmark[][] bookmarks=new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
    private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];

    public void loadData(){
        loadUser();
    }

    private void loadUser() {
        users[0]= UserManager.getInstance().createUser(1000,"user0@semanticsquare.com","test","John	","M", Gender.MALE ,"user");
        users[1]= UserManager.getInstance().createUser(1001,"user1@semanticsquare.com","test","Sam","M", Gender.MALE ,"user");
        users[2]= UserManager.getInstance().createUser(1002,"user2@semanticsquare.com","test","Sara","M", Gender.FEMALE ,"editor");
        users[3]= UserManager.getInstance().createUser(1003,"user3@semanticsquare.com","test","Anita","M", Gender.FEMALE ,"editor");
        users[4]= UserManager.getInstance().createUser(1004,"user4@semanticsquare.com","test","Dheeru","M", Gender.MALE ,"chiefeditor");
    }

}

