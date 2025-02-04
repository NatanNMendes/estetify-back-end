package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import java.util.Date;
import java.util.Map;

interface StrategyPaymentMethod {
    PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes);
}