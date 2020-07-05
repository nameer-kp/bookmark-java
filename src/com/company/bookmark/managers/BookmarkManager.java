package com.company.bookmark.managers;

import com.company.bookmark.entities.Book;
import com.company.bookmark.entities.Movie;
import com.company.bookmark.entities.WebLink;

public class BookmarkManager {
    private static BookmarkManager instance = new BookmarkManager();
    private BookmarkManager(){}
    public static BookmarkManager getInstance(){
        return instance;
    }
    public Movie createMovie(long id,String title,String profileUrl,int releaseYear,String[] cast,String [] directors,String genre,double imbdRating)
    {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imbdRating);

        return movie;
    }
    public Book createBook(long id,String title,String profileUrl,int publicationYear,String publisher,String[] authors,String genre,double amazonRating)
    {
        Book book=new Book();
        book.setId(id);
        book.setTitle(title);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setProfileUrl(profileUrl);
        return book;
    }

    public WebLink createWebLink(long id,String title,String profileUrl,String url,String host)
    {
        WebLink webLink=new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setProfileUrl(profileUrl);
        webLink.setHost(host);
        webLink.setUrl(url);
        return webLink;
    }
}
