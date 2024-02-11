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

    //book reference by ObjectId
    //@DBRef
    //private List<BookLoan> bookLoans =new ArrayList<>();
    // Do the exact same things but flip it to get a list of books inside bookloans instead!

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
