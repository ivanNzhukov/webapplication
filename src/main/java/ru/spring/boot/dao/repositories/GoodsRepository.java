package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Goods;

public interface GoodsRepository extends CrudRepository<Goods, Integer> {

    Goods findByName(String name);

}
