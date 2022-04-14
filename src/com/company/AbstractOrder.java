package com.company;
import java.util.LinkedList;

abstract public class AbstractOrder {
    int orderNumber;
    String clientDetails;
    LinkedList<String> articleLists = new LinkedList<>();
    float totalAmount;
    final static String orderName = "OrderName";

    public AbstractOrder(){
    }

    public AbstractOrder(int newOrderNumber){
        orderNumber = newOrderNumber;
    }

    public AbstractOrder(int newOrderNumber, String newClientDetails, float newTotalAmount){
        orderNumber = newOrderNumber;
        clientDetails = newClientDetails;
        totalAmount = newTotalAmount;
    }

    public AbstractOrder(int newOrderNumber, String newClientDetails,
                        LinkedList<String> newArticleLists, float newTotalAmount){
        orderNumber = newOrderNumber;
        clientDetails = newClientDetails;
        articleLists = newArticleLists;
        totalAmount = newTotalAmount;
    }
}

