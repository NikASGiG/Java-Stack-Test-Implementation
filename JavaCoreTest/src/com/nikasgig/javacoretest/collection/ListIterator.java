package com.nikasgig.javacoretest.collection;

import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public void main() {
		
		String str1 = "madam";
		String str2 = "aboba";
		String str3 = "hello";
		String str4 = "lol";
		
		doing(str1);
		doing(str2);
		doing(str3);
		doing(str4);
		
		
		
		
	}
	
	private void doing(String str){
		List<Character> list = new LinkedList<>();
		for (char ch : str.toCharArray()) {
			list.add(ch);
		}
		
		java.util.ListIterator<Character> iter = list.listIterator();
		java.util.ListIterator<Character> reviter = list.listIterator(list.size());
		boolean isPalindrom = false;
		while (iter.hasNext() && reviter.hasPrevious()) {

			if (iter.next() != reviter.previous()) {
				isPalindrom = false;
				break;
			}
			else  { //if(iter.next() == reviter.previous())
				isPalindrom = true;
			}
		}
		if (isPalindrom) {
			System.out.println(str + " is Palindrom");
		} else {
			System.out.println(str + " is not Palindrom");
		}
		
		
		
		
	}
	
	
	
	
}
