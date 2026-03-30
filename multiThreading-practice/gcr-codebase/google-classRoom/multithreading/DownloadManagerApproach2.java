package com.bridgelabz.multithreading;

class FileDownloader2 implements Runnable {

    private String fileName;

    public FileDownloader2(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try {
            for (int i = 0; i <= 100; i += 25) {
                System.out.println("[" + Thread.currentThread().getName()
                        + "] Downloading " + fileName + ": " + i + "%");
                Thread.sleep((int) (Math.random() * 500));
            }
        } catch (Exception e) {}
    }
}

public class DownloadManagerApproach2 {

	
	 public static void main(String[] args) throws Exception {

	        FileDownloader2 t1 = new FileDownloader2("Document.pdf");
	        FileDownloader2 t2 = new FileDownloader2("Image.jpg");
	        FileDownloader2 t3 = new FileDownloader2("Video.mp4");
	        
	        
	         Thread t11 = new Thread(t1);
	         
	         Thread t12 = new Thread(t1);
	         
	         Thread t13 = new Thread(t1);
	        t11.start();
	        t12.start();
	        t13.start();

	        t11.join();
	        t12.join();
	        t13.join();

	        System.out.println("All downloads complete!");
	    }
}
