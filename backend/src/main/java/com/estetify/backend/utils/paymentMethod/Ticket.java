package com.estetify.backend.utils.paymentMethod;

import com.estetify.backend.models.PaymentMethod;
import com.estetify.backend.utils.enums.PaymentStatus;
import com.estetify.backend.utils.enums.TypePaymentMethod;

import java.util.Date;

public class Ticket extends PaymentMethod{
    private String ticketNumber;
    private Date expirationDate;
    private String barcode;
    private String issuer;

    public Ticket(Integer id, TypePaymentMethod typePaymentMethod, double amount, String currency, Date transactionDate, PaymentStatus status, String ticketNumber, Date expirationDate, String barcode, String issuer) {
        super(id, typePaymentMethod, amount, currency, transactionDate, status);
        this.ticketNumber = ticketNumber;
        this.expirationDate = expirationDate;
        this.barcode = barcode;
        this.issuer = issuer;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
