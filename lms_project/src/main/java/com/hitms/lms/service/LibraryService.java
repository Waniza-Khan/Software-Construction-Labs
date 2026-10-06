package com.hitms.lms.service;

import java.util.ArrayList;
import java.util.List;

import com.hitms.lms.model.Book;
import com.hitms.lms.util.LibraryUtils;

public class LibraryService {
    private final List<Book> books = new ArrayList<>();
    private int nextId = 1;

    /** Adds a book to the catalogue and returns it. */
    public Book addBook(String rawTitle) {
        Book b = new Book(nextId++, LibraryUtils.formatTitle(rawTitle));
        books.add(b);
        return b;
    }

    /** Issues a book; false if it is missing or already out. */
    public boolean issueBook(int id) {
        Book b = find(id);
        if (b == null || b.isIssued()) {
            return false;
        }
        b.setIssued(true);
        return true;
    }

    /** Returns a book; false if it was not issued. */
    public boolean returnBook(int id) {
        Book b = find(id);
        if (b == null || !b.isIssued()) {
            return false;
        }
        b.setIssued(false);
        return true;
    }

    public int countAvailable() {
        int n = 0;
        for (Book b : books) {
            if (!b.isIssued()) {
                n++;
            }
        }
        return n;
    }

    private Book find(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}