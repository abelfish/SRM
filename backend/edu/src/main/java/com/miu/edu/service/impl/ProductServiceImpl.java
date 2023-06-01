package com.miu.edu.service.impl;


import com.miu.edu.dao.ProductRepo;
import com.miu.edu.dao.SupplierRepo;
import com.miu.edu.domain.Product;
import com.miu.edu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    SupplierRepo supplierRepo;

    @Override
    public Product add(Product product) {
        if (supplierRepo.findBySupplierName(product.getSupplier().getSupplierName()).size() == 0)
            supplierRepo.save(product.getSupplier());
        else {
            product.setSupplier(supplierRepo.findBySupplierName(product.getSupplier().getSupplierName()).get(0));
        }
        return productRepo.save(product);
    }

    @Override
    public void delete(String productId) {
        productRepo.deleteById(productId);

    }

    @Override
    public void update(Product product) {
        productRepo.save(product);
    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll().stream().toList();
    }
}
