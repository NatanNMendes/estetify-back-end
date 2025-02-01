package com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.strategies;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.paymentMethod.paymentMethodStrategy.PaymentMethodStrategy;
import com.estetify.backend.utils.paymentMethod.paymentMethodType.PaymentMethodCash;
import java.util.Date;
import java.util.Map;


public class CashPaymentStrategy implements PaymentMethodStrategy {
    @Override
    public PaymentMethod createPayment(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, Map<String, Object> additionalAttributes) {

        // Verifica e converte valores do mapa para os tipos corretos
        String receivedBy = additionalAttributes.getOrDefault("receivedBy", "Unknown").toString();
        String paymentLocation = additionalAttributes.getOrDefault("paymentLocation", "Unknown").toString();

        // Converte changeGiven para Double de forma segura
        Double changeGiven = 0.0;
        if (additionalAttributes.containsKey("changeGiven")) {
            Object changeValue = additionalAttributes.get("changeGiven");
            if (changeValue instanceof Number) {
                changeGiven = ((Number) changeValue).doubleValue();
            } else {
                try {
                    changeGiven = Double.parseDouble(changeValue.toString());
                } catch (NumberFormatException e) {
                    changeGiven = 0.0; // Valor padrão se a conversão falhar
                }
            }
        }

        // Retorna um novo objeto PaymentMethodCash com os tipos corretos
        return new PaymentMethodCash(id, amount, currency, transactionDate, status, receivedBy, paymentLocation, changeGiven);
    }
}



