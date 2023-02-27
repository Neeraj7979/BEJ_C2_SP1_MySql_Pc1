package com.niit.bej.c2s1MysqlPc1.service;

import com.niit.bej.c2s1MysqlPc1.domain.Product;
import com.niit.bej.c2s1MysqlPc1.repositry.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product fetchProductById(Integer Id) {
        Optional<Product> optionalProduct = productRepository.findById(Id);
        return optionalProduct.get();
    }

    @Override
    public boolean deleteProductById(Integer id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            productRepository.deleteById(id);
            return true;
        } else return false;

    }
}
