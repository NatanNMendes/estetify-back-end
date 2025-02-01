package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.PaymentMethodStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies.CashPaymentStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies.CreditCardPaymentStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies.PixPaymentStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies.TicketPaymentStrategy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PaymentMethodFactory {
    private static final Map<TypePaymentMethod, PaymentMethodStrategy> strategies = new HashMap<>();

    static {
        strategies.put(TypePaymentMethod.CASH, new CashPaymentStrategy());
        strategies.put(TypePaymentMethod.CREDIT_CARD, new CreditCardPaymentStrategy());
        strategies.put(TypePaymentMethod.PIX, new PixPaymentStrategy());
        strategies.put(TypePaymentMethod.TICKET, new TicketPaymentStrategy());
    }

    public static PaymentMethod createPayment(TypePaymentMethod type, Integer id, Double amount, String currency, LocalDateTime transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {
        PaymentMethodStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
        return strategy.createPayment(id, amount, currency, transactionDate, status, additionalAttributes);
    }
}
