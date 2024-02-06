package com.example.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "borrowedBooks")
public class BookLoan {
    @Id
    private String id;

    private String[] booksLoaned;

    private String userId;

    @CreatedDate
    private Date borrowedAt;


    private LocalDate returnAt = LocalDate.now().plusDays(14);


    public BookLoan() {
    }

    public String getId() {
        return id;
    }

    public String[] getBooksLoaned() {
        return booksLoaned;
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


}