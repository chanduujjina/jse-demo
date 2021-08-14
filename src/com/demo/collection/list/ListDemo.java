package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		//add elements to the list
		
		List list = addElements();
		System.out.println(list);
		
	}
	
	private static List addElements() {
		// create object for the ArrayList
		List list = new ArrayList();

		// add hetrogenous elements to the list

		list.add(1);

		list.add(2);

		list.add("test");
		list.add(1.f);
		list.add(1.d);
		return list;

	}
	

}
