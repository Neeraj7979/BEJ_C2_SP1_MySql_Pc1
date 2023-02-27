package com.niit.bej.c2s1MysqlPc1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && amountInStock == product.amountInStock && Objects.equals(productName, product.productName) && Objects.equals(productDescription, product.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productDescription, amountInStock);
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName='" + productName + '\'' + ", productDescription='" + productDescription + '\'' + ", amountInStock=" + amountInStock + '}';
    }
}
