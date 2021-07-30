package com.demo.Strings;

public class StringHandler {

	public static void main(String[] args) {
		
		//create a string in the form of literal
		//the value will store in String pool area
		String name = "test";
		
		String name2 = "test";
		
		
		//the value will store in heap area
		String name1 = new String("test");
		
		// == and equals
		
		//== will compare the data with refrence
		if(name==name2) {
			System.out.println("name==name2");
		}
		
		if(name==name1) {
			System.out.println("name==name1");
		}
		
		//equals method will compare the content irrespective of refrence or storage area
		
		if(name.equals(name2)) {
			System.out.println("name equals name2");
		}
		
		if(name.equals(name1)) {
			System.out.println("name equals name1");
		}
		
		String value = "test";
		String value1 = new String("TEST");
		
		if(value.equalsIgnoreCase(value1)) {
			System.out.println("value equls value1");
		}
		
		

	}

}
