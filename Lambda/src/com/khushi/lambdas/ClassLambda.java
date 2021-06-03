package com.khushi.lambdas;

public class ClassLambda {
    public static void show(){
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer){
        printer.print("Hello");
    }
}