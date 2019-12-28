package ru.spring.boot.services;

import ru.spring.boot.dao.entities.Supplier;
import ru.spring.boot.dao.forms.GoodsForm;

public interface Services<T> {

    Iterable<T> findAll();

    void save(T t);

    T getById(Integer id);

}
