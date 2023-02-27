package com.niit.bej.c2s1MysqlPc1.controller;

import com.niit.bej.c2s1MysqlPc1.domain.Product;
import com.niit.bej.c2s1MysqlPc1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/fetchAllProduct")
    public ResponseEntity<?> getAllProduct() {
        List<Product> productList = productService.getAllProduct();
        if (productList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(productList, HttpStatus.FOUND);
    }

    @PostMapping("/addNewProduct")
    public ResponseEntity<?> addNewProduct(@RequestBody Product product) {
        Product newProduct = productService.addProduct(product);
        if (newProduct != null)
            return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);

    }
}
