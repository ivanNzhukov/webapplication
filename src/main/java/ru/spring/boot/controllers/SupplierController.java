package ru.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.spring.boot.dao.entities.Supplier;
import ru.spring.boot.services.SupplierService;

@Controller
@RequestMapping(path = "/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping(path = "/all")
    public Iterable<Supplier> getAllSuppliers() {
        return supplierService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Supplier getSupplier(@PathVariable Integer id) {
        return supplierService.getById(id);
    }

}
