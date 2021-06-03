package com.khushi.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadProgram {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 10; i++){
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalByte());

        /*
            REQUIRED OUTPUT :
                10 * 10_000 = 100_000
            OBTAINED OUTPUT :
                < 100_000

            This => Race Condition in incrementing totalByte!
         */
    }
}