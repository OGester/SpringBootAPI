package com.example.demo.services;

import com.example.demo.models.BorrowedBooks;
import com.example.demo.repository.BorrowedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowedBooksService {
    @Autowired
    BorrowedBooksRepository borrowedBooksRepository;

    //create new book loan
    public BorrowedBooks createBookLoan(BorrowedBooks borrowedBooks) {
        return borrowedBooksRepository.save(borrowedBooks);
    }
    //get a list of all book loans
    public List<BorrowedBooks> getAllLoans() {
        return borrowedBooksRepository.findAll();
    }
}
