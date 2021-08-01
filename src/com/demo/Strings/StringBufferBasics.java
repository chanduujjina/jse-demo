package com.demo.Strings;

public class StringBufferBasics {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("chandu");
		
		//crud(create,update,delete)
		
		buffer.insert(6, " Ujjina");
		
		buffer.append(" java");
		
		System.out.println(buffer.toString());
		
		buffer.delete(14, 19);
		System.out.println(buffer.toString());
		
		
		
		StringBuffer stringBuffer = new StringBuffer("test");
		
		stringBuffer.reverse();
		
		System.out.println(stringBuffer.toString());
		
	}

}
