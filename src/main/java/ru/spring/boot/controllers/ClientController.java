package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.spring.boot.dao.entities.Client;
import ru.spring.boot.services.ClientService;

import java.util.Map;

@Controller
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(path = "/all")
    public Iterable<Client> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Client getClient(@PathVariable Integer id) {
        return clientService.getById(id);
    }

    @PostMapping(path = "/add")
    public void addClient(@RequestBody Map<String, String> map) {

        Client client = clientService.getClient(map);
        clientService.save(client);
    }

}
