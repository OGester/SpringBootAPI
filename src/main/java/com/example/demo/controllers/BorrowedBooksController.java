package com.example.demo.controllers;

import com.example.demo.models.BorrowedBooks;
import com.example.demo.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/bookloans")
public class BorrowedBooksController {

    @Autowired
    BorrowedBooksService borrowedBooksService;

    //POST add book to BookLoan by ObjectId
   /* @PostMapping()
    public ResponseEntity<BookLoan> addBookToBookLoan(@RequestBody BookLoan bookLoan) {
        try {
            BookLoan updatedBookLoan = bookLoanService.addBookToBookLoan(bookId, bookLoan);
            return ResponseEntity.ok(updatedBookLoan);

        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    /*@PostMapping("/{id}")
    public ResponseEntity<BorrowedBooks> createBookLoan(@PathVariable String id, @RequestBody BorrowedBooks bookLoan){
        try {
            bookLoanService.createBookLoan(id, bookLoan);
            return ResponseEntity.ok(bookLoan);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    @PostMapping
    public BorrowedBooks borrowBooks(@RequestBody List<String> bookIds) {
        return borrowedBooksService.addBooks(bookIds);
    }
}
