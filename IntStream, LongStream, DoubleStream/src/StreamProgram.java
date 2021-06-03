import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamProgram {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        IntStream.of(1,2,3)
                .forEach(System.out::println);

        System.out.println("---------------------------------");

        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);

        System.out.println("---------------------------------");

        IntStream.range(1,5)
                .forEach(System.out::println);
    }
}
