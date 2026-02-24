package org.douran.app.Services;

import org.douran.app.Models.Window;
import org.douran.app.Repositories.ClientRepository;
import org.douran.app.Models.Client;
import org.douran.app.Repositories.WindowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindowService {
    private WindowRepository windowRepository;
    public WindowService (WindowRepository windowRepository){
        this.windowRepository = windowRepository;
    }
    public List<Window> getAllWindows() { return windowRepository.findAllWindows();}
    public List<Window> getWindowByClientId(long id) {
        try {
            return windowRepository.findByClientId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Window> getWindowByOrgId(long id) {
        try {
            return windowRepository.findByOrgId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
