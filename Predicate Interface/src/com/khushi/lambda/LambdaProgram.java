package com.khushi.lambda;

import java.util.function.Predicate;

public class LambdaProgram {
    public static void show(){
        Predicate<String> isLongerThan = str -> str.length() > 5;

        var test1 = isLongerThan.test("Khushi");
        System.out.println(test1);

        test1 = isLongerThan.test("Trial");                        //Another example of updating a variable (usage of same variable without using 'var')
        System.out.println(test1);
    }
}