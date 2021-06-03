package com.khushi;

public class TextBox extends UIControl{
    public String text="";

    public TextBox(){
        super(false);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}