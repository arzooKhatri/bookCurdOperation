package com.bookCurdOperation.bookCurdOperation.book.service.impl;

import com.bookCurdOperation.bookCurdOperation.book.model.readModel.Book;
import com.bookCurdOperation.bookCurdOperation.book.model.repository.BookRepository;
import com.bookCurdOperation.bookCurdOperation.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.saveBook(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.updateBook(book);
    }

    @Override
    public void deleteBook(String title) {
        bookRepository.deleteBookByTitle(title);
    }
}
