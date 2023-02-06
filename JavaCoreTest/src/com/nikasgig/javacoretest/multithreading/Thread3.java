package com.nikasgig.javacoretest.multithreading;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			DataRaceCounter.counter++;
			System.out.print(DataRaceCounter.counter + " ");
			
		}
		
		
		
	}

}