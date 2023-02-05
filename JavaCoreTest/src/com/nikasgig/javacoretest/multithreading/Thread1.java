package com.nikasgig.javacoretest.multithreading;

public class Thread1  {

	public void main() {
		// TODO Auto-generated method stub

		InnerThread1 it1 = new InnerThread1();
		InnerThread2 it2 = new InnerThread2();
		InnerThread3 it3 = new InnerThread3();
		it1.start();
		it2.start();
		it3.start();
		
	}
	
	
}

class InnerThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
}

class InnerThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(2 + " ");
			}
			System.out.println();
		}
	}
}

class InnerThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(3 + " ");
			}
			System.out.println();
		}
	}
}