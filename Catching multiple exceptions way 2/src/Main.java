import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try{
            var reader = new FileReader("file.txt");
            var value = reader.read();
            System.out.println("File opened");
        }
        catch (FileNotFoundException | ParseException e){
            System.out.println("File not found");
        }
    }
}
