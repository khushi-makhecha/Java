package com.khushi;

import java.util.function.UnaryOperator;

public class Program {
    public static void show(){
        UnaryOperator<Integer> sqrt1 = a -> a * a;
        UnaryOperator<Integer> inc1 = a -> a + 1;

        var result = inc1.compose(sqrt1).apply(1);
        System.out.println(result);

        result = inc1.andThen(sqrt1).apply(1);
        System.out.println(result);
    }
}
