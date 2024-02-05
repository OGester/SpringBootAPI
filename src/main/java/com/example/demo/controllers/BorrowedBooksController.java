package com.example.demo.controllers;

import com.example.demo.models.BorrowedBooks;
import com.example.demo.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/borrowedBooks")
public class BorrowedBooksController {
    @Autowired
    BorrowedBooksService borrowedBooksService;

    //PUT create book loan
    @PostMapping()
    public BorrowedBooks createLoan(@RequestBody BorrowedBooks borrowedBooks) {
        return borrowedBooksService.createBookLoan(borrowedBooks);
    }
    @GetMapping("/all")
    public List<BorrowedBooks> getAllLoans() {
        return borrowedBooksService.getAllLoans();
    }

}
