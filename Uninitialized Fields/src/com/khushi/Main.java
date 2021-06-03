package com.khushi;

public class Main {
    private static boolean y;                    // Always initialized as False by default.
    private static int x;                        // Always initialized as 0 by default.

    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(x);

//        while (!y) {                                       // => Infinite Loop
//            System.out.println("Hi");
//        }
    }
}