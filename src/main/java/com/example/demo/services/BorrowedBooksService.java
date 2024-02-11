package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.models.BorrowedBooks;
import com.example.demo.models.User;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.BorrowedBooksRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowedBooksService {

    @Autowired
    private BorrowedBooksRepository borrowedBooksRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;


    //POST
    //create Borrowed books with userId and bookIds
    public BorrowedBooks addBooks(String userId, List<String> bookIds ) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (!userOptional.isPresent()) {
            throw new RuntimeException("User not found");
        }

        List<Book> books = new ArrayList<>();
        for (String bookId : bookIds) {
            Optional<Book> bookOptional = bookRepository.findById(bookId);
            bookOptional.ifPresent(books::add);
        }
        if (books.size() != bookIds.size()) {
            throw new RuntimeException("One or more books not found");
        }

        BorrowedBooks borrowedBooks = new BorrowedBooks();
        borrowedBooks.setUser(userOptional.get());
        borrowedBooks.setBooks(books);

        return borrowedBooksRepository.save(borrowedBooks);


    }

    //GET
    //Get all book Loans
    public List<BorrowedBooks> getAllBorrowedBooks() {
        return borrowedBooksRepository.findAll();
    }

    //PUT
    //Update specific book Loan by id
    public BorrowedBooks updateBorrowedBooks(BorrowedBooks borrowedBooks) {
        return borrowedBooksRepository.save(borrowedBooks);
    }

    //get specific borrowed books by id
    public Optional<BorrowedBooks> getBorrowedBooksById(String id) {
        return borrowedBooksRepository.findById(id);
    }

    //delete specific boorowed books by id
    public String deleteBorrowedBooksById(String id) {
        borrowedBooksRepository.deleteById(id);
        return "Book loan successfully deleted!";
    }




}


