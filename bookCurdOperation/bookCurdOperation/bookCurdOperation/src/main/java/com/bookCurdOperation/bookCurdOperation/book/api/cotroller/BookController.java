package com.bookCurdOperation.bookCurdOperation.book.api.cotroller;

import com.bookCurdOperation.bookCurdOperation.book.api.constants.BookConstants;
import com.bookCurdOperation.bookCurdOperation.book.model.readModel.Book;
import com.bookCurdOperation.bookCurdOperation.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = BookConstants.BOOK_BASE_URL)
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = BookConstants.SAVE_BOOK)
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping(value = BookConstants.UPDATE_BOOK)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping(value = BookConstants.DELETE_BOOK)
    public void deleteBook(@RequestParam String bookTitle) {
        bookService.deleteBook(bookTitle);
    }
}