package com.khushi;
import java.util.Scanner;

public class Console {

    static double readNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double value;
        String strName = "Principal:";

        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            double min = prompt.equals(strName.trim()) ? 1_000 : 1;
            double max = prompt.equals(strName.trim()) ? 1_000_000 : 30;
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "and" + max);
        }
        return value;
    }
}