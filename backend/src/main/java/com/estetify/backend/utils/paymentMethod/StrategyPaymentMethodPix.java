package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;


import java.util.Date;
import java.util.Map;

class StrategyPaymentMethodPix implements StrategyPaymentMethod {
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
