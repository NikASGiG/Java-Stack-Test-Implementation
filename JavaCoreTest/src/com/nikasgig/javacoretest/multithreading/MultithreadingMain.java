package com.nikasgig.javacoretest.multithreading;

public class MultithreadingMain {

	public void main() {
		// Multithreading
		
				System.out.println("----------------------");
				System.out.println("----------------------");
				System.out.println("Multithreading");
				System.out.println("1----------------------");
				
				Thread1 t1 = new Thread1();
				t1.main();
				System.out.println("2----------------------");
				//t1.main();
				System.out.println("3----------------------");
				System.out.println("it is awesome");
				
				for (int i = 0; i < 1000; i++) {
					System.out.print("_");
				}
				System.out.println("----------------------");
				System.out.println("Runnable");
				Thread t = new Thread(new Thread2());
				t.start();
				Thread t2 = new Thread(new Thread2());
				t2.start();
				
				
				
				
				
				
				
				
				
	}
	
}
