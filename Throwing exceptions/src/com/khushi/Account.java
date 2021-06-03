package com.khushi;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Account {

    public void deposit(float value) throws FileNotFoundException {
        if(value <= 0)
            throw new FileNotFoundException();
    }
}