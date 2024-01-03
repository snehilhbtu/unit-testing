package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LibraryCatalogTest {

    @Test
    public void testBorrowBook() {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book book1 = new Book("Book1", "Writer1");
        Book book2 = new Book("Book2", "Writer2");
        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);

        // Test borrowing an available book
        libraryCatalog.borrowBook("Book1");
        assertFalse(book1.isAvailable());

        // Test borrowing a non-existent book
        assertDoesNotThrow(() -> libraryCatalog.borrowBook("Book3"));

        // Test borrowing an already borrowed book
        assertDoesNotThrow(() -> libraryCatalog.borrowBook("Book1"));
    }

    @Test
    public void testReturnBook() {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book book1 = new Book("Book1", "Writer1");
        Book book2 = new Book("Book2", "Writer2");
        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);

        // Borrow a book first
        libraryCatalog.borrowBook("Book1");

        // Test returning an already borrowed book
        libraryCatalog.returnBook("Book1");
        assertTrue(book2.isAvailable());

        // Test returning a non-existent book
        assertDoesNotThrow(() -> libraryCatalog.returnBook("Book3"));
    }
}
