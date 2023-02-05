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
				//Toolkit.getDefaultToolkit().beep(); /////////////////////////////////////////////// beep()
				try {
					TimeUnit.MILLISECONDS.sleep(400);
					//TimeUnit.SECONDS.sleep(1);
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
				try {
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("----------------------");
				//Toolkit.getDefaultToolkit().beep(); /////////////////////////////////////////////// beep()
				System.out.println("----------------------");
				System.out.println("setName");
				Thread t4 = new Thread();
				t4.setName("my_t4_thread");
				System.out.println("t4.getName = " + t4.getName());
				System.out.println("setPriority");
				t4.setPriority(Thread.MAX_PRIORITY); // 10
				System.out.println("t4.getPriority = " + t4.getPriority());
				
				System.out.println("----------------------");
				System.out.println("sleep");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("----------------------");
				System.out.println("join");
				Thread t5 = new Thread(new Thread2());
				t5.start();
				try {
					t5.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread is over");
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
