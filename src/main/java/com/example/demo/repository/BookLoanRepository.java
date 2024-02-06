package com.example.demo.repository;

import com.example.demo.models.BookLoan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookLoanRepository extends MongoRepository<BookLoan, String> {

}
