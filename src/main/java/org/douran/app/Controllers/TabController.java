package org.douran.app.Controllers;

import org.douran.app.Models.Book;
import org.douran.app.Models.Client;
import org.douran.app.Models.Tab;
import org.douran.app.Models.Table;
import org.douran.app.Services.BookService;
import org.douran.app.Services.ClientService;
import org.douran.app.Services.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tabs")
@CrossOrigin(origins = "*")
public class TabController {
    @Autowired
    private TabService tabService;

//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        Book savedBook = bookService.saveBook(book);
//        return ResponseEntity.ok(savedBook);
//    }

    @GetMapping
    public ResponseEntity<List<Tab>> getAllTabs() {
        List<Tab> tabs = tabService.getAllTabs();
        return ResponseEntity.ok(tabs);
    }
    @GetMapping(params = "tableId")
    public ResponseEntity<List<Tab>> getTabsByTableId(@RequestParam Long tableId) {
        List<Tab> tabs = tabService.getByTableId(tableId);
        return ResponseEntity.ok(tabs);
    }

    @GetMapping(params = "clientId")
    public ResponseEntity<List<Tab>> getTabsByClientId(@RequestParam Long clientId) {
        List<Tab> tabs = tabService.getByClientId(clientId);
        return ResponseEntity.ok(tabs);
    }
    @GetMapping(params = "orgId")
    public ResponseEntity<List<Tab>> getTabsByOrgId(@RequestParam Long orgId) {
        List<Tab> tabs = tabService.getByOrgId(orgId);
        return Responset aEntity.ok(tabs);
    }
}
