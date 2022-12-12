package com.nikasgig.javacoretest.recursion;



public class RecursionDemo {
	public int i1 = 0;
	void hi() {
		System.out.print("hi " + i1 + "---");
		i1++;
	}
	public void DoRecursionDemo() {
		hi();
		if (i1 >= 1000) {
			System.out.println();
			return;
		}
		DoRecursionDemo();
		
	}
}
