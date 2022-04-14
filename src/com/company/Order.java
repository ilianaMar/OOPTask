package com.company;
import java.util.LinkedList;

abstract public class Order {
    int orderNumber;
    String clientDetails;
    LinkedList<String> articleLists = new LinkedList<>();
    float totalAmount;
    final static String orderName = "OrderName";

    public Order(){
    }

    public Order(int newOrderNumber){
        orderNumber = newOrderNumber;
    }

    public Order(int newOrderNumber, String newClientDetails, float newTotalAmount){
        orderNumber = newOrderNumber;
        clientDetails = newClientDetails;
        totalAmount = newTotalAmount;
    }

    public Order(int newOrderNumber, String newClientDetails,
                 LinkedList<String> newArticleLists, float newTotalAmount){
        orderNumber = newOrderNumber;
        clientDetails = newClientDetails;
        articleLists = newArticleLists;
        totalAmount = newTotalAmount;
    }

    public int hashCode(){
        int code = orderNumber * orderName.hashCode();
        if(clientDetails != null){
            code *=  clientDetails.hashCode();
        }
        return code;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else {
            return false ;
        }
    }
}

