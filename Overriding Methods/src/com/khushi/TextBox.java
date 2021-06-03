package com.khushi;

public class TextBox{
    public String text="";

    public TextBox(){
        System.out.println("TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
