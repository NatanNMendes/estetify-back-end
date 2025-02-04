package com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.PaymentMethodStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodType.PaymentMethodCreditCard;

import java.util.Date;
import java.util.Map;

public class CreditCardPaymentStrategy implements PaymentMethodStrategy {
    @Override
    public PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {
        String cardNumber = additionalAttributes.getOrDefault("cardNumber", "").toString();
        String cardholderName = additionalAttributes.getOrDefault("cardholderName", "").toString();
        Date expirationDate = additionalAttributes.containsKey("expirationDate")
                ? (Date) additionalAttributes.get("expirationDate")
                : new Date();
        String cvv = additionalAttributes.getOrDefault("cvv", "").toString();
        Integer installments = additionalAttributes.containsKey("installments")
                ? Integer.parseInt(additionalAttributes.get("installments").toString())
                : 1;
        String cardBrand = additionalAttributes.getOrDefault("cardBrand", "").toString();

        return new PaymentMethodCreditCard(id, amount, currency, transactionDate, status,
                cardNumber, cardholderName, expirationDate, cvv, installments, cardBrand);
    }
}
