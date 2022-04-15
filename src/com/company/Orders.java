package com.company;

public class Orders {
    int year, amount, maxNumOfPagest, numberOfPages, numberOFPagesLeft;
    boolean  isEOrder;
    String employSignature;

    public Orders(int NewYear, int newAmount, int newMaxNumOfPagest, int newNumberOfPages, int newNumberOFPagesLeft,
                  boolean newIsOrder, String newEmploySignature ){
        year = NewYear;
        amount = newAmount;
        maxNumOfPagest = newMaxNumOfPagest;
        numberOfPages = newNumberOfPages;
        numberOFPagesLeft = newNumberOFPagesLeft;
        isEOrder = newIsOrder;
        employSignature = newEmploySignature;
    }

    public String changeEmploySignature(String newEmploySignature) throws OrderException, InvoiceException {

        if(newEmploySignature.isEmpty()){
            throw new OrderException("Employee Signature cannot be empty");
        }else if(newEmploySignature.isBlank()){
            throw new InvoiceException("String is " + new Throwable().getCause());
        } else {
            return  this.employSignature = newEmploySignature;
        }
    }

    public double usedPages(int pages){
        float lastPages = 0;
        if  (numberOFPagesLeft >=  pages) {
            lastPages = (float) this.numberOFPagesLeft / pages;
        } else {
            String message = String.format("Number of pages %s is greater than input pages value %s", numberOFPagesLeft, pages);
            System.out.println(message);
        }
        return lastPages;
    }
}
