package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    // create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    // get a list of all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();

    }
}
