package com.nikasgig.javacoretest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner; // импорт класса Scanner
import java.util.stream.Stream;

import com.nikasgig.javacoretest.WinApp.MainApp;

//import javax.print.DocFlavor.URL;

import com.nikasgig.javacoretest.arraygenerator.ArrayGenerator;
import com.nikasgig.javacoretest.arraygenerator.ArrayToList;
import com.nikasgig.javacoretest.collection.MainCollection;
import com.nikasgig.javacoretest.gc.GCMain;
import com.nikasgig.javacoretest.lyambda.LyambdaMain;
import com.nikasgig.javacoretest.nestedclasses.Nested;
import com.nikasgig.javacoretest.recursion.RecursionDemo;
import com.nikasgig.javacoretest.streams.StreamsMain;
import com.nikasgig.javacoretest.testtask.TestTaskMain;



public class JavaCoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Welcome to test of java core 1.8");
		
		System.out.println("----- 08.07.2022 -----");
		
		String var1 = "string staring 1 2 end";
		
		System.out.println(var1);
		
		System.out.println("----- 03.12.2022 -----");
		// CustomObject myObject = new CustomObject();
		TestWorkWithClass Func1 = new TestWorkWithClass();
		//TestWorkWithClass Func2 = null;
		int a = 3, b = 4;
		System.out.println("Sum of a + b = " + a + " + " + b + " = " + Func1.Sum(a, b));
		String var2 = "Sum of a + b = " + a + " + " + b + " = " + Func1.Sum(3, 4);
		System.out.println(var2);
		String var3 = "Sum of a * b = " + 6 + " * " + 20 + " = " + Func1.Multiply(6, 20);
		System.out.println(var3);
		System.out.println("----------------------");
		Scanner in = new Scanner(System.in);
		Func1.ShowMenu();
		System.out.print("> ");
		
		boolean CheckerTaskMenu = false;
		
		
		if (CheckerTaskMenu) {
			Func1.TaskMenu(in.nextInt());
		}
		
		
		//Func1.TaskMenu(in.nextInt());
		System.out.println("----------------------");
		int n10 = 10;
		int[] ArrayOfRandomNumbers = new int[n10];
		for (int i = 0; i < ArrayOfRandomNumbers.length; i++) {
			ArrayOfRandomNumbers[i] = i;
		}
		for (int i = 0; i < ArrayOfRandomNumbers.length; i++) {
			System.out.print(ArrayOfRandomNumbers[i] + " ");
		}
		System.out.println();
		
		int[] mas = {1, 2, 4, 6, 7, 8, 0, 3};
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}System.out.println();
		//System.out.println("----------------------");
		System.out.println("----- 04.12.2022 -----");
		
		for(int i:mas) {                      // temple for each
			System.out.print(i + " ");
		} System.out.println();
		
		
		Func1.getNumber(mas[1]);
		Func1.getCheckerNumber(true);
		
		String var4 = Integer.toString(Func1.setNumber()) + " " + String.valueOf(Func1.setCheckerNumber());
						
		System.out.println(var4);
		System.out.println("----- 07.12.2022 -----");
		Animal Prototype = new Animal();
		Prototype.showStatus();
		Animal Prototype2 = new Animal();
		
		System.out.println(Prototype2.name);
		System.out.println("----------------------");
		Pig pig1 = new Pig();
		pig1.showStatus();
		Dog dog1 = new Dog();
		dog1.showStatus();
		System.out.println("-"+dog1.type+"-");
		dog1.waitCommand();
		dog1.doHunting();
		System.out.println("----------------------");
		Corgi corgi = new Corgi();
		corgi.upStatus();
		corgi.showStatus();
		System.out.println("----------------------");
		
		System.out.println("----- 10.12.2022 -----");
		
		
		Jack_Person jack = new Jack_Person();
		jack.doDrinking();
		jack.doEating();
		jack.doSleeping();
		jack.showStatus(); // we mast have to completely rewrite the old functions
		
		System.out.println("----------------------");
		
		ArrayGenerator masGen = new ArrayGenerator(1000);
		
		System.out.println(masGen.getNum_elemets()); // nothing = 0
		
		masGen.setNum_elemets(999);
		System.out.println(masGen.getNum_elemets());
		System.out.println("----------------------");
		masGen.ArrayFill();
		masGen.ArrayShow();
		//int n = in.nextInt();
		System.out.println("----------------------");
		ArrayGenerator masGen2 = new ArrayGenerator(200);
		masGen2.setNum_elemets(1);
		masGen2.ArrayFill();
		masGen2.ArrayShow();
		System.out.println("----------------------");
		masGen.ArrayDelete();
		masGen2.ArrayDelete();
		masGen.ArrayShow();
		masGen2.ArrayShow();
		System.out.println("----------------------");
		System.out.println("----- 11.12.2022 -----");
		
		double d = 123.456;
		int i = (int)Math.round(d);
		System.out.println(d + " " + i);
		System.out.println("----- List mini test -----");
		
		
		//import java.util.ArrayList;
		//import java.util.List;
		List<String> list = new ArrayList<>();
		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list.get(1) + " " + list.get(2) + " " + list.get(3) + " " +list.get(4));
		String t1234 = list.get(1) + " " + list.get(2) + " " + list.get(3) + " " +list.get(4);
		System.out.println(t1234);
		list.remove(1);
		System.out.println(list.get(1));
		System.out.println("----------------------");
		ArrayToList arrtolist = new ArrayToList();
		List<Integer> masL = new ArrayList<Integer>();
		masL = arrtolist.ToList(mas);
		arrtolist.ListShow(masL);
		System.out.println("----------------------");
		System.out.println("----- Work with files -----");
		FileHandler fh = new FileHandler(File.separator + "data" + File.separator + "text.txt");
		
		fh.ShowFile();
		System.out.println("----------------------");
		File db = new File("data" + File.separator + "db_test");		
		try {
			Scanner dbs = new Scanner(db);
		} catch (FileNotFoundException e) {
			System.out.println("I do not know what the problem, but...");
			// TODO Auto-generated catch block
			
			File file1 = new File("src"+File.separator+"com"+File.separator+"nikasgig"+File.separator+"javacoretest"+ File.separator +"data" + File.separator + "db_test");	
			try {
				Scanner dbs1 = new Scanner(file1);
			} catch (FileNotFoundException e2) {
				System.out.println("error");
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}
		
		// the problem was found and fixed
		
		
		System.out.println("----- 12.12.2022 -----");
		
		Corgi doggy1 = new Corgi(1);
		Corgi doggy2 = new Corgi(1);
		Corgi doggy3 = new Corgi(2);
		System.out.println(doggy1.equalsID(doggy2)); // true
		System.out.println(doggy3.equalsID(doggy2)); // false
		System.out.println(doggy3.equalsID(doggy1)); // false
		System.out.println("----------------------");
		System.out.println("---- Write in file ----");
		FileHandler FileIn = new FileHandler("asdasda");
		FileIn.Write(var1 + var2); 
		FileIn.pw.close();
		System.out.println("----------------------");
		FileWriterObj fin = new FileWriterObj("db_obj.bin");
		fin.Add(doggy1);
		fin.Add(doggy2);
		fin.Add(doggy3);
		//fin.Close();
		
		Corgi doggy4 = fin.Get(doggy1);
		Corgi doggy5 = fin.Get(doggy2);
		Corgi doggy6 = fin.Get(doggy3);
		
		System.out.println(doggy4.equalsID(doggy5)); // true
		System.out.println(doggy6.equalsID(doggy5)); // false
		System.out.println(doggy6.equalsID(doggy4)); // false
		doggy2.doHunting();
		doggy5.doHunting();
		System.out.println(doggy2.id + " " + doggy5.id); 
		System.out.println(doggy2.id + doggy5.id); 
		System.out.println("----------------------");
		System.out.println(AnimalList.DOG);
		AnimalList dog = AnimalList.DOG;
		System.out.println(dog);
		System.out.println(dog.getInfo());
		
		System.out.println(AnimalList.FISH.toString());
		System.out.println(AnimalList.FISH.getInfo());
		
		System.out.println(dog);
		dog.setInfo("Dog? It is maybe corgi");
		System.out.println(dog.getInfo());
		AnimalList dog2 = AnimalList.valueOf("DOG");
		System.out.println(dog2.getInfo());
		try {
			AnimalList dog3 = AnimalList.valueOf("dog");
			System.out.println(dog3.getInfo());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erorr, not found");
		}
		System.out.println(dog2.ordinal());
		System.out.println("----------------------");
		RecursionDemo RD = new RecursionDemo();
		RD.DoRecursionDemo();
		System.out.println("hihihi");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println();
		MainCollection collection = new MainCollection();
		collection.main();
		
		/*
		System.out.println("----------------------");
		MainApp mainapp = new MainApp();
		mainapp.mainMethod();
		MainApp mainapp1 = new MainApp();
		mainapp1.mainMethod();
		*/
		
		System.out.println("----------------------");
		Nested nested = new Nested();
		nested.main();
		
		
		// Lambda
		
		System.out.println("----------------------");
		LyambdaMain lm = new LyambdaMain();
		lm.main();
		
		
		// Garbage Collector
		
		System.out.println("----------------------");
		GCMain gcm = new GCMain();
		gcm.main();
		
		
		// test task1 my version
		
		TestTaskMain ttm = new TestTaskMain();
		ttm.task1();
		
		
		// test task1 result version
		
		ttm.task1v();
		
		
		// check of polimorfism
		
		System.out.println("----------------------");
		Animal dog3 = new Animal();
		Dog dog4 = new Dog();
		Animal dog5 = new Dog();
		System.out.println(dog5.equals(dog4));
		System.out.println("----------------------");
		
		
		// Streams
		
		//System.out.println("----------------------");
		//StreamsMain sm = new StreamsMain();
		//sm.main();
		
		
		
		
	}


}
