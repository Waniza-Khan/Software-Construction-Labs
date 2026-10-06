package com.hitms.lms;

import java.time.LocalDate;

import com.hitms.lms.model.Book;
import com.hitms.lms.service.LibraryService;
import com.hitms.lms.util.LibraryUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(LibraryUtils.formatTitle(" the great gatsby "));
        System.out.println(LibraryUtils.daysBetween(
            LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));

        LibraryService lib = new LibraryService();
        Book b1 = lib.addBook(" Harry and the beanstalk ");
        lib.addBook("1984");
        System.out.println("Added: " + b1.getTitle());
        System.out.println("Issue #1: " + lib.issueBook(1));
        System.out.println("Issue #1 again: " + lib.issueBook(1));
        System.out.println("Available: " + lib.countAvailable());
        System.out.println("Return #1: " + lib.returnBook(1));
        System.out.println("Available: " + lib.countAvailable());
    }
}
