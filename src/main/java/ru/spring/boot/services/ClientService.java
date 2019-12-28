package ru.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.boot.dao.dto.PersonDto;
import ru.spring.boot.dao.entities.Client;
import ru.spring.boot.dao.entities.Person;
import ru.spring.boot.dao.repositories.ClientRepository;

import java.util.Date;
import java.util.Map;

@Service
public class ClientService implements Services<Client> {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client getClient(Map<String, String> map) {
        Person person = PersonDto.getPerson(map);
        Client client = new Client(person);
        Date date = new Date(System.currentTimeMillis());
        client.setFirstVisit(date);
        client.setLastVisit(date);
        return client;
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client getById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }
}
