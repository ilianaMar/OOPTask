package com.company;

public class InvoiceException extends RuntimeException{
    public InvoiceException (String errorMessage){
        super(errorMessage);
    }
}
