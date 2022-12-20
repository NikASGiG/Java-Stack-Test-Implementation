package com.nikasgig.javacoretest.collection;

import java.util.ArrayList;

public class ParameterizedMethod {

	public static <T> T getSecond(ArrayList<T> list) {
		return list.get(1);
		
	}
	
}
