package com.example.demo.repository;

import com.example.demo.models.BorrowedBooks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedBooksRepository extends MongoRepository<BorrowedBooks, String> {
}
