package com.example.springbootecommerce.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class PurchaseResponse implements Serializable {

    private final String orderTrackingNumber;

}
