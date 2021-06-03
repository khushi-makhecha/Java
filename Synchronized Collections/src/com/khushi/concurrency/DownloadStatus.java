package com.khushi.concurrency;

public class DownloadStatus {
    private int totalByte;

    public void incrementTotalByte(){
        totalByte++;
    }

    public int getTotalByte() {
        return totalByte;
    }
}
