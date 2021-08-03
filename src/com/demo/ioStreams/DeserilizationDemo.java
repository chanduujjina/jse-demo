package com.demo.ioStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//create FileinputStream object
		
		FileInputStream fileInputStream = new FileInputStream("F:/Chandu/chandu.ser");
		
       //create ObjectInputStream
		
		ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream);
		
		Activity activity = (Activity) objectinputStream.readObject();
		
		System.out.println(activity);

		//close the Streams
		fileInputStream.close();
		objectinputStream.close();
		
		
		

	}

}


