package com.nikasgig.javacoretest.multithreading;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

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
				for (int i = 0; i < 1000; i++) {
					System.out.print("_");
				}
				Toolkit.getDefaultToolkit().beep(); /////////////////////////////////////////////// beep()
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("----------------------");
				System.out.println("----------------------");
				System.out.println("Create code thread now");
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 0; i < 100; i++) {
							System.out.print(1);
						}
						
					}
					}).start();
				
				new Thread(()->{for (int i = 0; i < 100; i++) {System.out.print(2);}}).start();
				System.out.println("----------------------");
				System.out.println("----------------------");
				Toolkit.getDefaultToolkit().beep(); /////////////////////////////////////////////// beep()
				System.out.println();
				
				
				
	}
	
}
