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
     * Issues one copy of the given title; throws BookUnavailableException
     * if no copies are left in the catalogue.
     * @return true once the copy has been issued
     * @throws BookUnavailableException if the book is missing or already out
     */
    public boolean issueBook(int bookId) throws BookUnavailableException {
        if (bookId <= 0) {
            throw new IllegalArgumentException("bookId must be positive");
        }
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.setIssued(true);
                return true;
            }
        }
        throw new BookUnavailableException("No copy available for book id " + bookId);
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

    /** @return how many members are registered with the library */
    public int totalMembers() {
        return members.size();
    }

    /** @return number of books currently in the catalogue */
    public int totalBooks() {
        return books.size();
    }
}