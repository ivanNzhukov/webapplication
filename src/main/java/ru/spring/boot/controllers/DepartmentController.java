package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.spring.boot.dao.entities.Department;
import ru.spring.boot.dao.repositories.DepartmentRepository;

@Controller
@RequestMapping(path = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<Department> getAllMessages() {
        return departmentRepository.findAll();
    }
}
