package com.khushi;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualRate = 0;
        byte period = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K-$1M) : ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
        System.out.print("Annual Interest Rate: ");
        annualRate = scanner.nextFloat();
            if (annualRate > 0 && annualRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        float monthlyRate = annualRate/PERCENT/MONTHS_IN_YEAR;

        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }

        int numOfPayments = period * MONTHS_IN_YEAR;

        float intermValue = (float) Math.pow(monthlyRate+1, numOfPayments);

        double mortgage = principal * monthlyRate * (intermValue/--intermValue);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}