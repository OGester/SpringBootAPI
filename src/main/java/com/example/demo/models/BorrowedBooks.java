package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "borrowedBooks")
public class BorrowedBooks {
    @Id
    private String id;

}
