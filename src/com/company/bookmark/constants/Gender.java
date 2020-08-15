package com.company.bookmark.constants;

public enum  Gender {
    MALE(0),
    FEMALE(1),
    TRANSGENDER(2);
    private Gender(int i){
        this.i=i;
    }
    private int i;

    public int getI() {
        return i;
    }
}


