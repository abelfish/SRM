package com.miu.edu.controller;


import com.miu.edu.dao.SupplierRepo;
import com.miu.edu.domain.Supplier;
import com.miu.edu.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable String id) {
        return supplierService.getSupplierById(id);
    }

    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.add(supplier);
    }

    @PutMapping("/{id}")
    public void updateSupplier(@PathVariable String id, @RequestBody Supplier supplier) {
        supplier.setSuppplierId(id);
        supplierService.update(supplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable String id) {
        supplierService.delete(supplierService.getSupplierById(id));
    }
}
