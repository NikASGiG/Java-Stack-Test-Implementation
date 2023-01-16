package com.nikasgig.javacoretest.lyambda;

import java.util.ArrayList;

public class LyambdaMain {

	public void main(){
		
		System.out.println("Lyambda");
		Student st1 = new Student("Misha", 18, true, 80.4);
		Student st2 = new Student("Antony", 18, true, 62.9);
		Student st3 = new Student("Valerian", 22, true, 82.9);
		Student st4 = new Student("Oliver", 17, true, 97.1);
		Student st5 = new Student("Maria", 21, false, 100);
		Student st6 = new Student("Antony", 20, true, 90);
		Student st7 = new Student("Nikita", 19, true, 74.3);
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);
		arr.add(st6);
		arr.add(st7);
		System.out.println(arr);
		SortStudent.showTopAge(arr);
		System.out.println("----------------------");
		ArrayList<Student> arr1 = new ArrayList<Student>();
		arr1.add(st7);
		System.out.println(arr1);
		SortStudent.showTopAge(arr1);
		
		System.out.println("----------------------");
		Student stTop = SortStudent.showTopAgeR(arr);
		System.out.println(stTop);
		
		System.out.println("----------------------");
		System.out.println("Example of "	+ "Lyambda");
		System.out.println(arr);
		
		// SortStudent.showTopAge(arr, (Student s) -> { System.out.println("lambda method"); }); 
		
		//static void def(LyambdaTest lt) {
		//	System.out.println("lambda method " + lt.check(st1));
		//}
		
		
		
		
	}


}


