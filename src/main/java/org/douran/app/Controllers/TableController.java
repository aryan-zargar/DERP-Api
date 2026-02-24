package org.douran.app.Controllers;

import org.douran.app.Models.Client;
import org.douran.app.Models.Table;
import org.douran.app.Models.Window;
import org.douran.app.Services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tables")
@CrossOrigin(origins = "*")
public class TableController {
    @Autowired
    private TableService tableService;

//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        Book savedBook = bookService.saveBook(book);
//        return ResponseEntity.ok(savedBook);
//    }

    @GetMapping
    public ResponseEntity<List<Table>> getAll() {
        List<Table> tables = tableService.getAllTables();
        return ResponseEntity.ok(tables);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Table> getById(@PathVariable Long id) {
        Table table = tableService.getTablesById(id);
        return ResponseEntity.ok(table);
    }
    @GetMapping(params = "windowId")
    public ResponseEntity<List<Table>> getTablesByWindowId(@RequestParam Long windowId) {
        List<Table> tables = tableService.getTablesByWindowId(windowId);
        return ResponseEntity.ok(tables);
    }

    @GetMapping(params = "orgId")
    public ResponseEntity<List<Table>> getTablesByOrgId(@RequestParam Long orgId) {
        List<Table> tables = tableService.getTablesByOrgId(orgId);
        return ResponseEntity.ok(tables);
    }
}
