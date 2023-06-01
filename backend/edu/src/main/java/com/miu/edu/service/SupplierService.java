package com.miu.edu.service;


import com.miu.edu.domain.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    Supplier add(Supplier supplier);

    Supplier getSupplierById(String id);

    void delete(Supplier supplier);

    void update(Supplier supplier);

    List<Supplier> getAllSuppliers();
}
