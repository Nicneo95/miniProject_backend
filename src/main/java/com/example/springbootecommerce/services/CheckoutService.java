package com.example.springbootecommerce.services;

import java.util.List;

import com.example.springbootecommerce.data.PaymentInfo;
import com.example.springbootecommerce.data.Purchase;
import com.example.springbootecommerce.data.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

    List<Purchase> fetchAllPurchase();
}
