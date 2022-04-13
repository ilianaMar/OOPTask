package com.company;

public class OrderSession {
    public static String orderPrint(Order object){
        String message = String.format("year %s, amount %s, maxNumOfPagest %s, numberOfPages %s, " +
                            "numberOFPagesLeft %s, isE %s, employSignature %s", object.getClass(), object.year,
                object.maxNumOfPagest, object.numberOfPages, object.numberOFPagesLeft,
                object.isE, object.employSignature);
        return message;
    }

    public static void main(String[] args) {
        Order firstObj = new Order(2020, 100, 20,
                10 , 9, true, "first user signature");

        Order secondObj = new Order(2021, 90, 30,
                20 , 18, false, "second user signature");
        secondObj.changeEmploySignature("Updated second signature");
        float decreasedPages = (float) firstObj.usedPages(2);

        System.out.println("First order decreased pages " + decreasedPages);
        System.out.println("First order" + orderPrint(firstObj));
        System.out.println("Second order" + orderPrint(secondObj));
    }
}
