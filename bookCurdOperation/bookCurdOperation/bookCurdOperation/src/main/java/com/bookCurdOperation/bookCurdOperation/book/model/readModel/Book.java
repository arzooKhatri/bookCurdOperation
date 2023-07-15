package com.bookCurdOperation.bookCurdOperation.book.model.readModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "book_category")
    private String bookCategory;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "book_description")
    private String bookDescription;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "release_date")
    private Date releaseDate;

    public Book(int id, String bookCategory, String bookTitle, String bookDescription, String authorName, Date releaseDate) {
        this.id = id;
        this.bookCategory = bookCategory;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", authorName='" + authorName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
