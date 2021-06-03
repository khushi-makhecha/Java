package com.khushi;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(){
        System.out.println("Insufficient Balance");              //can also use sout instead of super, here
    }

    public InsufficientFundsException(String message){
        super(message);
    }
}