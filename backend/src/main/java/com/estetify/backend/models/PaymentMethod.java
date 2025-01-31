package com.estetify.backend.models;

import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public abstract class PaymentMethod {
    private Integer id;
    private TypePaymentMethod typePaymentMethod;
    private Double amount;
    private String currency;
    private Date transactionDate;
    private PaymentStatus status;

    public PaymentMethod(Integer id, TypePaymentMethod typePaymentMethod, double amount, String currency, Date transactionDate, PaymentStatus status) {
        this.id = id;
        this.typePaymentMethod = typePaymentMethod;
        this.amount = amount;
        this.currency = currency;
        this.transactionDate = transactionDate;
        this.status = status;
    }
}
