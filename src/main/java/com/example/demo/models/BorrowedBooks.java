package com.example.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "borrowedBooks")
public class BorrowedBooks {
    @Id
    private String id;
    //@DocumentReference(lazy = true) private List<Book> books;

    //@DocumentReference(collection = "books")
    private String[] borrowedBooks;
    //@DocumentReference
    //private List<Book> books;

    //@DocumentReference(collection = "users")
    private String userId;

    @CreatedDate
    private Date borrowedAt;


    private LocalDate returnAt = LocalDate.now().plusDays(14);


    public BorrowedBooks() {
    }

    public String getId() {
        return id;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getUserId() {
        return userId;
    }

    public Date getBorrowedAt() {
        return borrowedAt;
    }

    public LocalDate getReturnAt() {
        return returnAt;
    }

    public void setReturnAt(LocalDate returnAt) {
        this.returnAt = returnAt;
    }

   /* public List<Book> getBooks() {
        return books;
    }*/
}