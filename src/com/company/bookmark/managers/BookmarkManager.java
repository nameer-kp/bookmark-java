package com.company.bookmark.managers;

import com.company.bookmark.Utils.HttpConnect;
import com.company.bookmark.Utils.IOutils;
import com.company.bookmark.constants.BookGenre;
import com.company.bookmark.constants.MovieGenre;
import com.company.bookmark.dao.BookmarkDao;
import com.company.bookmark.entities.*;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

public class BookmarkManager {
    private static BookmarkManager instance = new BookmarkManager();
    private static BookmarkDao dao=new BookmarkDao();
    private BookmarkManager(){}
    public static BookmarkManager getInstance(){
        return instance;
    }
    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String [] directors, MovieGenre genre, double imbdRating)
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
    public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher, String[] authors, BookGenre genre, double amazonRating)
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

    public WebLink createWebLink(long id,String title,String url,String host)
    {
        WebLink webLink=new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setHost(host);
        webLink.setUrl(url);
        return webLink;
    }
    public List<List<Bookmark>> getBookmark(){

        return dao.getBookmark();
    }
    public void saveUserBookmark(User user, Bookmark bookmark)
    {
        UserBookmark userBookmark =new UserBookmark();
        userBookmark.setUser(user);
        userBookmark.setBookmark(bookmark);
        dao.saveUserBookmark(userBookmark);
        if (bookmark instanceof WebLink)
        {
            try{
                String url = ((WebLink) bookmark).getUrl();
                if (!url.endsWith(".pdf")){
                    String webpage = HttpConnect.download(url);
                    if ((webpage)!= null)
                    {
                        IOutils.write(webpage,bookmark.getId());
                    }
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }


    public void share(User user, Bookmark bookmark) {
        bookmark.setSharedBy(user);
        if (bookmark instanceof Book){
            System.out.println(((Book)bookmark).getItemData());}
        else {
            System.out.println(((WebLink)bookmark).getItemData());
        }

    }
}
