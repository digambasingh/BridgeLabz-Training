package com.bridgelabz.multithreading;

	class PrintJob implements Runnable {

	    String name;
	    int pages;

	    PrintJob(String name, int pages) {
	        this.name = name;
	        this.pages = pages;
	    }

	    public void run() {
	        try {
	            for (int i = 1; i <= pages; i++) {
	                System.out.println("Printing " + name +
	                        " Page " + i + "/" + pages);
	                Thread.sleep(100);
	            }
	        } catch (Exception e) {}
	    }
	}

	public class PrintShopSchedular {
	    public static void main(String[] args) throws Exception {

	        long start = System.currentTimeMillis();

	        Thread t1 = new Thread(new PrintJob("Job1",10));
	        Thread t2 = new Thread(new PrintJob("Job2",5));
	        Thread t3 = new Thread(new PrintJob("Job3",15));

	        t1.setPriority(5);
	        t2.setPriority(8);
	        t3.setPriority(3);

	        t1.start(); t2.start(); t3.start();

	        t1.join(); t2.join(); t3.join();

	        long end = System.currentTimeMillis();
	        System.out.println("All jobs completed in " + (end-start) + "ms");
	    }
	}

