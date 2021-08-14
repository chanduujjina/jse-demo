package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		String nameArray[] = { "chandu", "sai", "chandu","test", "gouse", "divya" };

		// add distinct elements to the list

		// create a list
		List<String> nameList = new ArrayList();

		// iterate the array using for loop

		for (String name : nameArray) {
			if (!nameList.contains(name)) {
				nameList.add(name);
			}
		}

		System.out.println(nameList);
		
		//insert the element at particular index
		
		nameList.add(2, "siva");
		
		nameList.remove("test");
		
		System.out.println(nameList);
		
		nameList.clear();
		System.out.println("list after clear::"+nameList);
		
		

	}

}
