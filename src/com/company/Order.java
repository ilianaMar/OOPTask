package com.company;

public class Order {
    int year, amount, maxNumOfPagest, numberOfPages, numberOFPagesLeft;
    boolean  isEOrder;
    String employSignature;

    public Order(int NewYear, int newAmount, int newMaxNumOfPagest, int newNumberOfPages, int newNumberOFPagesLeft,
                 boolean newIsOrder,String newEmploySignature ){
        year = NewYear;
        amount = newAmount;
        maxNumOfPagest = newMaxNumOfPagest;
        numberOfPages = newNumberOfPages;
        numberOFPagesLeft = newNumberOFPagesLeft;
        isEOrder = newIsOrder;
        employSignature = newEmploySignature;
    }

    public String changeEmploySignature(String newEmploySignature){
        return this.employSignature = newEmploySignature;
    }

    public double usedPages(int pages){
        float lastPages = 0;
        if  (numberOFPagesLeft >=  pages) {
            lastPages = (float) this.numberOFPagesLeft / pages;
        } else {
            System.out.println(numberOFPagesLeft);
            System.out.println(pages);
            String message = String.format("Number of pages %s is greater than input pages value %s", numberOFPagesLeft, pages);
            System.out.println(message);
        }
        return lastPages;
    }
}
