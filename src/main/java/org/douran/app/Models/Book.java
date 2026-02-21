package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("REPOS.D_BOOKS")  // Maps to Oracle table D_BOOKS
public class Book {

    @Id
    @Column("ID")  // Maps to ID column in Oracle
    private Long id;

    @Column("TITLE")  // Maps to TITLE column
    private String title;

    @Column("AUTHOR")  // Maps to AUTHOR column
    private String author;

    @Column("ISBN")  // Maps to ISBN column
    private Integer isbn;

    // Default constructor (required by Spring Data JDBC)
    public Book() {
    }

    // Parameterized constructor
    public Book(Long id, String title, String author, Integer isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Another constructor without id (for inserts)
    public Book(String title, String author, Integer isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    // toString() for debugging
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    // equals() and hashCode() for collections
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn);
    }
}