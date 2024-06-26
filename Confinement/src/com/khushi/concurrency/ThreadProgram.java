package com.khushi.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadProgram {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++){
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalByte = tasks.stream()
                .map(t -> t.getStatus().getTotalByte())
                .reduce(0,(a,b) -> a + b);

        System.out.println(totalByte);
    }
}
