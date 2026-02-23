package org.douran.app.Controllers;

import org.douran.app.Models.Book;
import org.douran.app.Models.Client;
import org.douran.app.Services.BookService;
import org.douran.app.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;

//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        Book savedBook = bookService.saveBook(book);
//        return ResponseEntity.ok(savedBook);
//    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id).get(0);
        return ResponseEntity.ok(client);
    }
}
