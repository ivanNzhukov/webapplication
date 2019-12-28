package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
