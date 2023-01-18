package com.nikasgig.javacoretest.lyambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SortStudent {

	public static void showTopAge(ArrayList<Student> st) {
		
		//int topId = -1;
		Student studentTop = null;
		for (Iterator iterator = st.iterator(); iterator.hasNext();) {
			Student student1 = (Student) iterator.next();
			 
			if (iterator.hasNext()) {
				Student student2 = (Student) iterator.next();
				if (student1.age > student2.age) {
					//topId = student1.id;
					studentTop = student1;
				} else {
					//topId = student2.id;
					studentTop = student2;
				}
			} else {
				Student student2 = studentTop;
				if (student2 == null) {
					studentTop = student1;
				} else {
					if (student1.age > student2.age) {
						//topId = student1.id;
						studentTop = student1;
					} else {
						//topId = student2.id;
						studentTop = student2;
					}
				}
			}
			
			
		}
		
		System.out.println(studentTop);
		
	}
	
	///////////////////////////////
	
	
	public static Student showTopAgeR(ArrayList<Student> st) {
		
		//int topId = -1;
		Student studentTop = null;
		for (Iterator iterator = st.iterator(); iterator.hasNext();) {
			Student student1 = (Student) iterator.next();
			 
			if (iterator.hasNext()) {
				Student student2 = (Student) iterator.next();
				if (student1.age > student2.age) {
					//topId = student1.id;
					studentTop = student1;
				} else {
					//topId = student2.id;
					studentTop = student2;
				}
			} else {
				Student student2 = studentTop;
				if (student2 == null) {
					studentTop = student1;
				} else {
					if (student1.age > student2.age) {
						//topId = student1.id;
						studentTop = student1;
					} else {
						//topId = student2.id;
						studentTop = student2;
					}
				}
			}
			
			
		}
		
		//System.out.println(studentTop);
		return studentTop;
		
	}

	


	





	/////

	

	
	
	
	
	
	
	

	static void def(LyambdaTest lt) {
		System.out.printf("lambda method ", lt.check("holla"));
	}

	public static void def(String string, Object object) {
		// TODO Auto-generated method stub
		System.out.printf("lambda method " + "holla");
	}
	
	public static ArrayList<Student> createThreeStudent (Supplier<Student> StudentSupplier) {
		ArrayList<Student> al = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
		al.add(StudentSupplier.get ());
		}
		return al;
	
	}
	
	
	
	///////////////////////////
	
	public static void changerStudent(Student s, Consumer<Student> sconsumer) {
		
		sconsumer.accept(s);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

interface LyambdaTest{

	Object[] check(String s);

}

