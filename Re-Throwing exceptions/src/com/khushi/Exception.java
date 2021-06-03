package com.khushi;

import java.io.IOException;

public class Exception {

    public static void show() throws IOException {
        var account = new Account();
        try{
            account.deposit(-1);
        } catch (IOException e){
            System.out.println("Error");
            throw e;
        }
    }
}