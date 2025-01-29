package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;

import java.util.Date;

public class Pix extends PaymentMethod {
    private String pixKey;
    private String bankName;
    private String transactionID;

    public Pix(Integer id, TypePaymentMethod typePaymentMethod, double amount, String currency, Date transactionDate, PaymentStatus status, String pixKey, String bankName, String transactionID) {
        super(id, typePaymentMethod, amount, currency, transactionDate, status);
        this.pixKey = pixKey;
        this.bankName = bankName;
        this.transactionID = transactionID;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
}
