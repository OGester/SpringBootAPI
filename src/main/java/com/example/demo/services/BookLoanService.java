package com.example.demo.services;

import com.example.demo.models.BookLoan;
import com.example.demo.repository.BookLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookLoanService {

    @Autowired
    private BookLoanRepository bookLoanRepository;

    // save bookLoan to db
    public BookLoan saveBookLoan(BookLoan bookLoan) {
        return bookLoanRepository.save(bookLoan);
    }
}
