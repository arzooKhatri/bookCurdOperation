package com.bookCurdOperation.bookCurdOperation.book.service;

import com.bookCurdOperation.bookCurdOperation.book.model.readModel.Book;

public interface BookService {

    Book saveBook(Book book);

    Book updateBook(Book book);

    void deleteBook(String bookTitle);

}