package com.bridgelabz.multithreading;

class Chef extends Thread {

    String dish;
    int time;

    Chef(String name, String dish, int time) {
        super(name);
        this.dish = dish;
        this.time = time;
    }

    public void run() {
        try {
            System.out.println(getName() + " started " + dish);

            for (int p = 25; p <= 100; p += 25) {
                Thread.sleep(time * 10);
                System.out.println(getName() + " preparing "
                        + dish + ": " + p + "%");
            }

        } catch (Exception e) {}
    }
}

public class RestaurantSystem {
    public static void main(String[] args) throws Exception {

        Chef c1 = new Chef("Chef-1","Pizza",300);
        Chef c2 = new Chef("Chef-2","Pasta",200);
        Chef c3 = new Chef("Chef-3","Salad",100);
        Chef c4 = new Chef("Chef-4","Burger",250);

        c1.start(); c2.start(); c3.start(); c4.start();

        c1.join(); c2.join(); c3.join(); c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
