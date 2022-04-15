package com.company;

import java.util.Hashtable;

public class TradeInvoice extends Invoice{

    public TradeInvoice(int newInvoiceNumber, String newClientDetails){
        super(newInvoiceNumber, newClientDetails);
    }

    public TradeInvoice(int newInvoiceNumber, String newClientDetails, float newTotalAmount){
        super(newInvoiceNumber, newClientDetails, newTotalAmount);
    }

    public static void main(String[] args){
        //Sample with abstract method, inheritance and etc
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


//      sample with valid discount
        double[] newPrices = {10.90, 0, 23.90, 40.34};
        OrderCalculations firstOrderCalculations = new OrderCalculations(newPrices, 20);
        Hashtable priceCalculations = firstOrderCalculations.calculatePrices();
        Object newPricesNet = priceCalculations.get("SumNet");
        Object newPriceWithVAT = priceCalculations.get("sumWithVAT");
        double priceWithDiscount = firstOrderCalculations.tradeInvoiceDiscount((double) newPriceWithVAT);

        System.out.println("Sum without VAT: \n" + newPricesNet);
        System.out.println("Sum with VAT: \n" + newPriceWithVAT);
        System.out.println("Sum with VAT which is discounted: \n" + priceWithDiscount);


        //sample with validation method for discount
        double[] secondPricesArr = {10.90, 0, 23.90, 40.34, 90.40};
        OrderCalculations secondOrderCalculations = new OrderCalculations(secondPricesArr, 200);
        Hashtable secondPriceCalculations = secondOrderCalculations.calculatePrices();
        Object secondPricesNet = secondPriceCalculations.get("SumNet");
        Object secondPriceWithVAT = secondPriceCalculations.get("sumWithVAT");
        double secondPriceWithDiscount = secondOrderCalculations.tradeInvoiceDiscount((double) secondPricesNet);

        System.out.println("Second Sum without VAT: \n" + secondPricesNet);
        System.out.println("Second Sum with VAT: \n" + secondPriceWithVAT);
        System.out.println("Second Sum with VAT which is discounted: \n" + secondPriceWithDiscount);


        double[] thirdPricesArr = {};
        OrderCalculations thirdOrderCalculations = new OrderCalculations(thirdPricesArr, 200);
        Hashtable thirdPriceCalculations = thirdOrderCalculations.calculatePrices();

    }

}
