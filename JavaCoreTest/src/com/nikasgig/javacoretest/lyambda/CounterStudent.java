package com.nikasgig.javacoretest.lyambda;

public class CounterStudent {

	public static int countOfStudent;
	
	
	
	public CounterStudent(int countOfStudent) {
		
		this.countOfStudent = countOfStudent;
	}

	public CounterStudent() {
		
		this.countOfStudent = 0;
	}


	public static void addOnePointForCount() {
		countOfStudent++;
	}

	public static int getCountOfStudent() {
		return countOfStudent;
	}
	
	
	
	//public CounterStudent cs = new CounterStudent();
	
}
