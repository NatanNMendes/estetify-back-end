package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class PaymentMethodCreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardholderName;
    private Date expirationDate;
    private String cvv;
    private Integer installments;
    private String cardBrand;

    PaymentMethodCreditCard(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, String cardNumber, String cardholderName, Date expirationDate, String cvv, Integer installments, String cardBrand) {
        super(id, TypePaymentMethod.CREDIT_CARD, amount, currency, transactionDate, status);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.installments = installments;
        this.cardBrand = cardBrand;
    }
}
