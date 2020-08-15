package com.company.bookmark.constants;

public enum  UserType {
    USER ("user"),
    EDITOR ("editor"),
    CHIEF_EDITOR ("chiefeditor");
    private UserType(String userType){

    }

    public String getUserType() {
        return userType;
    }

    private String userType;
}
