package com.nikasgig.javacoretest;
import java.util.Scanner; // импорт класса Scanner

import com.nikasgig.javacoretest.arraygenerator.ArrayGenerator;

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
		
		
		
		
		
	}

}
