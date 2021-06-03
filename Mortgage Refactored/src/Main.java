package com.khushi;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal ($1K-$1M): ", 1000, 1000000);
        float annualRate = (float) readNumber("Annual Interest: ", 1, 30);
        byte period = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualRate, period);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public  static double readNumber(String input, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(input);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between "+ min+ "and" +max );
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualRate, byte period) {
        float monthlyRate = annualRate/PERCENT/MONTHS_IN_YEAR;
        float numOfPayments = period * MONTHS_IN_YEAR;
        float intermValue = (float) Math.pow(monthlyRate+1, numOfPayments);

        double mortgage = principal * monthlyRate * (intermValue/--intermValue);
        return mortgage;
    }
}