package com.khushi.lambda;

public class ClassLambda {

    public static void show(){
        /* Method Referencing Syntax :
            Class/obj :: method;
        */

        greet(message -> System.out.println(message));     // undergoing 'more actions' gives the below statement
        greet(System.out::println);                       // => Method reference of above statement

        greet(message -> new ClassLambda());

        /* THE BELOW GIVEN STATEMENTS OF PRINT ARE GIVEN ONLY IN ORDER TO PROVIDE ANOTHER EXAMPLE :

        greet(new Printer() {                                             - - - - - (1)
            @Override
            public void print(String message) {
                print(message);
            }
        });

         greet(message -> print(message));                                 - - - - - (2)
         greet(ClassLambda :: print);
         */


        /* ANOTHER EXAMPLE NOT TO BE IMPLEMENTED :

        var demo = new ClassLambda();
        demo.show();  [or]  show();
        greet(demo :: print);
        greet(message -> demo.print("a"));

         */

        /* IN CASE OF THIS CLASS WITH ONE CONSTRUCTOR :

            public ClassLambda(String msg) {
    }

        var demo = new ClassLambda("a");
        greet(demo::print);

        greet(message -> new ClassLambda(message));
        greet(ClassLambda::new);

         */
    }

    public void print(String message){}

    public static void greet(Printer printer){
        printer.print("Hello");
    }
}