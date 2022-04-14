package com.company;
import java.util.LinkedList;

public class TradeOrder extends AbstractOrder {
    public TradeOrder(int newOrderNumber, String newClientDetails, float newTotalAmount){
        super(newOrderNumber, newClientDetails, newTotalAmount);
    }

    public TradeOrder(int newOrderNumber){
        super(newOrderNumber);
    }

    public TradeOrder(int newOrderNumber, String newClientDetails,
                      LinkedList<String> newArticleLists, float newTotalAmount){
        super(newOrderNumber, newClientDetails, newArticleLists, newTotalAmount);
    }

    public static String assertEqualHashCode(TradeOrder firstObj, TradeOrder secondObj)
    {
        String message;
        if(firstObj.equals(secondObj))
        {
            message = String.format("The variables are equal: \n  %s =  %s", firstObj.hashCode(), secondObj.hashCode());
        }else {
            message = String.format("First object %s is not equal to second objects %s",
                    firstObj.hashCode(), secondObj.hashCode());

        }

        return message;
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


        System.out.println(firstObject.orderNumber);
        System.out.println(firstObject.clientDetails);
        System.out.println(firstObject.totalAmount);

        System.out.println(assertEqualHashCode(firstObject, secondObject));
        System.out.println(assertEqualHashCode(firstObject, firstObject));
        System.out.println(assertEqualHashCode(thirdObject, secondObject));
    }

}
