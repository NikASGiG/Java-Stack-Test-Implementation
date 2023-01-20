package com.nikasgig.javacoretest.gc;

import java.sql.Date;

public class GCMain {

	public void main() {
		System.out.println("----------------------");
		System.out.println("Garbage Collector");
		System.out.println("----------------------");
		
		
		
		taskB();
		for (int i = 0; i < 100_000; i++) {
			task();
		}
		taskE();
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		taskB();
		for (int i = 0; i < 100_000; i++) {
			task();
		}
		taskE();
		System.gc();
		System.out.println("----------------------");
		taskE();
		
		
		
		
		
		
		
		
	}
	
	
	public void taskB() {
		Date data1 = new Date(0);
		Runtime rt = Runtime.getRuntime();
		System.out.println("before");
		System.out.println("totalMemory: " + rt.totalMemory());
		System.out.println("freeMemory: " + rt.freeMemory());
		System.out.println("----------------------");
		
		
		
		
	}
	
	public void task() {
		for (int i = 0; i < 2000000000; i++) {                 // 2_000_000_000
			Date data = new Date(0);
			data = null;
		}
	}
	
	
	public void taskE() {
		Runtime rt = Runtime.getRuntime();
		System.out.println("----------------------");
		System.out.println("after");
		System.out.println("totalMemory: " + rt.totalMemory());
		System.out.println("freeMemory: " + rt.freeMemory());
	}
	
	
}
