package com.company.bookmark.entities;

import com.company.bookmark.managers.BookmarkManager;

import static org.junit.Assert.*;

public class WebLinkTest {

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void isKidFriendly() {
        // test 1 for  porn in url -- false
        WebLink webLink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/porn-tiger--part-2.html","http://www.javaworld.com");

         boolean isKidsFriendly= webLink.isKidFriendly();
         assertFalse("Good to Go with test 1",isKidsFriendly);
        // test 2 for porn in title -- false
        webLink = BookmarkManager.getInstance().createWebLink(2000,"Taming porn, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/fdsf-tiger--part-2.html","http://www.javaworld.com");

        isKidsFriendly= webLink.isKidFriendly();
        assertFalse("Good to Go with test 2",isKidsFriendly);

        //test 3 for adult in host -- false

        webLink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/fsfg-tiger--part-2.html","http://www.adult.com");

        isKidsFriendly= webLink.isKidFriendly();
        assertFalse("Good to Go with test 3",isKidsFriendly);
        //test 4 adult in url but not in host --true

        webLink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/adult-tiger--part-2.html","http://www.javaworld.com");

        isKidsFriendly= webLink.isKidFriendly();
        assertTrue("Good to Go with test 4",isKidsFriendly);
        //test 5 adult in title only --true
        webLink = BookmarkManager.getInstance().createWebLink(2000,"Taming adult, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/fdsf-tiger--part-2.html","http://www.javaworld.com");

        isKidsFriendly= webLink.isKidFriendly();
        assertTrue("Good to Go with test 5",isKidsFriendly);
    }
}