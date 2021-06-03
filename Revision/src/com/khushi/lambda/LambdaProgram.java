package com.khushi.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaProgram {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        Supplier<Double> getRandom = () -> {return Math.random();};
        System.out.println(getRandom.get());
//        var random = getRandom.get();                                            Alternate to above statement.
//        System.out.println(random);
        Supplier<Double> getRandom2 = Math :: random;
        System.out.println(getRandom2.get());
    }
}
