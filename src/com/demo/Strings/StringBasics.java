package com.demo.Strings;

public class StringBasics {
	
	public static void main(String[] args) {
		
		
		//String is nothing but sequence of characters or array of characters
		
		char[] charData = {'c','h','a','n','d','u'};
		
		String name = new String(charData);
		System.out.println(name);
		
		// String is immutable object(once its created you cannot change the state of the object)
		
		String firstName = "Chandu";
		
		firstName = firstName+" Ujjina";
		
		String userName = "Chandu";
	}
	

	
	
}
