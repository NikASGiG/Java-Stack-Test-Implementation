package com.nikasgig.javacoretest.gc;

import java.sql.Date;
import java.util.ArrayList;

public class GCMain {

	public void main() {
		System.out.println("----------------------1");
		System.out.println("Garbage Collector");
		System.out.println("----------------------2");
		
		
		
		taskB();
		for (int i = 0; i < 100_000; i++) {
			task();
		}
		taskE();
		System.out.println("----------------------3");
		System.out.println("----------------------4");
		System.out.println("----------------------5");
		taskB();
		for (int i = 0; i < 100_000; i++) {
			task();
		}
		taskE();
		System.gc();
		System.out.println("----------------------6");
		System.out.println("after gc");
		taskE();
		
		
		
		
		System.out.println("----------------------7");
		ArrayList<Date> d = new ArrayList<Date>();
		System.out.println(d);
		
		taskB();
		d = taskList(d);
		taskE();
		System.gc();
		System.out.println("----------------------8");
		System.out.println("after gc");
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
	
	
	
	public ArrayList<Date> taskList(ArrayList<Date> d) {
		for (int i = 0; i < 2_000_000; i++) {                 // 2_000_000_000
			Date data = new Date(0);
			d.add(data);
			data = null;
		}
		return d;
	}
	
	
	
	
}
