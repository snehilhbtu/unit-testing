package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LibraryCatalogTest {

    @Test
    public void testBorrowBook() {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);

        // Test borrowing an available book
        libraryCatalog.borrowBook("The Great Gatsby");
        assertFalse(book1.isAvailable());

        // Test borrowing a non-existent book
        assertDoesNotThrow(() -> libraryCatalog.borrowBook("Nonexistent Book"));

        // Test borrowing an already borrowed book
        assertDoesNotThrow(() -> libraryCatalog.borrowBook("The Great Gatsby"));
    }

    @Test
    public void testReturnBook() {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("1984", "George Orwell");
        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);

        // Borrow a book first
        libraryCatalog.borrowBook("1984");

        // Test returning an already borrowed book
        libraryCatalog.returnBook("1984");
        assertTrue(book2.isAvailable());

        // Test returning a non-existent book
        assertDoesNotThrow(() -> libraryCatalog.returnBook("Nonexistent Book"));
    }
}
