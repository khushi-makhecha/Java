package com.khushi.lambdas;

public abstract class ClassLambda {
    public static void show() {

        greet(new ConsolePrinter());                                            // Oldest way

        greet(new Printer(){                                                    // Older way
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        /* New ways */

        greet((String message) -> {                                               //STEP-1
            System.out.println(message);
            // message.     use this syntax to verify the class of 'message'
        });

        greet((message) -> System.out.println(message));                           //STEP-2
        /* In case if Printer had print(String msg, something something),
        the above statement would show error expecting 2 arguments */

        /* The mentioned problem can be solved by writing:
            greet((message, arg_something)) -> sout(message);
         */


    }
    public static void greet(Printer printer){
        printer.print("Hello");
    }
}