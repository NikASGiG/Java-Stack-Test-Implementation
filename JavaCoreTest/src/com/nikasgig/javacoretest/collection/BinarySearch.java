package com.nikasgig.javacoretest.collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	private ArrayList<Integer> list = new ArrayList<Integer>();
	private boolean isSort = false;
	
	public void genRandomNumToList(int count) {
		for (int i = 0; i < count; i++) {
			list.add((int) ( Math.random() * (1000-(-1000) ) + -1000));
		}
	}
	
	private boolean checkIsSort() {
		return isSort;
	}
	
	public void showList() {
		
		for (Integer integer : list) {
			System.out.print(integer + ", ");
		}
		System.out.println();
		
	}	
	public void Sort() {
		Collections.sort(list);
		isSort = true;
	}
	public void search(int ser) {
		if (!checkIsSort()) {
			System.out.println("List is not sorted");
			
		}
		else {
			int index = Collections.binarySearch(list, ser);
			if (index > 0) {
				System.out.println(ser + " is found at index " + index);
			}
			else {
				System.out.println(ser + " is not found");
			}
			
		}
		
	}
	
	
}
