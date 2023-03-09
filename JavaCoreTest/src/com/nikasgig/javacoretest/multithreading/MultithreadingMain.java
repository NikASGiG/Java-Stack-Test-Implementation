package com.nikasgig.javacoretest.multithreading;

import java.awt.Toolkit;
import java.lang.management.GarbageCollectorMXBean;
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
		// t1.main();
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
		// Toolkit.getDefaultToolkit().beep();
		// /////////////////////////////////////////////// beep()
		try {
			TimeUnit.MILLISECONDS.sleep(400);
			// TimeUnit.SECONDS.sleep(1);
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

		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.print(2);
			}
		}).start();
		System.out.println("----------------------");
		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------");
		// Toolkit.getDefaultToolkit().beep();
		// /////////////////////////////////////////////// beep()
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
		System.out.println("----------------------");
		System.out.println("getState");
		Thread t6 = new Thread(new Thread2());
		System.out.println("---" + t6.getState() + "---");
		t6.start();
		System.out.println("---" + t6.getState() + "---");
		try {
			t6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---" + t6.getState() + "---");

		System.out.println("----------------------");

		System.out.println("volatile");

		main2();
	}

	volatile boolean vol = true;
	volatile int count = 0;

	public void main2() {

		System.out.println("count = " + count);

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (vol) {
					count++;
				}
				System.out.println("Thread is TERMINATED");
			}

		}).start();
		System.out.println("Thread is running");
		try {
			Thread.sleep(200);
			vol = false;
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count = " + count);

		System.out.println("----------------------");
		System.out.println("Data race");

		Thread t10 = new Thread(new Thread3());
		Thread t11 = new Thread(new Thread3());
		Thread t12 = new Thread(new Thread3());
		t10.start();
		t11.start();
		t12.start();
		try {
			t10.join();
			t11.join();
			t12.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("DataRaceCounter.counter = " + DataRaceCounter.counter);
		System.out.println("----------------------");
		System.out.println("synchronized");
		DataRaceCounter.counter = 0;
		Thread t13 = new Thread(new Thread4());
		Thread t14 = new Thread(new Thread4());
		Thread t15 = new Thread(new Thread4());
		t13.start();
		t14.start();
		t15.start();
		try {
			t13.join();
			t14.join();
			t15.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("DataRaceCounter.counter = " + DataRaceCounter.counter);
		System.out.println("----------------------");
		System.out.println("synchronized block");

		Thread t16 = new Thread(new SynchronizedBlock());
		Thread t17 = new Thread(new SynchronizedBlock());
		Thread t18 = new Thread(new SynchronizedBlock());
		Thread t19 = new Thread(new SynchronizedBlock());
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		try {
			t16.join();
			t17.join();
			t18.join();
			t19.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------");
		Thread t20 = new Thread(new SynchronizedBlock());
		Thread t21 = new Thread(new SynchronizedBlock());
		t20.start();
		t21.start();
		try {
			t20.join();
			t21.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------");
		System.out.println("Lock and ReentrantLock");
		Calls calls = new Calls();
		Thread t22 = new Thread(new Runnable() {
			@Override
			public void run() {
				calls.mobile();
			}
		});
		Thread t23 = new Thread(new Runnable() {
			@Override
			public void run() {
				calls.telegram();
			}
		});
		Thread t24 = new Thread(new Runnable() {
			@Override
			public void run() {
				calls.instagram();
			}
		});
		t22.start();
		t23.start();
		t24.start();
		
		try {
			t22.join();
			t23.join();
			t24.join();
		} catch (Exception e) {
		}
		finally {
			System.out.println("----------------------");
		}
		System.out.println("Daemon Thread");
		
		Thread t25 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I am daemon");
				System.gc();
			}
		});
		t25.setDaemon(true);
		t25.start();
		System.out.println("true = " + t25.isDaemon());
		System.out.println("----------------------");
		System.out.println("stop thread");
		Thread t26 = new Interrupted();
		t26.start();
		for (int i = 0; i < 100; i++) {
			System.out.print(" bye " + i);
		}
		t26.interrupt();
		
		
	}
}
