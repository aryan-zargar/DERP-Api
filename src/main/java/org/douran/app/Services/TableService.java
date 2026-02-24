package org.douran.app.Services;

import org.douran.app.Models.Table;
import org.douran.app.Repositories.ClientRepository;
import org.douran.app.Models.Client;
import org.douran.app.Repositories.TableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    private TableRepository tableRepository;
    public TableService (TableRepository tableRepository){
        this.tableRepository = tableRepository;
    }
    public List<Table> getAllTables() {
        return tableRepository.findAllTables();
    }
    public Table getTablesById(long id) {
        try {
            return tableRepository.findById(id).get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Table> getTablesByWindowId(long id) {
        try {
            return tableRepository.findByWindowId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
