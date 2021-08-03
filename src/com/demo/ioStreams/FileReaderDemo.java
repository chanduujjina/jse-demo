package com.demo.ioStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException  {
		String filePath = "F:/Chandu/Sample.txt";
		FileReader reader= null;
		try {
			//File file = new File(filePath);
			
			 reader = new FileReader("F:/Chandu/Sample.txt");
			int index;
			while((index=reader.read())!=-1) {
				System.out.print((char)index);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			reader.close();
		}

}
	
}
