package com.khushi.concurrency;

public class DownloadStatus {
    private int totalByte;
    private volatile boolean isDone;

    public synchronized void incrementTotalByte(){
        totalByte++;
    }

    public int getTotalByte(){
        return totalByte;
    }

    public boolean isDone(){
        return isDone;
    }

    public void Done(){
        isDone = true;
    }
}
