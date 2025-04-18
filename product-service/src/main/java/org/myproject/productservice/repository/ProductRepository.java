package org.myproject.productservice.repository;

import org.myproject.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByName(String name);

}
