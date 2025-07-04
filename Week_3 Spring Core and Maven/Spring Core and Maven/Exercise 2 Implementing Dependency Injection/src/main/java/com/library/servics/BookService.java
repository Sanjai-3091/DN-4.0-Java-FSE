package com.library.servics;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String title = bookRepository.getBookTitle();
        System.out.println("Book Title: " + title);
    }
}
