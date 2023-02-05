package com.nikasgig.javacoretest.multithreading;

import com.nikasgig.javacoretest.streams.Faculty;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		int num = Faculty.localRandom(4, 9);
		for (int i = 0; i < 1000; i++) {
			System.out.print(num);
		}System.out.println();
		
	}

}
