package com.company;
import java.util.LinkedList;

public class TradeOrder extends Order {
    public TradeOrder(int newOrderNumber, String newClientDetails, float newTotalAmount){
        super(newOrderNumber, newClientDetails, newTotalAmount);
    }

    public TradeOrder(){
        super();
    }

    public TradeOrder(int newOrderNumber){
        super(newOrderNumber);
    }

    public TradeOrder(int newOrderNumber, String newClientDetails,
                      LinkedList<String> newArticleLists, float newTotalAmount){
        super(newOrderNumber, newClientDetails, newArticleLists, newTotalAmount);
    }

    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<>();
        myList.add("test1");
        myList.add("test2");
        TradeOrder firstObject = new TradeOrder(23333, "test iliana",
                10.10f);
        TradeOrder secondObject = new TradeOrder(999999);


        TradeOrder thirdObject = new TradeOrder(888888, "Third Object",
                myList,  111 );
        TradeOrder fourthObject = new TradeOrder();

        System.out.println(firstObject.orderNumber);
        System.out.println(firstObject.clientDetails);
        System.out.println(firstObject.totalAmount);

        System.out.println(firstObject.hashCode());
        System.out.println(secondObject.hashCode());
        System.out.println(thirdObject.hashCode());

        System.out.println(firstObject.equals(firstObject));
        System.out.println(secondObject.equals(firstObject));
        System.out.println(thirdObject.equals(firstObject));
        System.out.println(thirdObject.equals(thirdObject));
    }

}
