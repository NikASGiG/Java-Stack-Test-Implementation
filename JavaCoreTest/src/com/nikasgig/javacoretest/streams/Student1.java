package com.nikasgig.javacoretest.streams;

import com.nikasgig.javacoretest.lyambda.Student;

public class Student1 extends Student {

	int ageStudent1;
	
	
	public Student1(String name, int age, String genderS, double rating) {
		super(name, age, genderS, rating);
		this.ageStudent1 = age;
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int age, boolean gender, double rating) {
		super(name, age, gender, rating);
		this.ageStudent1 = age;
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return ageStudent1;
	}
	
	

}
