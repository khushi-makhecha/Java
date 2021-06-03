package com.khushi.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalByte;
    private int totalFile;
    private Object totalByteLock = new Object();
    private Object totalFileLock = new Object();

    public void incrementTotalByte(){
        synchronized (totalByteLock) {                                    // One can use synchronized(this) in case of only one field. But here, as the other field exists, namely totalFileLock, using 'this' will give error.
            totalByte++;
        }
    }

    public void incrementTotalFile(){
        synchronized (totalFileLock) {
            totalFile++;
        }
    }

    public int getTotalByte(){
        return totalByte;
    }

    public int getTotalFile(){
        return totalFile;
    }
}

/*
                   ALTERNATE CODE WITH SYNCHRONIZED METHOD INSTEAD OF SYNCHRONIZED FIELD CONDITIONS :


public class DownloadStatus {
    private int totalByte;

    public synchronized void incrementTotalByte(){
            totalByte++;
    }

    public int getTotalByte(){
        return totalByte;
    }
}
  */