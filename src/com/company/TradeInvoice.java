package com.company;

public class TradeInvoice extends Invoice{

    public TradeInvoice(int newInvoiceNumber, String newClientDetails){
        super(newInvoiceNumber, newClientDetails);
    }

    public TradeInvoice(int newInvoiceNumber, String newClientDetails, float newTotalAmount){
        super(newInvoiceNumber, newClientDetails, newTotalAmount);
    }

    private static String assertEqualHashCode(TradeInvoice firstObj, TradeInvoice secondObj)
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
        TradeInvoice firstObject = new TradeInvoice(10001, "User Firstname");
        TradeInvoice secondObject = new TradeInvoice(200002, "User SecondName",
                13.999999f);
        System.out.println(firstObject.invoiceNumber);
        System.out.println(firstObject.clientDetails);
        System.out.println(firstObject.getOrderDate());

        System.out.println(secondObject.invoiceNumber);
        System.out.println(secondObject.clientDetails);
        System.out.println(secondObject.totalAmount);
        System.out.println(secondObject.getOrderDate());

        System.out.println(assertEqualHashCode(firstObject, secondObject));
        System.out.println(assertEqualHashCode(firstObject, firstObject));
        System.out.println(assertEqualHashCode(secondObject, secondObject));
    }

}
