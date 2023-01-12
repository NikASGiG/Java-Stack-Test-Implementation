package com.nikasgig.javacoretest.nestedclasses;

public class LocalInner {

	public void calc(int num1, int num2) {
		
		class Mathmy{
			int n1 = num1;
			int n2 = num2;
			
			int addition() {
				return n1+n2;
			}
			int subtraction() {
				return n1-n2;
			}
			int multiplication() {
				return n1*n2;
			}
			double division() {
				return (double) n1 / (double) n2;
			}
			@Override
			public String toString() {
				return "Math [n1=" + n1 + ", n2=" + n2 + ", addition()=" + addition() + ", subtraction()="
						+ subtraction() + ", multiplication()=" + multiplication() + ", division()=" + division() + "]";
			}
			
			
		}
		
		Mathmy math = new Mathmy();
		String text = math.toString();
		System.out.println(text);
		
		
	}
	
	
}
