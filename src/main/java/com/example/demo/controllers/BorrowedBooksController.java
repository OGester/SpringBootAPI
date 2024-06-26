package com.example.demo.controllers;

import com.example.demo.dto.BorrowDTO;
import com.example.demo.models.BorrowedBooks;
import com.example.demo.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/borrowedbooks")
public class BorrowedBooksController {

    @Autowired
    BorrowedBooksService borrowedBooksService;

    //POST
    @PostMapping
    public ResponseEntity<BorrowedBooks> borrowBooks(@RequestBody BorrowDTO request) {
        BorrowedBooks borrowedBooks = borrowedBooksService.addBooks(request.getUserId(), request.getBookIds());
        return new ResponseEntity<>(borrowedBooks, HttpStatus.CREATED);
    }

    //GET
    @GetMapping("/all")
    public List<BorrowedBooks> getAllBorrowedBooks() {
        return borrowedBooksService.getAllBorrowedBooks();
    }

    //PUT
    @PutMapping()
    public BorrowedBooks updateBorrowedBooks(@RequestBody BorrowedBooks borrowedBooks) {
        return borrowedBooksService.updateBorrowedBooks(borrowedBooks);
    }

    //GET borrowedBooks by id
    @GetMapping("/{id}")
    public ResponseEntity<BorrowedBooks> getBorrowedBooksById(@PathVariable String id) {
        Optional<BorrowedBooks> borrowedBooks = borrowedBooksService.getBorrowedBooksById(id);
        return borrowedBooks.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //DELETE borrowedBooks by id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBorrowedBooksById(@PathVariable String id) {
        return borrowedBooksService.deleteBorrowedBooksById(id);
    }



}

