package com.miu.edu.service;


import com.miu.edu.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product add(Product product);

    void delete(String productId);

    void update(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();
}
