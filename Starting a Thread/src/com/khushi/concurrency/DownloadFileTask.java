package com.khushi.concurrency;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a File " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download completed");
    }
}
