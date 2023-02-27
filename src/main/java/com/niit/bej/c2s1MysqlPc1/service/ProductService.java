package com.niit.bej.c2s1MysqlPc1.service;

import com.niit.bej.c2s1MysqlPc1.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product addProduct(Product product);

    Product fetchProductById(Integer Id);

    boolean deleteProductById(Integer id);


}
