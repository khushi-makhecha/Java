package com.khushi.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalByte = new AtomicInteger();

    public void incrementTotalByte(){
        totalByte.incrementAndGet();                                // incrementAndGet => ++A
    }                                                               // getAndIncrement => A++

    public int getTotalByte() {
        return totalByte.get();    // Sum
    }
}