package com.khushi.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalByte = new LongAdder();

    public void incrementTotalByte(){
        totalByte.increment();
    }

    public int getTotalByte() {
        return totalByte.intValue();        // sum()
    }
}