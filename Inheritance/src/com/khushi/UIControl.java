package com.khushi;

public class UIControl{
    private boolean isEnabled;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}