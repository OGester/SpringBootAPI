package com.example.demo.controllers;

import com.example.demo.dto.BorrowDTO;
import com.example.demo.models.BorrowedBooks;
import com.example.demo.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/borrowedbooks")
public class BorrowedBooksController {

    @Autowired
    BorrowedBooksService borrowedBooksService;


    @PostMapping
    public ResponseEntity<BorrowedBooks> borrowBooks(@RequestBody BorrowDTO request) {
        BorrowedBooks borrowedBooks = borrowedBooksService.addBooks(request.getUserId(), request.getBookIds());
        return new ResponseEntity<>(borrowedBooks, HttpStatus.CREATED);
    }



    /*public BorrowedBooks borrowBooks(@RequestBody List<String> bookIds, @RequestParam String userId) {
        return borrowedBooksService.addBooks(bookIds, userId);
    }*/


}

