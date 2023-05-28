package com.example.springbootecommerce.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaymentInfo implements Serializable {

    private int amount;
    private String currency;
    private String receiptEmail;
    
}
