package com.khushi.lambdas;

public class ClassLambda {
    public static void show(){
        greet(new Printer() {                             // => Anonymous Class (eliminates the need of declaring new classes every time)
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
//        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer){
        printer.print("Hello");
    }
}