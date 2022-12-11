package com.nikasgig.javacoretest.arraygenerator;

import java.util.Arrays;

public class ArrayGenerator {

	private int num_elemets;
	protected int[] mas;
	private int num;
	
	public ArrayGenerator() {
	}
	public ArrayGenerator(int num) {
		
		// TODO Auto-generated constructor stub
		
		this.num = num;
		ArrayCreate();
		
	}
	
	public int ArrayCreate() {
		mas = new int[num];
		return num;
	}
	
	

	public int getNum_elemets() {
		return num_elemets;
	}



	public void setNum_elemets(int num_elemets) {
		this.num_elemets = num_elemets;
	}
	
	public void ArrayFill() {       // Arrays.fill(mas, num_elemets);
		for (int i = 0; i < mas.length; i++) {
			mas[i] = num_elemets;
		}
	}
	
	public void ArrayShow() {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		} System.out.println();
	}
	
	
	public void ArrayDelete() {
		Arrays.fill(mas, 0);
	}
	
	
	
	
}
