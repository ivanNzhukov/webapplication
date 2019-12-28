package ru.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.boot.dao.entities.Supplier;
import ru.spring.boot.dao.repositories.SupplierRepository;

@Service
public class SupplierService implements Services<Supplier> {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public Supplier getById(Integer id) {
        return supplierRepository.findById(id).orElse(null);
    }
}
