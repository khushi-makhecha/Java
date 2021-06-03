package com.khushi.lambda;

import java.util.function.Function;

public class LambdaProgram {
    public static void show(){
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("A");
        System.out.println(length);

        Function<String, Integer> alternateToAbove = String::length;
        System.out.println(alternateToAbove.apply("BCD"));

        Function<String, String> map2 = str -> str.toUpperCase();
        System.out.println(map2.apply("String - String"));

        Function<String, Integer> map3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {                         // returns integers like 0,1,etc; Hence, return type is mentioned as Integer.
                return null;
            }
        };
        System.out.println(map3.apply("4"));

        Function<String, String> map4 = new Function<String, String>() {
            @Override
            public String apply(String s) {                         // returns integers like 0,1,etc; Hence, return type is mentioned as Integer.
                return null;
            }
        };
        System.out.println(map3.apply("Khushi"));
    }
}