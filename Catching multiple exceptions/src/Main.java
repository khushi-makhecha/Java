import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            System.out.println("File opened");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
             e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("File not read");
        }
    }
}