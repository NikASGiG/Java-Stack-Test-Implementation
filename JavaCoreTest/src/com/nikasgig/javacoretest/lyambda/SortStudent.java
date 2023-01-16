package com.nikasgig.javacoretest.lyambda;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	
}
