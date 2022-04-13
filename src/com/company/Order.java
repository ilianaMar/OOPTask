package com.company;

public class Order {
    private int year, amount, maxNumOfPagest, numberOfPages, numberOFPagesLeft;
    private boolean isE;
    private String employSignature;
    //add geter and setter for the other

    public String changeEmploySignature(String newEmploySignature){
        return this.employSignature = newEmploySignature;
    }

    public double usedPages(double pages){
        double lastPages = 0;
        if  (numberOFPagesLeft <= pages) {
            lastPages = this.numberOFPagesLeft / pages;
        } else {
            String message = String.format("Number of pages %d is greater than input pages value %d", numberOFPagesLeft, pages);
            System.out.println(message);
        }
        return lastPages;
    }
}
