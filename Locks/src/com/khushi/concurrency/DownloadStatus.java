package com.khushi.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalByte;
    private Lock lock = new ReentrantLock();

    public void incrementTotalByte(){
        lock.lock();
        try {
            totalByte++;
        }
        finally {
            lock.unlock();
        }
    }

    public int getTotalByte(){
        return totalByte;
    }
}
