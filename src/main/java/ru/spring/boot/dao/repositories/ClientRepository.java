package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
