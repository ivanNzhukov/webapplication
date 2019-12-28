package ru.spring.boot.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spring.boot.dao.entities.Staff;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}
