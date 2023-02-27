package com.niit.bej.c2s1MysqlPc1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String productDescription;
    private int amountInStock;

    public Product(int productId, String productName, String productDescription, int amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountInStock = amountInStock;
    }

    public Product() {
    }
}
