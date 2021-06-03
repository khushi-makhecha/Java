package com.khushi.concurrency;

public class ThreadProgram {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File is ready for scan");
    }
}
