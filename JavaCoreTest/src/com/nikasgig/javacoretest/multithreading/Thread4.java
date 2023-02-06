package com.nikasgig.javacoretest.multithreading;

public class Thread4 extends Thread3 {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			add();
			System.out.print(DataRaceCounter.counter + " ");
		}
			
		}
		
	public static synchronized void add() {
		DataRaceCounter.counter++;
	}
	
	
}
