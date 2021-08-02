package com.demo.ioStreams;

import java.io.IOException;

import org.junit.Test;

public class TestFileHandler {
	
	FileHandler_v1 handler = new FileHandler_v1();
	
	@Test
	public void testcreateFile_txt() throws IOException {
		String filePath1 = "F:/Chandu/Files/chandu.txt";
		handler.createFile(filePath1);
	}
	
	@Test
	public void testcreateFile_pdf() throws IOException {
		String filePath1 = "F:/Chandu/Files/chandu.pdf";
		handler.createFile(filePath1);
	}
	
	@Test
	public void testcreateFile_java() throws IOException {
		String filePath1 = "F:/Chandu/Files/chandu.java";
		handler.createFile(filePath1);
	}
	
	@Test
	public void testcreateFile_json() throws IOException {
		String filePath1 = "F:/Chandu/Files/chandu.json";
		handler.createFile(filePath1);
	}



}
