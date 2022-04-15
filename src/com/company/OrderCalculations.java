package com.company;

import java.util.Hashtable;

public class OrderCalculations implements InvoiceCalculations, TradeInvoiceCalculation{
    double[] pricesList ;
    int discountPercentage;

    public OrderCalculations(double[] newPricesList, int newDiscountPercentage){
        pricesList = newPricesList;
        discountPercentage = newDiscountPercentage;
    }

    public Boolean Validate(){
        if(this.discountPercentage <= 0 || this.discountPercentage  > 100){
            String message = String.format("Discount with value %s is not valid!", this.discountPercentage);
            System.out.println(message);
            return false;
        }
        return true;
    }

    @Override
    public Hashtable<String, Double> calculatePrices() {
        double sumNet  = 0;
        double sumWithVAT;
        Hashtable<String, Double> sumHash = new Hashtable<>();

        for (double singlePrice : this.pricesList) {
            System.out.println(singlePrice);
            sumNet += singlePrice;
        }
        sumWithVAT = 1.2 * sumNet;
        sumHash.put("SumNet", sumNet);
        sumHash.put("sumWithVAT", sumWithVAT);

        return sumHash;
    }

    @Override
    public double tradeInvoiceDiscount(double priceAmount) {
        if (this.Validate()){
            return priceAmount - (priceAmount * ((double) this.discountPercentage/100));
        }

        return 0;
    }
}
