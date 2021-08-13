package com.demo.logical;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		String sentance = "test 123 test1 234 test3 129";
		
		//step 1
		
		//split the string with space
		String values[] =sentance.split(" ");
		
		//step 2
		//iterate with for loop
		List<Integer> numberlist = new ArrayList();
		List<String> Stringlist = new ArrayList();
		
		for(String value : values) {
			
			//step 3
			try {
			int number =Integer.parseInt(value);
			numberlist.add(number);
		   }
			catch(NumberFormatException ex) {
				Stringlist.add(value);
			}
			
		}
		System.out.println(numberlist);
		System.out.println(Stringlist);
	}
	

}
