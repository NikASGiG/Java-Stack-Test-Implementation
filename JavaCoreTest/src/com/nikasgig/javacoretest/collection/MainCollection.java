package com.nikasgig.javacoretest.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

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
			
			StringBuilder str1 = new StringBuilder("str1text");
			StringBuilder str2 = new StringBuilder("str2text");
			StringBuilder str3 = new StringBuilder("str3text");
			StringBuilder str4 = new StringBuilder("str4text");
			StringBuilder str5 = new StringBuilder("str5text");
			StringBuilder str6 = new StringBuilder("str6text");
			StringBuilder[] strArr = {str1, str2, str3, str4, str5, str6};
			
			System.out.println("strArr[] = " + strArr);
			java.util.List<StringBuilder> strList = Arrays.asList(strArr); // java.util.List<StringBuilder>
			System.out.println(strList);
			strArr[1].append("22222");
			System.out.println(strList);
			System.out.println("----------------------");
			ArrayList<String> list42 = new ArrayList<String>();
			ArrayList<String> list43 = new ArrayList<String>();
			list42.add("first1");
			list42.add("second1");
			list42.add("third");
			list43.add("first2");
			list43.add("second1");
			list43.add("third2");
			System.out.println(list42);
			System.out.println(list43);
			list42.removeAll(list43);
			System.out.println(list42); // [first1, third]
			System.out.println("----------------------");
			list42.retainAll(list43);
			System.out.println(list42);
			System.out.println("----------------------");
			
			System.out.println(list42.containsAll(list43));
			System.out.println("----------------------");
			
			ArrayList<String> list5 = new ArrayList<String>();
			list5.add("Misha");
			list5.add("Valerian");
			list5.add("Antony");
			list5.add("Maria");
			list5.add("Oliver");
			Iterator<String> iter1 = list5.iterator();
			while (iter1.hasNext()) {
				System.out.print(iter1.next() + " ");
				
			} System.out.println();
			System.out.println("----------------------");
			System.out.println(list5);
			Iterator<String> iter2 = list5.iterator();
			while (iter2.hasNext()) {
				iter2.next();
				iter2.remove();
				
			} System.out.println();
			System.out.println(list5);
			System.out.println("----------------------");
			System.out.println("LinkedList");
			LinkedList<String> ll = new LinkedList<String>();
			ll.add("Misha");
			ll.add("Valerian");
			ll.add("Antony");
			ll.add("Maria");
			ll.add("Oliver");
			System.out.println(ll);
			System.out.println("----------------------");
			System.out.println("ListIterator");
			ListIterator listIterator = new ListIterator();
			listIterator.main();
			System.out.println("----------------------");
			System.out.println("BinarySearch");
			BinarySearch bin = new BinarySearch();
			bin.genRandomNumToList(300);
			bin.showList();
			bin.Sort();
			bin.showList();
			bin.search(100);
			System.out.println("----------------------");
			System.out.println("Vector");
			System.out.println("Do not recommend for using");
			
			Vector<String> vec = new Vector<String>();
			vec.add("Misha");
			vec.add("Valerian");
			vec.add("Antony");
			vec.add("Maria");
			vec.add("Oliver");
			System.out.println(vec);
			System.out.println(vec.firstElement());
			System.out.println(vec.lastElement());
			vec.remove(1);
			System.out.println(vec);
			System.out.println(vec.get(1));
			System.out.println("----------------------");
			System.out.println("Stack");
			System.out.println("Do not recommend for using");
			
			Stack<String> stack = new Stack<String>();
			stack.push("Misha");
			stack.push("Valerian");
			stack.push("Antony");
			stack.push("Maria");
			stack.push("Oliver");

			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
				System.out.println(stack);
			}
			
			System.out.println("----------------------");
			
			Stack<String> stack1 = new Stack<String>();
			stack1.push("Misha");
			stack1.push("Valerian");
			stack1.push("Antony");
			stack1.push("Maria");
			stack1.push("Oliver");
			System.out.println(stack1);
			System.out.println(stack1.peek());
			System.out.println("----------------------");
			
			System.out.println("Map");
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1234, "Misha Maradona");
			map.put(2345, "Valerian King");
			map.put(3456, "Antony American");
			map.put(4567, "Maria Blood");
			map.put(5678, "Oliver Biscuit");
			System.out.println(map);
			map.putIfAbsent(1234, "qwer qwer");
			map.putIfAbsent(1234, "asdfzxcv zxvvzv");
			System.out.println(map);
			map.remove(1234);
			System.out.println(map);
			System.out.println(map.containsValue("Antony American")); // true
			System.out.println(map.containsKey(23456)); // false
			System.out.println("----------------------");
			System.out.println("HashMap");
			for (Map.Entry<Integer, String> entry: map.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
