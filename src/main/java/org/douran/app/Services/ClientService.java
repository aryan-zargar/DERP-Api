package org.douran.app.Services;

import org.douran.app.Repositories.ClientRepository;
import org.douran.app.Models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;
    public ClientService (ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public List<Client> getAllClients() {
        return clientRepository.findAllClients();
    }
    public List<Client> getClientById(long id) {
        try {
            return clientRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
