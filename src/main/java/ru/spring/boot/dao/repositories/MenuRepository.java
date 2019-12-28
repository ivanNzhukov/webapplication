package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Menu;

import java.util.Date;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    Menu findByDateUntilEquals(Date date);
}
