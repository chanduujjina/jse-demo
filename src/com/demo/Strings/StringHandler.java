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
		
		String sentance = " with the help of SpringBoot you can achieve autoConfiguration ";
		
		//verify whether the sentance having SpringBoot
		
		boolean isExisting =sentance.contains("SpringBoot");
		System.out.println(isExisting);
		
		//to get tength of the sentance
		
		int length = sentance.length();
		
		//to remove leading and trailing spaces from String
		
		String trimSpaceString =sentance.trim();
		
		int trimStringlength = trimSpaceString.length();
		
		String empName =  "chandu";
		
		//convert the String to Uppercase
		
		String upperCaseName = empName.toUpperCase();
		
		String lowerCaseName = upperCaseName.toLowerCase();
		
		//create array of String
		
		String[] nameList = {"Sai","Divya","Gouse","Chandu"};
		
		//print employee name starts with S
		
		for(String employeeName : nameList) {
			
			//verify whteher the name of employee starts with 
			
			if(employeeName.startsWith("S")) {
				System.out.println(employeeName);
				
			}
			
			if(employeeName.endsWith("u")) {
				System.out.println(employeeName);
			}
			
		}
		
		
		
		

	}

}
