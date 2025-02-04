package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FactoryPaymentMethod {
    private static final Map<TypePaymentMethod, StrategyPaymentMethod> strategies = new HashMap<>();

    static {
        strategies.put(TypePaymentMethod.CASH, new StrategyPaymentMethodCash());
        strategies.put(TypePaymentMethod.CREDIT_CARD, new StrategyPaymentMethodCreditCard());
        strategies.put(TypePaymentMethod.PIX, new StrategyPaymentMethodPix());
        strategies.put(TypePaymentMethod.TICKET, new StrategyPaymentMethodTicket());
    }

    public static PaymentMethod createPayment(TypePaymentMethod type, Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {
        StrategyPaymentMethod strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
        return strategy.createPayment(id, amount, currency, transactionDate, status, additionalAttributes);
    }
}
