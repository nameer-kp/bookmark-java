package com.company.bookmark.constants;

public enum  KidsFriendlyStatus {
    APPROVED("approved"),
    REJECTED("rejected"),
    UNKNOWN("unknown");

    public String getStatus() {
        return status;
    }

    private KidsFriendlyStatus(String status){
        this.status=status;
    }
    private String status;

}
