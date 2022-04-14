package com.company;

import java.sql.Timestamp;

abstract public class Invoice {
    int invoiceNumber;
    String clientDetails;
    float totalAmount;
    final static Timestamp orderDate = new Timestamp(new java.util.Date().getTime());

    public Invoice(){}

    public Invoice(int newInvoiceNumber, String newClientDetails){
        invoiceNumber = newInvoiceNumber;
        clientDetails = newClientDetails;
    }

    public Invoice(int newInvoiceNumber, String newClientDetails, float newTotalAmount){
        invoiceNumber = newInvoiceNumber;
        clientDetails = newClientDetails;
        totalAmount = newTotalAmount;
    }

    public Timestamp getOrderDate(){
        return this.orderDate;
    }
}
