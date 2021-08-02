package com.demo.ioStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler_v1 {

	public void createFile(String filePath1) throws IOException {
		
		//F:/Chandu/Files/abc.txt
		
		String firstString = filePath1.substring(0, filePath1.indexOf("."));
		System.out.println(firstString);//F:/Chandu/Files/abc
		
		String secondString = filePath1.substring(filePath1.lastIndexOf("/"), filePath1.length());
		System.out.println(secondString);//abc.txt
		
		String finalResult = firstString+secondString;////F:/Chandu/Files/abc/abc.txt
		
		System.out.println(finalResult);
		
       //create a File Object
		File file = new File(firstString);
		file.mkdirs();
		
		File file1 = new File(finalResult);
		file1.createNewFile();
		
		//writing data into file
		FileWriter writer = new FileWriter(file1);
		
		writer.write("Hi User");
		
		writer.close();
		
		
	}
	
	

}
