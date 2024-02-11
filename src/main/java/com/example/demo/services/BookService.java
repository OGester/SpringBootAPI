package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // update book
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    //get specific book by id
    public Optional<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }

    // delete specific book by id
    public String deleteBookById(String id) {
        bookRepository.deleteById(id);
        return "Book successfully deleted!";
    }


}
