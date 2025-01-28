package com.estetify.backend.models;

import com.estetify.backend.utils.PaymentStatus;
import com.estetify.backend.utils.TypePaymentMethod;

import java.util.Date;

public abstract class PaymentMethod {
    private Integer id;
    private TypePaymentMethod typePaymentMethod;
    private double amount;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypePaymentMethod getTypePaymentMethod() {
        return typePaymentMethod;
    }

    public void setTypePaymentMethod(TypePaymentMethod typePaymentMethod) {
        this.typePaymentMethod = typePaymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
