package com.khushi;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ");
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ");
        byte years = (byte) Console.readNumber("Period (Years): ");

        var print = new PrintValues();
        print.printMortgage(principal, annualInterest, years);
        print.printPaymentSchedule(principal, annualInterest, years);
    }
}