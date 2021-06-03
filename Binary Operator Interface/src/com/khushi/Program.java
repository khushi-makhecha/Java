package com.khushi;

import java.util.function.BinaryOperator;

public class Program {
    public static void show(){
        /* Binary Operation Example :
            var x = 1 + 2;
         */

        BinaryOperator<Integer> add1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        System.out.println(add1.apply(1,2));

        BinaryOperator<Integer> add2 = (a,b) -> a + b;                      // Method Reference can be applied as : BO<Integer> add2 = Integer::sum;
        var result = add2.apply(2,3);
        System.out.println(result);
    }
}
