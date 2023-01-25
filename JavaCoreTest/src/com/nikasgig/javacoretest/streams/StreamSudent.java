package com.nikasgig.javacoretest.streams;

import com.nikasgig.javacoretest.lyambda.Student;

public class StreamSudent extends Student {

	public int age;
	
	public StreamSudent(String name, int age, String genderS, double rating) {
		super(name, age, genderS, rating);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public StreamSudent(String name, int age, boolean gender, double rating) {
		super(name, age, gender, rating);
		// TODO Auto-generated constructor stub
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}
