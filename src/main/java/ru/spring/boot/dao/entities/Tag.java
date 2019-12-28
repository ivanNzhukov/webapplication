package ru.spring.boot.dao.entities;

import javax.persistence.*;

@Entity  //Надо подумать, может обходиться как-то без сущности в БД, чтобы показать что-то иное, например ENUM
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToOne(mappedBy = "tag") //(mappedBy = "tag", cascade = CascadeType.ALL, orphanRemoval = true)
    private Message message;

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
