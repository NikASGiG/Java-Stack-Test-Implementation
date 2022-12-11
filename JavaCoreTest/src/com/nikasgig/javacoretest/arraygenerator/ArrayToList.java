package com.nikasgig.javacoretest.arraygenerator;

import java.util.List;
import java.util.ArrayList;

public class ArrayToList {
	
	
	
	
	public List<Integer> ToList(int[] mas){
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < mas.length; i++) {
			list.add(mas[i]); 
		}
		
		return list;
	}
	
	public void ListShow(List<Integer> list) {
		for (Integer i : list) {
			System.out.print(i+" ");
		}System.out.println();
	}
	
	
	
	
	
	
}
