class Book {
     String bookID;
     String title;
     String author;
    boolean availabilityStatus;

    public Book(String bookID, String title, String author, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
    }

    public boolean checkAvailability() {
        return availabilityStatus;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Programming", "John Doe", true);
        book1.displayBookDetails();
        System.out.println("Is the book available? " + (book1.checkAvailability() ? "Yes" : "No"));
    }
}