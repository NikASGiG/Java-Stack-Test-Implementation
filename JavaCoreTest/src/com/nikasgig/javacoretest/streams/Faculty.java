package com.nikasgig.javacoretest.streams;

import java.util.ArrayList;
//import java.util.Random;
import java.util.List;

import com.nikasgig.javacoretest.lyambda.CounterStudent;
import com.nikasgig.javacoretest.lyambda.Student;

public class Faculty {

	List<Student> students;
	String title;
	int yearOfExp;
	int id;
	
	public Faculty(List<Student> school, String name) {
		//super();
		this.id = CounterStudent.getCountOfStudent();
		CounterStudent.addOnePointForCount();
		this.students = school;
		this.title = name;
		this.yearOfExp = localRandom(0,2023);
	}
	
	
	
	public List<Student> getStudents() {
		return students;
	}



	public int localRandom(int a, int b) {
		return (int)( Math.random() * (b-a) ) + a;
	}

	@Override
	public String toString() {
		return "Faculty_"+ id +" [students=" + students.size() + ", title=" + title + ", yearOfExp=" + yearOfExp + "]";
	}
	
	
	
}
