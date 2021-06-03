package com.khushi.concurrency;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());

        for (var i = 0; i < 100_000; i++){
            if (Thread.currentThread().isInterrupted())
                break;
            status.incrementTotalByte();
        }
        status.Done();
        synchronized (status){
            status.notifyAll();
        }
        System.out.println("Download completed " + Thread.currentThread().getName());
    }
}
