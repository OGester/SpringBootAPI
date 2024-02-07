package com.example.demo.repository;

import com.example.demo.models.BorrowedBooks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowedBooksRepository extends MongoRepository<BorrowedBooks, String> {

}
