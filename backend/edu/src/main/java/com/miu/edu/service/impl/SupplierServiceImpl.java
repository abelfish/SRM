package com.miu.edu.service.impl;

import com.miu.edu.dao.SupplierRepo;
import com.miu.edu.domain.Supplier;
import com.miu.edu.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepo supplierRepo;
    @Override
    public Supplier add(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    @Override
    public Supplier getSupplierById(String id) {
        return supplierRepo.findById(id).get();
    }

    @Override
    public void delete(Supplier supplier) {
        supplierRepo.delete(supplier);
    }

    @Override
    public void update(Supplier supplier) {
        supplierRepo.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll().stream().toList();
    }
}
