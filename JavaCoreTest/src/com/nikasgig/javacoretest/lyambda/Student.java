package com.nikasgig.javacoretest.lyambda;
import com.nikasgig.javacoretest.lyambda.CounterStudent;
public class Student {

	int id;
	String name;
	int age;
	boolean gender;
	String genderS;
	double rating;
	
	
	
	public Student(String name, int age, String genderS, double rating) {
		
		this.id = CounterStudent.getCountOfStudent();
		CounterStudent.addOnePointForCount();
		this.name = name;
		this.age = age;
		this.genderS = genderS;
		
		if (this.genderS == "Male") {
			this.gender = true;
		} else if (this.genderS == "Female") {
			this.gender = false;
		}
		
		this.rating = rating;
	}
	public Student(String name, int age, boolean gender, double rating) {
		
		this.id = CounterStudent.getCountOfStudent();
		CounterStudent.addOnePointForCount();
		this.name = name;
		this.age = age;
		this.gender = gender;
		if (gender) {
			this.genderS = "Male";
		} else if (!gender) {
			this.genderS = "Female";
		}
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + genderS + ", rating=" + rating
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
