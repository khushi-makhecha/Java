package com.khushi;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
            Exception.show();
        } catch (IOException e) {                                 //can also use Throwable instead of IOException
            System.out.println("Unexpected error");
        }
    }
}