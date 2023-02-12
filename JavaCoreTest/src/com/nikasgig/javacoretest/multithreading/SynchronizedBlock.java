package com.nikasgig.javacoretest.multithreading;

public class SynchronizedBlock implements Runnable {

    @Override
    public void run() {
        doWork1();
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            DataRaceCounter.counter++;
            System.out.println(DataRaceCounter.counter);
        }
    }

    private void doWork2() {
        System.out.println("I am doing this work!");
    }

}
