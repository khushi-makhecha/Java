package com.khushi;
import java.text.NumberFormat;

public class Visuals {

    public void forMortgage(double value){
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(value);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("----------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void forBalance(){
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("-----------");
    }
}