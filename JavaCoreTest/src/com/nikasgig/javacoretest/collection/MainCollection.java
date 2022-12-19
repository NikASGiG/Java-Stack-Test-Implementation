package com.nikasgig.javacoretest.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MainCollection {
		public void main() {
			
			
			System.out.println("----- Collection -----");
			System.out.println("ArrayList");
			ArrayList<String> list1 = new ArrayList<String>();
			list1.add("Misha");
			list1.add("Valerian");
			list1.add("Antony");
			list1.add("Maria");
			list1.add("Oliver");
			System.out.println("----------------------");
			System.out.println(list1);
			System.out.println("----------------------");
			Collections.sort(list1);
			System.out.println(list1);
			System.out.println("----------------------");
			
			ArrayList<EmployeeList> list2 = new ArrayList<>();
			EmployeeList emp1 = new EmployeeList(1, "Bill", 19000);
			list2.add(emp1);
			EmployeeList emp2 = new EmployeeList(9, "Mary", 1000);
			list2.add(emp2);
			EmployeeList emp3 = new EmployeeList(3, "Billy Jin", 4000);
			list2.add(emp3);
			EmployeeList emp4 = new EmployeeList(2, "Maks", 40000);
			list2.add(emp4);
			list2.add(emp1);
			list2.add(emp1);
			System.out.println(list2);
			Collections.sort(list2);
			System.out.println(list2);
			System.out.println("----------------------");
			System.out.println("Generics"); // <> <String> <Integer>
			System.out.println("----------------------");
			System.out.println("Parameterized");
			MyOwnList<String> parameterized1 = new MyOwnList<>("Hello");	
			System.out.println(parameterized1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
