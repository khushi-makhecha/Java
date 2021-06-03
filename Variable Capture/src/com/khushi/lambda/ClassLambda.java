package com.khushi.lambda;

public class ClassLambda {
    public static String hyphen = "-";

    public void show(){
//        String hyphen = "-";                                     This can work here as well
        greet(message -> System.out.println(hyphen + message));
        greet(message -> System.out.println(this + message));
        greet(message -> System.out.println(this.hyphen + message));
    }

    public void greet(Printer printer){
        printer.print("Hello");
    }
}
