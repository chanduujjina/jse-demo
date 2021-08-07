package com.demo.RuntimeException;

import org.junit.Test;

public class TestRuntimeExceptionDemo {
	
	RuntimeExceptionDemo runtimeExceptionDemo = new RuntimeExceptionDemo();
	
	@Test
	public void testCompute_ArrayIndexOutOfBoundsException() {
		
		
		runtimeExceptionDemo.compute(9, "123", 2, 1);
	}
	
	@Test
	public void testCompute_NumberFormatException() {
		
		
		runtimeExceptionDemo.compute(8, "test", 2, 1);
	}
	
	@Test
	public void testCompute_ArithmeticException() {
		
		
		runtimeExceptionDemo.compute(8, "123", 1, 0);
	}
	
	@Test
	public void testCompute() {
		
		
		runtimeExceptionDemo.compute(8, "123", 2, 1);
	}

}
