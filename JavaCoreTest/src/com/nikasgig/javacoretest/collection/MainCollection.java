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
			System.out.println("Parameterized class");
			MyOwnList<String> parameterized1 = new MyOwnList<>("Hello");	
			System.out.println(parameterized1);
			MyOwnList<Integer> parameterized2 = new MyOwnList<>(23);	
			System.out.println(parameterized2);
			System.out.println(parameterized1.getVar());
			parameterized1.setVar("Hi");
			System.out.println(parameterized1.getVar());
			System.out.println(parameterized1);
			System.out.println("----------------------");
			
			MyOwnList3<Integer, Boolean, String> p3 = new MyOwnList3<Integer, Boolean, String>(1, true, "Yes");
			System.out.println(p3);
			System.out.println("----------------------");
			System.out.println("Parameterized method");
			System.out.println(list1);
			ParameterizedMethod pm = new ParameterizedMethod();
			System.out.println(pm.getSecond(list1));
			System.out.println("----------------------");
			// we can't make overflow method with Generic
			// This is type erasure
			
			System.out.println("----- Continue Collection -----");
			System.out.println("ArrayList");
			ArrayList<Integer> list3 = new ArrayList<Integer>();
			list3.add(4);
			list3.add(1, 5);
			list3.add(2, 3);
			list3.add(3, 8);
			System.out.println(list3);
			for (Integer i : list3) {
				System.out.print(i + " ");
			}System.out.println();
			System.out.println(list3.get(0)); //4
			for (int i = 0; i < list3.size(); i++) {
				System.out.print(list3.get(i) + " ");
			}System.out.println();
			System.out.println("----------------------");
			System.out.println(list3.get(3));
			list3.set(3, 888);
			System.out.println(list3.get(3));
			System.out.println("----------------------");
			System.out.println(list3);
			//System.out.println(list3.size()); 4
			int list3size = list3.size();
			int i1 = 1;
			for (int i = 1; i < list3size; i++) {
				list3.remove(i1);
			}
			System.out.println(list3);
			
			System.out.println("----------------------");
			
			System.out.println(list1);
			ArrayList<String> list4 = new ArrayList<>();
			list4.add("!");
			list4.add("!!");
			list4.add("!!!");
			System.out.println(list4);
			list4.addAll(list1);
			System.out.println(list4);
			list4.addAll(1, list1);
			System.out.println(list4);
			System.out.println("----------------------");
			System.out.println(list1);
			list1.clear();
			System.out.println(list1);
			System.out.println("----------------------");
			System.out.println(list4.indexOf("!!!"));
			System.out.println(list4.indexOf("!Antony!")); // -1 // is not found
			System.out.println(list4.indexOf("Antony")); // had found only first
			System.out.println("----------------------");
			System.out.println(list1.isEmpty());
			System.out.println(list4.isEmpty());
			System.out.println("----------------------");
			System.out.println(list4.contains("!!!"));
			System.out.println(list4.contains("!Antony!")); // is not found
			System.out.println(list4.contains("Antony")); 
			System.out.println("----------------------");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
