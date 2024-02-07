package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.models.BorrowedBooks;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.BorrowedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowedBooksService {

    @Autowired
    private BorrowedBooksRepository borrowedBooksRepository;
    @Autowired
    private BookRepository bookRepository;
    //BookService bookService;

    /*public BookLoan addBookToBookLoan(String bookId, BookLoan bookLoan) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found!"));
        //BookLoan bookloan = bookLoanRepository.findById(bookLoanId).orElseThrow(() -> new RuntimeException("Book not found!"));
        //Book addedBook = bookService.createBook(book);

        // fixa här kolla om du kan göra en metod i BookLoan som vi gjorde med comment
        // du vill adda boken på arrayen loanedBooks
        bookLoan.getLoanedBooks().add(book);
        return bookLoanRepository.save(bookLoan);


    }*/

    /*public BorrowedBooks createBookLoan(String id, BorrowedBooks bookLoan) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found!"));
        bookLoan.addBook(book);
        System.out.println(book
        );
        return bookLoanRepository.save(bookLoan);
    }*/
    public BorrowedBooks addBooks(List<String> bookIds) {
        List<Book> books = bookRepository.findAllById(bookIds);
        BorrowedBooks borrowedBooks = new BorrowedBooks();
        borrowedBooks.setBooks(books);
        return borrowedBooksRepository.save(borrowedBooks);
    }

    /*public Book addBookToBookLoan(String bookId, BookLoan bookLoan){
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found!"));
        BookLoan saveBookLoan = bookLoanService.saveBookLoan(bookLoan);
        book.getBookLoans().add(saveBookLoan);
        return bookRepository.save(book);
    }*/

    // save bookLoan to db
   /* public BookLoan saveBookLoan(BookLoan bookLoan) {
        return bookLoanRepository.save(bookLoan);
    }*/
}
