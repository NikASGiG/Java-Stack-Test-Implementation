package com.nikasgig.javacoretest.multithreading;

public class SynchronizedBlock2 extends SynchronizedBlock {

    @Override
    public void run() {
        doWork3();
    }
    
    private static void doWork1clone() {

        DataRaceCounter.counter++;
        System.out.println(DataRaceCounter.counter);

    }

    private static void doWork3() {
        System.out.println("I am working!");
        synchronized (SynchronizedBlock.class) {
            doWork1clone();
        }
    }
    
}
