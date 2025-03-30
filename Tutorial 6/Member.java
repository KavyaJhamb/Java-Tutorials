
package library.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }
}

// File: library/members/Member.java
package library.members;

import library.books.Book;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }
}

// File: library/transactions/Transaction.java
package library.transactions;

import library.books.Book;
import library.members.Member;

 class Transaction {
    public static void borrowBook(Book book, Member member) {
        if (!book.isBorrowed()) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public static void returnBook(Book book, Member member) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book was not borrowed by this member.");
        }
    }
}

// File: Main.java
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Member member1 = new Member("Alice", "M001");

        Transaction.borrowBook(book1, member1);
        Transaction.returnBook(book1, member1);
    }
}
