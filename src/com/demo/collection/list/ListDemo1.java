package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		
		
		List<Integer> list = addElementToList();
		
		System.out.println(list);
		
		getElementsFromList(list);
		
		//remove the element from list using index or value
		
		list.remove(4);
		
		System.out.println(list);
		
		

	}

	/**
	 * @param list
	 * purpose of this method to fetch elements from list
	 */
	private static void getElementsFromList(List<Integer> list) {

		// fetch the elements from the list

		for (int number : list) {
			System.out.println(number);
		}

	}

	/**
	 * @param list
	 * purpose of this method is to create list and add elements to the list
	 */
	private static List<Integer> addElementToList() {
		List<Integer> list = new ArrayList();
		// List<type of datatype>
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
        return list;
	}

}
