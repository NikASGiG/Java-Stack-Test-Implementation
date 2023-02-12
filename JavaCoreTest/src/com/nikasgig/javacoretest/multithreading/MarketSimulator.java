package com.nikasgig.javacoretest.multithreading;

public class MarketSimulator {

    private final static int STORESIZE = 5;
    

    public int getCount() {
        return Store.count;
    }

    public void addCount() {
        Store.count++;
    }

    public void subCount() {
        Store.count--;
    }

    public synchronized void buyBread() {
        for (int i = 0; i < 10; i++) {
            if (getCount() > 0) {
                subCount();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Buyer subtract bread in store");
            System.out.println("Store count = " + getCount());
        }

    }

    public synchronized void addBread() {
        for (int i = 0; i < 10; i++) {
            if (getCount() < STORESIZE) {
                addCount();
            }
            System.out.println("Factory add bread in store");
            System.out.println("Store count = " + getCount());
            notify();
        }
    }

}

class Store{
    public static int count = 0;
}

