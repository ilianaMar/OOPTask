package com.company;

import java.util.Hashtable;

public class OrderCalculations implements InvoiceCalculations{
    double[] pricesList;
    int discountPercentage;

    public OrderCalculations(double[] newPricesList, int newDiscountPercentage){
        pricesList = newPricesList;
        discountPercentage = newDiscountPercentage;
    }

    public Boolean isValidDiscount(){
        if(this.discountPercentage <= 0 || this.discountPercentage  > 100){
            String message = String.format("Discount with value %s is not valid!", this.discountPercentage);
            System.out.println(message);
            return false;
        }
        return true;
    }

    public Hashtable<String, Double> calculatePrices() {
        double sumNet  = 0;
        double sumWithVAT;
        Hashtable<String, Double> sumHash = new Hashtable<>();

        try {
            if(this.pricesList.length == 0 ){
                throw new InvoiceException("Prices list is " + new Throwable().getCause());
            }else{
                for (double singlePrice : this.pricesList) {
                    sumNet += singlePrice;
                }
                sumWithVAT = 1.2 * sumNet;
                sumHash.put("SumNet", sumNet);
                sumHash.put("sumWithVAT", sumWithVAT);

            }

        }catch (Exception err) {
            System.out.println(err.getMessage());
            throw err;

        }
        return sumHash;
    }

    public double tradeInvoiceDiscount(double priceAmount) {
        if (this.isValidDiscount()){
            return priceAmount - (priceAmount * ((double) this.discountPercentage/100));
        }

        return 0;
    }
}
