package com.demo.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileOutputStreamHandler {

	public static void main(String[] args) throws IOException {
	
		//create output Stream
		
		OutputStream outputStream = new FileOutputStream("F:/Chandu/Sample1.txt");
		
		Writer writer = new OutputStreamWriter(outputStream);
		
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book."
				+ " It has survived not only five centuries, but also the leap into electronic typesetting, "
				+ "remaining essentially unchanged. It was popularised in the 1960s with the release"
				+ " of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing "
				+ "software like Aldus PageMaker including versions of Lorem Ipsum";
		
		writer.write(text);
		
		writer.close();
		
		
		//read data from file using InputStream
		
		InputStream inputStream = new FileInputStream("F:/Chandu/Sample1.txt");
		
		Reader reader = new  InputStreamReader(inputStream);
		
		int index;
		
		while((index=reader.read())!=-1) {
			System.out.print((char)index);
		}
		
		reader.close();

	}

}
