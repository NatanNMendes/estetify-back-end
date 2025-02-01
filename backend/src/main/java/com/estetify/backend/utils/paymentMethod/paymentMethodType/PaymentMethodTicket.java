package com.estetify.backend.utils.paymentMethod.paymentMethodType;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PaymentMethodTicket extends PaymentMethod {
    private String ticketNumber;
    private Date expirationDate;
    private String barcode;
    private String issuer;

    public PaymentMethodTicket(Integer id, Double amount, String currency, Date transactionDate, PaymentStatus status, String ticketNumber, Date expirationDate, String barcode, String issuer) {
        super(id, TypePaymentMethod.TICKET, amount, currency, transactionDate, status);
        this.ticketNumber = ticketNumber;
        this.expirationDate = expirationDate;
        this.barcode = barcode;
        this.issuer = issuer;
    }
}
