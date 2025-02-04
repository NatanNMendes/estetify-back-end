package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;

import java.util.Date;
import java.util.Map;

class StrategyPaymentMethodTicket implements StrategyPaymentMethod {
    @Override
    public PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {
        String ticketNumber = additionalAttributes.getOrDefault("ticketNumber", "").toString();
        Date expirationDate = additionalAttributes.containsKey("expirationDate")
                ? (Date) additionalAttributes.get("expirationDate")
                : new Date();
        String barcode = additionalAttributes.getOrDefault("barcode", "").toString();
        String issuer = additionalAttributes.getOrDefault("issuer", "").toString();

        return new PaymentMethodTicket(id, amount, currency, transactionDate, status,
                ticketNumber, expirationDate, barcode, issuer);
    }
}
