package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spring.boot.dao.entities.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
