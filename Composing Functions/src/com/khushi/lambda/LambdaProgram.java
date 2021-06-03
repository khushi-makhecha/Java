package com.khushi.lambda;

import java.util.function.Function;

public class LambdaProgram {
    public static void show(){
        /* Expected Output :

        Given : "key : value"
        First Output : "key = value"
        Second Output : "{key = value}"
         */

        Function<String,String> replaceColon = str -> str.replace(":","=");
        Function<String,String> addBrackets = str -> "{" + str + "}";

        var result1 = replaceColon.andThen(addBrackets).apply("key : value");
        System.out.println(result1);

        var result2 = addBrackets.compose(replaceColon).apply("key : value");
        System.out.println(result2);

        /* ALTERNATIVE WAY OF ABOVE METHOD IS AS FOLLOWS:

          var result = replaceColon.andThen(addBrackets).apply("key : value");

          result = addBrackets.compose(replaceColon).apply("key : value");

          This updates the initial value of 'result' to the new value eradicating the need of mentioning 'var' in the updating statement.
         */
    }
}
