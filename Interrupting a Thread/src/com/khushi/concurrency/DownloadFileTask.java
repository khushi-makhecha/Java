package com.khushi.concurrency;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading a File " + Thread.currentThread().getName());
        for(var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted())
                break;       // or return ?
            System.out.println("Downloading byte " + i);
        }
    }
}
