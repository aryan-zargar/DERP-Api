package org.douran.app.Services;

import org.douran.app.DbConnections.BookRepository;
import org.douran.app.DbConnections.UserRepository;
import org.douran.app.Models.Book;
import org.douran.app.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;
    // Get all books
    public List<User> getAllBooks() {
        return UserRepository.findAllUsers();
    }
    public List<User> getUserByName(String name) {
        try {
            return UserRepository.findByName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
