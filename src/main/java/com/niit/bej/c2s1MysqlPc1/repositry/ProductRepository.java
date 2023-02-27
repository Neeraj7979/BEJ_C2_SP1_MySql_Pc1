package com.niit.bej.c2s1MysqlPc1.repositry;

import com.niit.bej.c2s1MysqlPc1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
