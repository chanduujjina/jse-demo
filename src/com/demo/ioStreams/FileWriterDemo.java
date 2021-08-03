package com.demo.ioStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException  {
	
		String filePath = "F:/Chandu/Sample.txt";
		
		//create a file
		File file = new File(filePath);
		
		//create FileWriter object
		FileWriter fileWriter = null;
		
		try {
			 fileWriter = new FileWriter(file);
			
			//write data into file
			
			
			String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
					+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
					+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book."
					+ " It has survived not only five centuries, but also the leap into electronic typesetting, "
					+ "remaining essentially unchanged. It was popularised in the 1960s with the release"
					+ " of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing "
					+ "software like Aldus PageMaker including versions of Lorem Ipsum";
					
			fileWriter.write(text);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fileWriter.close();
		}

	}

}
