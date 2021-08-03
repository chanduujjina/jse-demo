package com.demo.ioStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerlizableDemo {

	public static void main(String[] args) throws IOException {
		
		
		//create object for Activity
		
		Activity activity = new Activity(1, "packaway", "needs to export", "chandu");
		
		//create FileOutputStream object
		
		FileOutputStream fileOutputStream = new FileOutputStream("F:/Chandu/chandu.ser");
		
		//create ObjectOutputStream
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(activity);
		
		//close the streams
		fileOutputStream.close();
		objectOutputStream.close();
		
		
		
		
		
	}

}
