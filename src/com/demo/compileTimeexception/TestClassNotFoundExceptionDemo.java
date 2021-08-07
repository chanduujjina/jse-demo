package com.demo.compileTimeexception;

import org.junit.Test;

public class TestClassNotFoundExceptionDemo {
	
	ClassNotFoundExceptionDemo demo = new ClassNotFoundExceptionDemo();
	
	//test case1
	
	@Test
	public void getObject_ClassNotFoundException() {
		Sample sample = (Sample)demo.getObject("Sample");
	}
	
	@Test
	public void getObject_InstantaionException() {
		Sample sample = (Sample)demo.getObject("com.demo.exception.Sample");
	}
	
	@Test
	public void getObject_illegalAccessException() {
		Sample1 sample = (Sample1)demo.getObject("com.demo.exception.Sample1");
	}
	
	
	@Test 
	public void getObject() {
		Sample2 sample = (Sample2)demo.getObject("com.demo.exception.Sample2");
		System.out.println(sample);
	}
}
