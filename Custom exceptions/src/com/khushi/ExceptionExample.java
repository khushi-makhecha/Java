package com.khushi;

import java.io.IOException;

public class ExceptionExample {

    public static void show(){
        var account = new Account();
        try {
            account.withdraw(100);
        } catch (InsufficientFundsException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}