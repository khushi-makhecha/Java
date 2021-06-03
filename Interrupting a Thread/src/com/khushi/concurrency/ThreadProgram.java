package com.khushi.concurrency;

public class ThreadProgram {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Thread.interrupted();                              Usage Purpose = ?

        thread.interrupt();
    }
}