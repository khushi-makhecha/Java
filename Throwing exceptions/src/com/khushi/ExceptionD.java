package com.khushi;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionD {

    public static void show() {
        var account = new Account();
        account.deposit(-1);
    }
}