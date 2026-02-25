package org.douran.app.Services;

import org.douran.app.Models.Client;
import org.douran.app.Models.Tab;
import org.douran.app.Repositories.ClientRepository;
import org.douran.app.Repositories.TabRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabService {
    private TabRepository tabRepository;
    public TabService (TabRepository tabRepository){
        this.tabRepository = tabRepository;
    }
    public List<Tab> getAllTabs() {
        return tabRepository.findAllTab();
    }
    public List<Tab> getByClientId(long id) {
        try {
            return tabRepository.findByClientId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Tab> getByOrgId(long id) {
        try {
            return tabRepository.findByOrgId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Tab> getByTableId(long id) {
        try {
            return tabRepository.findByTableId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
