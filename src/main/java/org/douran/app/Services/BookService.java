package org.douran.app.Services;


import org.douran.app.DbConnections.BookRepository;
import org.douran.app.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public org.douran.app.Models.Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}