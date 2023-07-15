package com.bookCurdOperation.bookCurdOperation.book.model.repository;

import com.bookCurdOperation.bookCurdOperation.book.model.readModel.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    //insert
    @Query(value = "insert into Book (id, bookCategory, lastName, bookDescription, authorName, releaseDate) values (id, bookCategory, lastName, bookDescription, authorName, releaseDate) ")
    Book saveBook(@Param("book") Book book);

    //update
    @Modifying
    @Query(value = "update Book  set where Book=:Book")
    Book updateBook(@Param("book") Book book);

    //delete
    @Query(value = "delete from Book b where b.bookTitle=:bookTitle")
    Book deleteBookByTitle(@Param("bookTitle") String bookTitle);
}
