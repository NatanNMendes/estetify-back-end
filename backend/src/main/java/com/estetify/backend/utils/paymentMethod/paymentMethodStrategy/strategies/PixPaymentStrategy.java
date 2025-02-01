package com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.PaymentMethodStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodType.PaymentMethodPix;


import java.util.Date;
import java.util.Map;

public class PixPaymentStrategy implements PaymentMethodStrategy {
    @Override
    public PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {
        // Verificando se os atributos existem e convertendo para String de forma segura
        String pixKey = additionalAttributes.getOrDefault("pixKey", "").toString();
        String bankName = additionalAttributes.getOrDefault("bankName", "").toString();
        String transactionID = additionalAttributes.getOrDefault("transactionID", "").toString();

        // Criando e retornando a instância do PaymentMethodPix
        return new PaymentMethodPix(id, amount,currency, transactionDate, status, pixKey, bankName, transactionID);
    }
}
