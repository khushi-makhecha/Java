package com.khushi.lambda;

import java.util.List;
import java.util.function.Consumer;

public class LambdaProgram {
    public static void show(){
        List<String> list = List.of("a","b","c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        var gld = new GLD<Integer>();
        System.out.println(gld);
        System.out.println(print);
        System.out.println(printUpperCase);
        list.forEach(item -> System.out.println(item));

        list.forEach(print.andThen(printUpperCase));
        list.forEach(print.andThen(printUpperCase).andThen(print));
    }
}