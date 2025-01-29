package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;

import java.util.Date;

public class Cash extends PaymentMethod {
    private String receivedBy;
    private String paymentLocation;
    private String changeGiven;

    public Cash(Integer id, TypePaymentMethod typePaymentMethod, double amount, String currency, Date transactionDate, PaymentStatus status, String receivedBy, String paymentLocation, String changeGiven) {
        super(id, typePaymentMethod, amount, currency, transactionDate, status);
        this.receivedBy = receivedBy;
        this.paymentLocation = paymentLocation;
        this.changeGiven = changeGiven;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    public String getPaymentLocation() {
        return paymentLocation;
    }

    public void setPaymentLocation(String paymentLocation) {
        this.paymentLocation = paymentLocation;
    }

    public String getChangeGiven() {
        return changeGiven;
    }

    public void setChangeGiven(String changeGiven) {
        this.changeGiven = changeGiven;
    }
}
