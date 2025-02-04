package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class PaymentMethodPix extends PaymentMethod {
    private String pixKey;
    private String bankName;
    private String transactionID;

    PaymentMethodPix(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, String pixKey, String bankName, String transactionID) {
        super(id, TypePaymentMethod.PIX, amount, currency, transactionDate, status);
        this.pixKey = pixKey;
        this.bankName = bankName;
        this.transactionID = transactionID;
    }
}
