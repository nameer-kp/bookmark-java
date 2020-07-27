package com.company.bookmark.entities;

import com.company.bookmark.constants.BookGenre;
import com.company.bookmark.partner.Shareable;
import org.apache.commons.lang3.StringUtils;

public class Book extends Bookmark implements Shareable {
    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }

    @Override
    public boolean isKidFriendly() {
        return !genre.contains(BookGenre.PHILOSOPHY)&&!genre.contains(BookGenre.SELF_HELP);
    }

    @Override
    public String getItemData() {
        StringBuilder builder = new StringBuilder();
        builder.append("<item>");
        builder.append("<Title>").append(getTitle()).append("</Title>");
        builder.append("<authors>").append(StringUtils.join(authors,",")).append("</authors");
        builder.append("<publisher>").append(publisher).append("</publisher");
        builder.append("<publicationYear").append(publicationYear).append("</publicationYear>");
        builder.append("<genre>").append(genre).append("</genre>");
        builder.append("<amazonRating>").append(amazonRating).append("</amazonRating>");

        builder.append("</item>");

        return builder.toString();
    }

}
