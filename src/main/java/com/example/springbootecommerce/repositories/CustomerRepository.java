package com.example.springbootecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootecommerce.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // select * from customer c where c.email = theEmail
    // return null if not found 
    Customer findByEmail(String theEmail);
}