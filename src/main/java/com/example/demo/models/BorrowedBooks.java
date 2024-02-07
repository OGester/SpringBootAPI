package com.example.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "borrowedBooks")
public class BorrowedBooks {
    @Id
    private String id;

    @DBRef
    private List<Book> books =new ArrayList<>();

    private String userId = "123";

    @CreatedDate
    private Date borrowedAt;


    private LocalDate returnAt = LocalDate.now().plusDays(14);


    public BorrowedBooks() {
    }


    public String getId() {
        return id;
    }

    /*public String[] getBooksLoaned() {
        return booksLoaned;
    }*/

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


    public void setBorrowedAt(Date borrowedAt) {
        this.borrowedAt = borrowedAt;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}