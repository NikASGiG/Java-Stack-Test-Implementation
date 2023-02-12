package com.nikasgig.javacoretest.multithreading;

public class Factory implements Runnable {

    @Override
    public void run() {
        MarketSimulator marketSimulator = new MarketSimulator();
        marketSimulator.addBread();

    }

}
