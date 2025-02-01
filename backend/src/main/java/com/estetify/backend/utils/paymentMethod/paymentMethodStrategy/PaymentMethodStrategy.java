package com.estetify.backend.utils.paymentMethod.paymentMethodStrategy;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import java.util.Date;
import java.util.Map;

public interface PaymentMethodStrategy {
    PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes);
}