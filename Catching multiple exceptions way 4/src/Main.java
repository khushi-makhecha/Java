import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {                    //writing IOException
        var reader = new FileReader("file.txt");                                     //in place of FNFE
        var value = reader.read();                                                           //will give the corr-
        System.out.println("File opened");                                                   //ect stack trace.
    }
}