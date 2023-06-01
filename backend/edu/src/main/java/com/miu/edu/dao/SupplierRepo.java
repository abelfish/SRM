package com.miu.edu.dao;


import com.miu.edu.domain.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends MongoRepository<Supplier,String> {

    List<Supplier> findBySupplierName(String supplierName);
}
