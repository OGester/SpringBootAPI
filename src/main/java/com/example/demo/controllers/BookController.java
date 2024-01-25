package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/api/books")
public class BookController {

    @Autowired
    BookService bookService;

    //POST
    @PostMapping()
        public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
        }

    //GET
    @GetMapping("/all")
        public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    //PUT
    @PutMapping()
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    //GET book by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    //DELETE book by id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBookById(@PathVariable String id) {
        return bookService.deleteBookById(id);
    }
}
