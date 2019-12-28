package ru.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.boot.dao.entities.Message;
import ru.spring.boot.dao.repositories.MessageRepository;

@Service
public class MessageService implements Services<Message> {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }

    @Override
    public Message getById(Integer id) {
        return messageRepository.findById(id).orElse(null);
    }
}
