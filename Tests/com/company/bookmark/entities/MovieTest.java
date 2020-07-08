package com.company.bookmark.entities;

import com.company.bookmark.constants.MovieGenre;
import com.company.bookmark.managers.BookmarkManager;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void isKidFriendly() {
        Movie movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[]{"Orson Welles", "Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.HORROR,8.5);
        boolean isKidFriendly=movie.isKidFriendly();
        assertFalse("must be false test1",isKidFriendly);
        // test 2
        movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[]{"Orson Welles", "Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.THRILLERS,8.5);
        isKidFriendly=movie.isKidFriendly();
        assertFalse("must be false",isKidFriendly);
    }
}