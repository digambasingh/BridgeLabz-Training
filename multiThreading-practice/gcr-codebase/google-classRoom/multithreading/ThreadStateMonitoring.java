package com.bridgelabz.multithreading;

	class TaskRunner extends Thread {
	    public TaskRunner(String name) {
	        super(name);
	    }

	    public void run() {
	        try {
	            Thread.sleep(2000);
	            for (int i = 0; i < 1000000; i++);
	        } catch (Exception e) {}
	    }
	}

	public class ThreadStateMonitoring {
	    public static void main(String[] args) throws Exception {

	        TaskRunner t1 = new TaskRunner("Task-1");
	        TaskRunner t2 = new TaskRunner("Task-2");

	        System.out.println(t1.getName()+" "+t1.getState());

	        t1.start();
	        t2.start();

	        while (t1.isAlive() || t2.isAlive()) {
	            System.out.println(t1.getName()+" "+t1.getState());
	            Thread.sleep(500);
	        }

	        System.out.println("Monitoring complete");
	    }
	}

