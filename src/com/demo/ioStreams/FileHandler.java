package com.demo.ioStreams;

import java.io.File;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) throws IOException {
		
		//create a directory using file 
		
		File file = new File("F:/Chandu/Test/Test1/Test2/Test3/Test4");
		
		//create a directory
		
		boolean isFolderCreated =file.mkdirs();
		
		System.out.println(isFolderCreated);
		
		//get AbsolutePath
		
		String absolutePath =file.getAbsolutePath();
		System.out.println(absolutePath);
		
		String canonicalPath =file.getCanonicalPath();
		System.out.println(canonicalPath);
		
		boolean isDirectory =file.isDirectory();
		
		System.out.println(isDirectory);
		
		//how to create file
		
		File file1 = new File("F:/Chandu/Test/abc.java") ;
		
		//write data into file
		
		
		
		
		
		
		

	}

}
