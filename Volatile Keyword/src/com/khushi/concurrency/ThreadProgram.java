package com.khushi.concurrency;

public class ThreadProgram {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFIleTask(status));
        var thread2 = new Thread(() -> {
            while (!(status.isDone())) {}
            System.out.println(status.getTotalByte());
        });

        thread1.start();
        thread2.start();
    }
}
