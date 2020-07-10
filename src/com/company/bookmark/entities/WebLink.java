package com.company.bookmark.entities;

import com.company.bookmark.partner.Shareable;

public class WebLink extends Bookmark implements Shareable {
    private String url;
    private String host;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WebLink{" +
                "url='" + url + '\'' +
                ", host='" + host + '\'' +
                '}';
    }

    @Override
    public boolean isKidFriendly() {
        return !url.contains("porn") && !getTitle().contains("porn") && !host.contains("adult");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String getItemData() {
        StringBuilder builder =new StringBuilder();
        builder.append("<item>");
        builder.append("<Type>").append("WebLink").append("</Type>");
        builder.append("<title>").append(getTitle()).append("</title>");
        builder.append("url").append(getUrl()).append("</url>");
        builder.append("<host>").append(getHost()).append("</host>");
        builder.append("</item>");
        return builder.toString();
    }
}
