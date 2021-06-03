public class Exception {

    public static void show(){
        sayHello("Hello Khushi");
        sayHello("");
        sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
