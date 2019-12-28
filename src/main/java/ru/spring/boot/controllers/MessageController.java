package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.spring.boot.dao.entities.Message;
import ru.spring.boot.dao.entities.Tag;
import ru.spring.boot.services.MessageService;

@Controller
@RequestMapping(path = "/message")
public class MessageController {

    @Autowired()
    private MessageService messageService;

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<Message> getAllMessages() {
        return messageService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Message getMessage(@PathVariable Integer id) {
        return messageService.getById(id);
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public void addNewMessage(@RequestParam String text, @RequestParam String tag) {

        Message message = new Message(text, new Tag(tag));
        messageService.save(message);
        //  return "Saved";
    }
}
