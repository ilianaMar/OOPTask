package com.company;

public class TradeInvoice extends Invoice{

    public TradeInvoice(int newInvoiceNumber, String newClientDetails){
        super(newInvoiceNumber, newClientDetails);
    }

    public TradeInvoice(int newInvoiceNumber, String newClientDetails, float newTotalAmount){
        super(newInvoiceNumber, newClientDetails, newTotalAmount);
    }

    public static void main(String[] args){
        TradeInvoice firstObject = new TradeInvoice(10001, "User Firstname");
        TradeInvoice secondObject = new TradeInvoice(200002, "User SecondName",
                13.999999f);
        System.out.println(firstObject.invoiceNumber);
        System.out.println(firstObject.clientDetails);
        System.out.println(firstObject.getOrderDate());

        System.out.println(secondObject.invoiceNumber);
        System.out.println(secondObject.clientDetails);
        System.out.println(secondObject.totalAmount);
        System.out.println(secondObject.getOrderDate());

        System.out.println(firstObject.hashCode());
        System.out.println(secondObject.hashCode());

    }

}
