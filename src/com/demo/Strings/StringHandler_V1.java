package com.demo.Strings;

public class StringHandler_V1 {
	
	public static void main(String[] args) {
		
		String filePath = "F/Chandu/Workspace/ProxyProject";
		
		
		int index= filePath.indexOf("/");
		System.out.println(index);
		
		//to get index of last backward slash
		
		int lastIndex= filePath.lastIndexOf("/");
		
		System.out.println(lastIndex);
		
		// just get the last word from filePath
		
		String subStringValue = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
		
		System.out.println(subStringValue);
		
		String filePath1 = "F/Chandu/Files/Test.txt";
		
		//F/Chandu/Files/Test/Test.txt
		
		String firstString = filePath1.substring(0, filePath1.indexOf("."));
		System.out.println(firstString);
		
		String secondString = filePath1.substring(filePath1.lastIndexOf("/"), filePath1.length());
		
		String finalString = firstString+secondString;
		System.out.println(finalString);
		
		
		String filePath2 = "F/Files/Chandu/Test.txt";
		
		//Chandu/Test.txt
		
		String subString = filePath2.substring(filePath2.indexOf("C"), filePath2.length());
		System.out.println(subString);
		
		
		
		
		
		
	}

}
