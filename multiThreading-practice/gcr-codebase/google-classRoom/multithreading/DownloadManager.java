package com.bridgelabz.multithreading;

class FileDownloader extends Thread {

    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try {
            for (int i = 0; i <= 100; i += 25) {
                System.out.println("[" + getName() + "] Downloading "
                        + fileName + ": " + i + "%");
                Thread.sleep((int) (Math.random() * 500));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DownloadManager {
    public static void main(String[] args) throws Exception {

        FileDownloader t1 = new FileDownloader("Document.pdf");
        FileDownloader t2 = new FileDownloader("Image.jpg");
        FileDownloader t3 = new FileDownloader("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}

