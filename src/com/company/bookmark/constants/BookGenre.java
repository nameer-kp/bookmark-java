package com.company.bookmark.constants;

public enum  BookGenre {
    ART("art"),
    BIOGRAPHY("biography"),
    CHILDREN("children"),
    FICTION("fiction"),
    HISTORY("history"),
    PHILOSOPHY("philosophy"),
    RELIGION("religion"),
    ROMANCE("romance"),
    SELF_HELP("self help"),
    TECHNICAL("technical");
    private String name;
    private BookGenre(String name){
        this.name=name;
    }

}
