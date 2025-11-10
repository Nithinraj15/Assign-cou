package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book.");
            return;
        }
        books.add(book);
        System.out.println("Book added: " + book);
    }
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n--- List of Books in the Library ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
