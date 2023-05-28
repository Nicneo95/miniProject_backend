package com.example.springbootecommerce.data;

import java.io.Serializable;
import java.util.Set;

import com.example.springbootecommerce.entities.Address;
import com.example.springbootecommerce.entities.Customer;
import com.example.springbootecommerce.entities.Order;
import com.example.springbootecommerce.entities.OrderItem;

import lombok.Data;

@Data
public class Purchase implements Serializable {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
