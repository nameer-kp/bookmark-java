package com.company.bookmark;

import com.company.bookmark.entities.Bookmark;
import com.company.bookmark.entities.User;
import com.company.bookmark.entities.UserBookmark;
import com.company.bookmark.managers.BookmarkManager;
import com.company.bookmark.managers.UserManager;

import java.util.List;

public class Launcher {
    private static List<User> users;
    private static List<List<Bookmark>> bookmarks;
    private static DataStore store =new DataStore();

    private static void loadData(){
        System.out.println("Loading data...");
        DataStore.loadData();
//        System.out.println("Printing data...");
        users = UserManager.getInstance().getUsers();
        bookmarks= BookmarkManager.getInstance().getBookmark();
//        for (User user:users) {
//            System.out.println(user);
//        }
//        for (Bookmark [] bookmarkList:bookmarks)
//            for (Bookmark bookmark:bookmarkList) {
//                System.out.println(bookmark);
//            }
    }

    public static void main(String[] args) {
        loadData();
        startBookmarking();

    }

    private static void startBookmarking() {
        System.out.println("\nStart Bookmarking");
        for (User user:users) {
            View.browse(user,bookmarks);
        }

    }
}
