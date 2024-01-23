package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    @Id
    private String id;

    private String bookTitle;

    private String bookAuthor;

    private String bookDescription;

    private String genre;

    public Book() {
    }

    public String getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public String getGenre() {
        return genre;
    }
}
