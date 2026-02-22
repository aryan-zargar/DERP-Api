package org.douran.app.Controllers;
import org.douran.app.Other.Encryption;
import org.douran.app.Models.Book;
import org.douran.app.Models.User;
import org.douran.app.Services.BookService;
import org.douran.app.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    private Encryption encryptor = new Encryption();


    @PostMapping("/login")
    public ResponseEntity<String> Login(@RequestBody User user) throws NoSuchAlgorithmException {
        String username = user.getUsername();
        String password = user.getPassword();
        User foundedUser = null; // Declare outside

        try {
            List<User> users = userService.getUserByName(username);
            foundedUser = users.get(0);
        }
        catch (Exception e) {
            return ResponseEntity.ok(" هیچ کاربری با این نام وجود ندارد ");
        }

        if (foundedUser != null) {
            String client_id = foundedUser.getClientId();
            String EncryptionReadyString = client_id + username + password;
            String Hash = encryptor.toHexString(encryptor.getSHA(EncryptionReadyString));
            String userPassword = foundedUser.getPassword();
            if(Hash != null ) {
                if(Hash.equals(userPassword)){
                    return ResponseEntity.ok("200|"+Hash);
                }
                else {
                    return ResponseEntity.ok("رمز عبور شما اشتباه است");
                }
            }
            else{
                return ResponseEntity.ok("something went wrong");
            }
        }
        else{
            return ResponseEntity.ok("هیچ کاربری با این نام وجود ندارد");
        }
    }
}
