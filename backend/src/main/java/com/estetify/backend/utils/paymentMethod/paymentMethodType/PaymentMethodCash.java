package com.estetify.backend.utils.paymentMethod.paymentMethodType;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class PaymentMethodCash extends PaymentMethod {
    private String receivedBy;
    private String paymentLocation;
    private Double changeGiven;

    public PaymentMethodCash(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, String receivedBy, String paymentLocation, Double changeGiven) {
        super(id, TypePaymentMethod.CASH, amount, currency, transactionDate, status);
        this.receivedBy = receivedBy;
        this.paymentLocation = paymentLocation;
        this.changeGiven = changeGiven;
    }
}

