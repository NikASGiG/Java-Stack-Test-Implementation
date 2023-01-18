package com.nikasgig.javacoretest.lyambda;

import java.util.ArrayList;

import javax.lang.model.element.Element;

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
		
		//SortStudent.def("sdf", (Student s) -> { System.out.println("lambda method"); }); //def("sdf", (Student s) -> { System.out.println("lambda method"); }); 
		
		System.out.println("----------------------");
		System.out.println("java.util.function");
		System.out.println("----------------------");
		System.out.println("Predicate");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("qwerty");
		al.add("qwert");
		al.add("qwer");
		al.add("erty");
		al.add("werty");
		al.add("qwerty2");
		System.out.println(al);
		al.removeIf(el -> el.length() == 4);
		System.out.println(al);
		al.removeIf(el -> el.length() >= 6);
		System.out.println(al);
		System.out.println("----------------------");
		System.out.println("Supplier");
		
		//SortStudent.createThreeStudent(StudentSupplier);
		ArrayList<Student> cts = SortStudent.createThreeStudent(() -> new Student("Ivan", 18, true, 75)); 
		System.out.println(cts); // 3
		
		System.out.println("----------------------");
		System.out.println("Consumer");
		
		SortStudent.changerStudent(cts.get(0), s -> {
			s.name = "whatever";
			s.age = 90;
			s.rating = 60.1;
		});
		
		System.out.println(cts);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}


