package com.khushi;

import java.text.NumberFormat;

public class PrintValues {
    void printMortgage(int principal, float annualInterest, byte years) {
        var calculate1 = new Calculations(principal, annualInterest, years);
        double mortgage = calculate1.calculateMortgage();
        var visuals1 = new Visuals();
        visuals1.forMortgage(mortgage);
    }

    void printPaymentSchedule(int principal, float annualInterest, byte years) {
        var calculate2 = new Calculations(principal, annualInterest, years);
        var visuals2 = new Visuals();
        visuals2.forBalance();
        for (short month = 1; month <= years * calculate2.getMONTHS_IN_YEAR(); month++) {
            double balance = calculate2.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}