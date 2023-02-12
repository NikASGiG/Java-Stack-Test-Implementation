package com.nikasgig.javacoretest.multithreading;

public class Buyer implements Runnable {

    @Override
    public void run() {
        MarketSimulator marketSimulator = new MarketSimulator();
        marketSimulator.buyBread();

    }

}
