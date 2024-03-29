package com.nikasgig.javacoretest.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.ws.handler.MessageContext.Scope;

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
		
		List<StreamSudent> arr = new ArrayList<StreamSudent>();
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
		System.out.println("----------------------");
		System.out.println("reduce");
		
		ArrayList<Integer> l6 = new ArrayList<Integer>(l5);
		System.out.println(l6);
		int result = l6.stream().reduce((accum, el) -> accum*el).get();
		System.out.println(result);
		//System.out.println(l6.get(0));
		if(result == (l6.get(0)*l6.get(1)*l6.get(2)*l6.get(3)*l6.get(4))) {
			System.out.println("l6.get(0)*l6.get(1)*l6.get(2)*l6.get(3)*l6.get(4) = " +
					l6.get(0)*l6.get(1)*l6.get(2)*l6.get(3)*l6.get(4));
		}
		
		List<Integer> l7 = new ArrayList<Integer>(); // empty
		
		Optional<Integer> o1 = Optional.of(l6.stream().reduce((accum, el) -> accum*el).get());
		//Optional<Integer> o2 = Optional.of(l7.stream().reduce((accum, el) -> accum*el).get());
		//System.out.println(l7.stream().reduce((accum, el) -> accum*el).get());
		
		if (o1.isPresent() == true) {
			System.out.println("Optional<Integer> o1 = " + o1.get());
		} else System.out.println("o1 is empty");
		//if (o2.isPresent() == true) {
		//	System.out.println(o2.get());
		//} else System.out.println("o2 is empty");
		System.out.println("----------------------");
		ArrayList<String> l8 = new ArrayList<String>();
		l8.add("hello");
		l8.add("my");
		l8.add("name");
		l8.add("is not");
		l8.add("Bob");
		System.out.println(l8);
		System.out.println(l8.stream().reduce((a,e)->a+" "+e).get());
		
		
		
		
		System.out.println("----------------------");
		System.out.println("sorted");
		int[] mas2 = {7,3,8,9,9,0,1,4,5,7,3,2,6,66,33,1,1};
		System.out.println(Arrays.toString(mas2));
		mas2 = Arrays.stream(mas2).sorted().toArray();
		System.out.println(Arrays.toString(mas2));
		
		System.out.println(arr);
		//arr = arr.stream().sorted((x,y)->{
		//	return x.getAge().compareTo(y.getAge());
		//}
		//).collect(Collectors.toList());
		
		System.out.println("----------------------");
		System.out.println("chaining");
		
		System.out.println(arr);
		arr.stream().map(e->e.age-e.age).filter(e->e > e+1).forEach(System.out::println);//.collect(Collectors.toList()));
		//System.out.println(arr);
		
		System.out.println("----------------------");
		System.out.println("concat");
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		//stream1.forEach(e->System.out.print(e + " "));
		System.out.println();
		Stream<Integer> stream2 = Stream.of(6,7,8,9,0);
		//stream2.forEach(e->System.out.print(e + " "));
		System.out.println();
		
		Stream<Integer> stream12 = Stream.concat(stream1, stream2);
		stream12.forEach(e->System.out.print(e + " "));
		//stream1.close();
		//stream2.close();
		System.out.println();
		System.out.println("----------------------");
		System.out.println("distinct");
		Stream<Integer> stream3 = Stream.of(1,3,3,6,6,7,8,10,4,3,2,1,1,6,78,4,3,9,0);
		stream3.distinct().forEach(e->System.out.print(e + " "));
		System.out.println();
		System.out.println("----------------------");
		System.out.println("count");
		Stream<Integer> stream4 = Stream.of(1,3,3,6,6,7,8,10,4,3,2,1,1,6,78,4,3,9,0);
		System.out.println(stream4.count());
		
		System.out.println("----------------------");
		System.out.println("peak");
		Stream<Integer> stream5 = Stream.of(1,3,3,6,6,7,8,10,4,3,2,1,1,6,78,4,3,9,0);
		stream5.peek(System.out::print).forEach(System.out::print);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("flatMap");
		
		Student pupil1 = new Student("Antony", 18, true, 62.9);
		Student pupil2 = new Student("Valerian", 22, true, 82.9);
		Student pupil3 = new Student("Oliver", 17, true, 97.1);
		Student pupil4 = new Student("Maria", 21, false, 100);
		Student pupil5 = new Student("Antony", 20, true, 90);
		Student pupil6 = new Student("Nikita", 19, true, 74.3);
		
		List<Student> school = new ArrayList<Student>();
		school.add(pupil1);
		school.add(pupil2);
		school.add(pupil3);
		school.add(pupil4);
		school.add(pupil5);
		school.add(pupil6);

		Faculty f1 = new Faculty(school, "Computer Sience");
		System.out.println(f1);
		Faculty f2 = new Faculty(school, "System analitics");
		System.out.println(f2);
		
		
		List<Student> school1 = new ArrayList<Student>();

		school1.add(pupil3);
		school1.add(pupil6);
		Faculty f3 = new Faculty(school1, "Bodybuilding");
		System.out.println(f3);
		

		
		
		
		List<Faculty> faculty = new ArrayList<>();
		faculty.add(f1);
		faculty.add(f2);
		faculty.add(f3);
		System.out.println(faculty);
		System.out.println("----------------------");
		faculty.stream().flatMap(e->e.getStudents().stream()).forEach(System.out::println);
		System.out.println("----------------------");
		System.out.println("collect grouping and partitioning");
		System.out.println("grouping");
		List<BlogPost> posts = Arrays.asList();
		Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
				  .collect(Collectors.groupingBy(BlogPost::getType));
		//System.out.println(postsPerType);
		for (Map.Entry<BlogPostType, List<BlogPost>> entry: postsPerType.entrySet ()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().toString());
		}
		System.out.println("partitioning");
		
		List<BlogPost> posts1 = Arrays.asList();
		Map<BlogPostType, List<BlogPost>> postsPerType1 = posts1.stream()
				  .collect(Collectors.groupingBy(BlogPost::getType));
		//System.out.println(postsPerType);
		for (Map.Entry<BlogPostType, List<BlogPost>> entry: postsPerType1.entrySet ()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().toString());
		}
		
		System.out.println("----------------------");
		System.out.println("findFirst");
		Optional<Faculty> nst = faculty.stream().findFirst();
		System.out.println(nst);
		
		System.out.println("----------------------");
		System.out.println("min and max");
		List<Student1> schoolStudent1 = new ArrayList<Student1>();
		Student pupil11 = new Student1("Antony", 18, true, 62.9);
		Student pupil21 = new Student1("Valerian", 22, true, 82.9);
		Student pupil31 = new Student1("Oliver", 17, true, 97.1);
		Student pupil41 = new Student1("Maria", 21, false, 100);
		Student pupil51 = new Student1("Antony", 20, true, 90);
		Student pupil61 = new Student1("Nikita", 19, true, 74.3);
		schoolStudent1.add((Student1)pupil11);
		schoolStudent1.add((Student1)pupil21);
		schoolStudent1.add((Student1)pupil31);
		schoolStudent1.add((Student1)pupil41);
		schoolStudent1.add((Student1)pupil51);
		schoolStudent1.add((Student1)pupil61);
		System.out.println(schoolStudent1);
		Optional<Student1> min = schoolStudent1.stream().min((x,y)-> x.getAge() - y.getAge());
		System.out.println("min = " + min);
		Optional<Student1> max = schoolStudent1.stream().max((x,y)-> x.getAge() - y.getAge());
		System.out.println("max = " + max);
		
		
		System.out.println("----------------------");
		System.out.println("limit");
		school.stream().limit(3).forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("skip");
		school.stream().skip(3).forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("mapToInt");
		schoolStudent1.stream().mapToInt(e->e.ageStudent1).forEach(System.out::println);
		List<Integer> ss1AgeList = schoolStudent1.stream().mapToInt(e->e.ageStudent1).boxed().collect(Collectors.toList());
		System.out.println(ss1AgeList);
		int sum = schoolStudent1.stream().mapToInt(e->e.ageStudent1).sum();
		System.out.println("sum ages schoolStudent1 = " + sum);
		
		OptionalDouble average = schoolStudent1.stream().mapToInt(e->e.ageStudent1).average();
		System.out.println("ages average schoolStudent1 = " + average.getAsDouble());
		double average1 = schoolStudent1.stream().mapToInt(e->e.ageStudent1).average().getAsDouble();
		System.out.println("ages average1 schoolStudent1 = " + average1);
		
		int min1 = schoolStudent1.stream().mapToInt(e->e.ageStudent1).min().getAsInt();
		System.out.println("min1 ages schoolStudent1 = " + min1);
		
		int max1 = schoolStudent1.stream().mapToInt(e->e.ageStudent1).max().getAsInt();
		System.out.println("max1 ages schoolStudent1 = " + max1);
		
		
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("Parallel Stream");
		
		List<Integer> parallelList = new ArrayList<Integer>(10000);
		for (int j = 0; j < 10000; j++) {
			parallelList.add(Faculty.localRandom(0,100));
		}
		sum = 0;
		int sumP = 0;
		System.out.println(parallelList.size());
		sum = parallelList.stream().reduce((a,e)->a+e).get();
		System.out.println(sum);
		sumP = parallelList.parallelStream().reduce((a,e)->a+e).get();
		System.out.println(sumP);
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		
		
		
		
	}
	
}
