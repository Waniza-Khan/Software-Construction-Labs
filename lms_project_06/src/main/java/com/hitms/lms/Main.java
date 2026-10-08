package com.hitms.lms;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.addBook(new Book(101, "Clean Code"));
        service.addBook(new Book(102, "Effective Java"));
        service.addMember(new Member(1, "Waniza Khan"));

        System.out.println("Books in library: " + service.totalBooks());

        try {
            System.out.println("Issue 101 -> " + service.issueBook(101));
        } catch (BookUnavailableException e) {
            System.out.println("Issue 101 -> refused: " + e.getMessage());
        }

        try {
            System.out.println("Issue 101 again -> " + service.issueBook(101));
        } catch (BookUnavailableException e) {
            System.out.println("Issue 101 again -> refused: " + e.getMessage());
        }
    }
}
