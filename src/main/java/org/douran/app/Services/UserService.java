package org.douran.app.Services;

import org.douran.app.DbConnections.UserRepository;
import org.douran.app.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAllUsers();
    }
    public List<User> getUserByName(String name) {
        try {
            return userRepository.findByName(name);
        } catch (Exception e) {
            throw new RuntimeException("Error finding user by name: " + name, e);
        }
    }
}