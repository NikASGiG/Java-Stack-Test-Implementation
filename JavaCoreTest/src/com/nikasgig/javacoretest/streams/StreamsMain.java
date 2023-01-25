package com.nikasgig.javacoretest.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.Set;
import java.util.TreeSet;

import java.util.stream.Collectors;


import com.nikasgig.javacoretest.lyambda.Student;

public class StreamsMain {

	public void main() {
		
		System.out.println("----------------------");
		System.out.println("Streams");
		System.out.println("----------------------");
		
		System.out.println("map");
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("hello");
		l1.add("my");
		l1.add("name");
		l1.add("is not");
		l1.add("Bob");
		System.out.println(l1);
		
		ArrayList<String> l2 = new ArrayList<String>(l1);
		
		for (String el : l1) {
			System.out.print(el.length() + " ");
		}System.out.println();
		System.out.println("----------------------");

		
		for (int i = 0; i < l1.size(); i++) {
			l1.set(i, String.valueOf(l1.get(i).length()));
		}
		
		System.out.println(l1);
		//System.out.println(l2);
		System.out.println("----------------------");
		System.out.println(l2);
		//l2.stream().map(n -> n+"123456");
		System.out.println(l2.stream().map(n -> n+"123456").collect(Collectors.toList()));
		System.out.println(l2);
		System.out.println("----------------------");
		ArrayList<String> l3 = (ArrayList<String>) l2.stream().map(n -> n+"123456").collect(Collectors.toList());
		System.out.println(l3);
		
		System.out.println("----------------------");
		System.out.println(l1);
		int[] mas = new int[l1.size()];

		for (int i = 0; i < mas.length; i++) {
			mas[i] =  (int) (( Math.random() * (9-0) ) + 0);
		}
		
		///////
		
		int[] mass = new int[mas.length];

		for (int i = 0; i < mass.length; i++) {
			mass[i] =  Integer.valueOf(l1.get(i));
		}
		
		//////
		
		
		for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
		// //////
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}System.out.println();
		
		int[] mass2 = Arrays.stream(mass).map(i -> {if((i%2)==0)return 200;else if((i%3)==0)return 300;return i;})
				.toArray();
		
		for (int i = 0; i < mass2.length; i++) {
			System.out.print(mass2[i] + " ");
		}System.out.println();
		
		String temp = Arrays.toString(mass2);
		System.out.println(temp);
		temp = null;
		System.gc();
		System.out.println("----------------------");
		
		Set<String> set = new TreeSet<String>();
		set.add("hello");
		set.add("my");
		set.add("name");
		set.add("is not");
		set.add("Bob");
		System.out.println(set);
		set = set.stream().map(e->e+"!!!!!").collect(Collectors.toSet());
		System.out.println(set);
		System.out.println("----------------------");
		List<String> l4 = set.stream().map(e->e+"&&&").collect(Collectors.toList());
		System.out.println(l4);
		System.out.println("----------------------");
		System.out.println("filter");
		
		StreamSudent Student1;
		
		StreamSudent st1 = new StreamSudent("Misha", 18, true, 80.4);
		StreamSudent st2 = new StreamSudent("Antony", 18, true, 62.9);
		StreamSudent st3 = new StreamSudent("Valerian", 22, true, 82.9);
		StreamSudent st4 = new StreamSudent("Oliver", 17, true, 97.1);
		StreamSudent st5 = new StreamSudent("Maria", 21, false, 100);
		StreamSudent st6 = new StreamSudent("Antony", 20, true, 90);
		StreamSudent st7 = new StreamSudent("Nikita", 19, true, 74.3);
		
		ArrayList<StreamSudent> arr = new ArrayList<StreamSudent>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);
		arr.add(st6);
		arr.add(st7);
		System.out.println(arr);
		ArrayList<Student> arrF = new ArrayList<Student>(arr.stream().filter(e->e.getAge()>=20)
				.collect(Collectors.toList()));
	
		System.out.println(arrF);
		System.out.println("----------------------");
		System.out.println("forEach");
		System.out.println(l1);
		ArrayList<Integer> l5 = new ArrayList<Integer>(l1.size());
		l1.stream().forEach(e->l5.add(Integer.valueOf(e)));
		System.out.println(l5);
		int[] mas5 = new int[l5.size()];
		int i=0; l5.stream().forEach(e->
		{mas5[i]=e;});
		Arrays.stream(mas5).forEach(System.out::println);
		System.out.println("----------------------");
		
		Arrays.stream(mas5).forEach(StreamSudent::iMultyTwo);
		//Arrays.stream(mas5).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
