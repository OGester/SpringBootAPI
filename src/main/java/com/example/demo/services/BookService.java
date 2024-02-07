package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    private BorrowedBooksService bookLoanService;

    // create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    // get a list of all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // update book
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    //get specific book by id
    public Book getBookById(String id) {
        return bookRepository.findById(id).get();
    }

    // delete specific book by id
    public String deleteBookById(String id) {
        bookRepository.deleteById(id);
        return "Book successfully deleted!";
    }

    //POST add bookloan to user with ObjectId reference
    /*public Book addBookToBookLoan(String bookId, BookLoan bookLoan){
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found!"));
        BookLoan saveBookLoan = bookLoanService.saveBookLoan(bookLoan);
        book.getBookLoans().add(saveBookLoan);
        return bookRepository.save(book);
    }*/
}
