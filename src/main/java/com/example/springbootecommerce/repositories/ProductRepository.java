package com.example.springbootecommerce.repositories;


import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.springbootecommerce.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    // SELECT * FROM Product p WHERE p.name like CONCAT('%', :name, '%')
    Page<Product> findByNameContaining(@Param("name") String name, Pageable page);
}
