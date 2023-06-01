package com.miu.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    private String productId;
    private String productName;
    private double unitPrice;
    private int quantityInStock;
    private Supplier supplier;
    private Date dateSupplied;


}
