package com.itvedant.productcrudd.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.productcrudd.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
