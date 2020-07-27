package com.company.bookmark.entities;

import com.company.bookmark.constants.KidsFriendlyStatus;

public abstract class Bookmark {
    private long id;
    private String title;
    private String profileUrl;

    private User kidsFriendlyMarkedUser;

    public User getSharedBy() {
        return sharedBy;
    }

    public void setSharedBy(User sharedBy) {
        this.sharedBy = sharedBy;
    }

    private User sharedBy;

    public String getKidFriendlyStatus() {
        return kidFriendlyStatus;
    }

    public void setKidFriendlyStatus(String kidFriendlyStatus) {
        this.kidFriendlyStatus = kidFriendlyStatus;
    }

    private String kidFriendlyStatus= KidsFriendlyStatus.UNKNOWN;

    @Override
    public String toString() {
        return "Bookmark{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                '}';
    }

    public abstract boolean isKidFriendly();
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public User getKidsFriendlyMarkedUser() {
        return kidsFriendlyMarkedUser;
    }

    public void setKidsFriendlyMarkedUser(User kidsFriendlyMarkedUser) {
        this.kidsFriendlyMarkedUser = kidsFriendlyMarkedUser;
    }
}
