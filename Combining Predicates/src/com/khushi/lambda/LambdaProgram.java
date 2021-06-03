package com.khushi.lambda;

import java.util.function.Predicate;

public class LambdaProgram {
    public static void show(){
        Predicate<String> hasLeftBracket = str -> str.startsWith("{");
        Predicate<String> hasRightBracket = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBrackets = hasLeftBracket.and(hasRightBracket);
        Predicate<String> hasLeftOrRightBrackets = hasLeftBracket.or(hasRightBracket);

        var result = hasLeftAndRightBrackets.test("{key=value}");
        System.out.println(result);
        result = hasLeftOrRightBrackets.test("key=value}");
        System.out.println(result);
        result = hasLeftAndRightBrackets.test("key={value}");
        System.out.println(result);
    }
}
