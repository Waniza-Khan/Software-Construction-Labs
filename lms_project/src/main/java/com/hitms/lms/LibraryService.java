package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    /** Registers a new book in the library catalogue. */
    public void addBook(Book book) {
        books.add(book);
    }

    /** Registers a new member who is allowed to borrow books. */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Issues a book to a borrower.
     * @return true if the book existed and was available, false otherwise
     */
    public boolean issueBook(int bookId) {
        if (bookId <= 0) {
            throw new IllegalArgumentException("bookId must be positive");
        }
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.setIssued(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Looks up a registered member by id.
     * @return the matching member, or null if nobody has that id
     */
    public Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.getId() == memberId) {
                return m;
            }
        }
        return null;
    }

    /** @return number of books currently in the catalogue */
    public int totalBooks() {
        return books.size();
    }
}
