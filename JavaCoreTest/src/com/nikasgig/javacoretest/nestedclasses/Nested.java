package com.nikasgig.javacoretest.nestedclasses;

public class Nested {

	public void main() {
		
		System.out.println("Nested Classes");
		System.out.println("----------------------");
		System.out.println("Static Nested Class");
		StaticCar.Engine motor = new StaticCar.Engine(120);
		StaticCar car1 = new StaticCar("black", 4, 300, motor);
		System.out.println(car1);
		System.out.println("----------------------");
		System.out.println("Inner Class");
		InnerCar car2 = new InnerCar("blue", 2, 420, 300);
		System.out.println(car2);
		System.out.println("----------------------");
		System.out.println("Local Inner Class");
		LocalInner loc = new LocalInner();
		loc.calc(5, 2);
		loc.calc(230, 600);
		
		
		
		
		
		
		
		

	}

}
