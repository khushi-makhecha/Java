package com.khushi.lambda;

import java.util.function.Supplier;

public class LambdaProgram {
    public static void show(){
        Supplier<Double> getRandom = Math :: random;
        Supplier<Double> getRandom2 = () -> Math.random();
        System.out.println(getRandom2.get());
//        var random = getRandom2.get();                                       Alternate to above statement.
//        System.out.println(random);
        System.out.println(getRandom.get());
    }
}
