package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {
}
