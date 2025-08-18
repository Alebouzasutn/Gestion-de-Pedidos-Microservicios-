package com.ordermanagement.productservice.repository;

import com.ordermanagement.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Si querés, luego podemos agregar métodos custom como findByName, etc.
}
