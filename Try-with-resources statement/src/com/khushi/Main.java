package com.khushi;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            try(var reader = new FileReader("file.txt")){
                var value = reader.read();
            } catch (IOException e){
                e.printStackTrace();
            }
    }
}
