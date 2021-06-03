package com.khushi;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        show(control);
    }

    public static void show(UIControl control){
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("HIII");
        }
        System.out.println(control.toString());
    }
}