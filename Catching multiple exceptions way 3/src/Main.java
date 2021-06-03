import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            var value = reader.read();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("File opened");
    }
}