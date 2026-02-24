package org.douran.app.Controllers;

import org.douran.app.Models.Book;
import org.douran.app.Models.Client;
import org.douran.app.Models.Window;
import org.douran.app.Services.BookService;
import org.douran.app.Services.ClientService;
import org.douran.app.Services.WindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/windows")
@CrossOrigin(origins = "*")
public class WindowController {
    public WindowController(WindowService windowService) {
        this.windowService = windowService;
    }
    private WindowService windowService;

    @GetMapping
    public ResponseEntity<List<Window>> getAllWindows() {
        List<Window> windows = windowService.getAllWindows();
        return ResponseEntity.ok(windows);
    }

    @GetMapping(params = "clientId")
    public ResponseEntity<List<Window>> getWindowsByClientId(@RequestParam Long clientId) {
        List<Window> windows = windowService.getWindowByClientId(clientId);
        return ResponseEntity.ok(windows);
    }

    @GetMapping(params = "orgId")
    public ResponseEntity<List<Window>> getWindowsByOrgId(@RequestParam Long orgId) {
        List<Window> windows = windowService.getWindowByOrgId(orgId);
        return ResponseEntity.ok(windows);
    }
}
