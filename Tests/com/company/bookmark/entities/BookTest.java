package com.company.bookmark.entities;

import com.company.bookmark.constants.BookGenre;
import com.company.bookmark.managers.BookmarkManager;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void isKidFriendly() {
        //test 1 philosophy --false
        Book book = BookmarkManager.getInstance().createBook(4000,"Walden","",1854,"Wilder Publications",new String[]{"Henry David Thoreau"}, BookGenre.PHILOSOPHY,4.3);
        boolean iskidfriendly = book.isKidFriendly();
        assertFalse("this should false",iskidfriendly);
        //test 2 self help -- false
        book = BookmarkManager.getInstance().createBook(4000,"Walden","",1854,"Wilder Publications",new String[]{"Henry David Thoreau"}, BookGenre.SELF_HELP,4.3);
        iskidfriendly = book.isKidFriendly();
        assertFalse("this should false",iskidfriendly);

    }
}