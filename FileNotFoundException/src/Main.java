import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException e){
            System.out.println("File doesn't exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("File opened");
    }
}
