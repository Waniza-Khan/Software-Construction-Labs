package com.hitms.lms;

public class Book {
    private final int id;
    private final String title;
    private boolean issued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
