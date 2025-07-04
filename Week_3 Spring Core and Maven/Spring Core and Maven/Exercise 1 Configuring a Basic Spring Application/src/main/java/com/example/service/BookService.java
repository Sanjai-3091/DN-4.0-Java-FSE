package com.example.service;

import com.example.bookrepository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String title = bookRepository.getBookTitle();
        System.out.println("Book Title: " + title);
    }
}
