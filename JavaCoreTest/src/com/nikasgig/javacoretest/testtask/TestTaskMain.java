package com.nikasgig.javacoretest.testtask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestTaskMain {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void task1() {
	System.out.println("TestTask1");
	System.out.println("----------------------");
	System.out.println("----------------------");
	System.out.println("----------------------");
	Map<String, Integer> nonSortMap = new HashMap<String, Integer>();
	nonSortMap.put("three", 3);
	nonSortMap.put("one", 1);
	nonSortMap.put("five", 5);
	nonSortMap.put("two", 2);
	nonSortMap.put("four", 4);
	nonSortMap.put("six", 6);
	System.out.println(nonSortMap);
	LinkedHashMap<String, Integer> sortMap = new LinkedHashMap<String, Integer>();
	
	System.out.println(sortMap);
	
	/*
	int min = -111333777;
	for (Iterator iterator = ((List<Integer>) nonSortMap).iterator(); iterator.hasNext();) {
		Integer i1 = (Integer) iterator.next();
		
		if (min == -111333777) {
			min = i1;
		} else {
			sortMap.entrySet();
			if (min < i1) {} 
			else if (min > i1) {
				min = i1;
			} else if (min == i1) {
				min = i1;
			}
		}
		
	}
		*/
	//Map<String, Integer> ClonenonSortMap = new HashMap<String, Integer>(nonSortMap);
	String tempR;
	int nonSortMapSize = nonSortMap.size();
	for (int j = 0; j < nonSortMapSize; j++) {
		int min = -111333777;
		for (Map.Entry<String, Integer> map : nonSortMap.entrySet()) {
		if (min == -111333777) {
			min = map.getValue();
		} else {
			sortMap.entrySet();
			if (min < map.getValue()) {
				
			} else if (min > map.getValue()) {
				min = map.getValue();
			} else if (min == map.getValue()) {
				min = map.getValue();
			}
		}
				//System.out.println(nonSortMap);
		}
		for (Map.Entry<String, Integer> map1 : nonSortMap.entrySet()) {
			if (min == map1.getValue()) {
				sortMap.put(map1.getKey(), map1.getValue());
				tempR = map1.getKey();
				nonSortMap.remove(tempR);
				break;
				
			}
		}
		
		}
	
	
	System.out.println(sortMap);
	System.out.println("----------------------");
}
}
