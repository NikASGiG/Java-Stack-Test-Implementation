package com.nikasgig.javacoretest.multithreading;

public class Interrupted extends Thread{

	@Override
	public void run() {
		for (int j = 0; j < 10000000; j++) {
			System.out.print(" hello " + j);
			if(isInterrupted()) {
				return;
			}
		}
	}
}
