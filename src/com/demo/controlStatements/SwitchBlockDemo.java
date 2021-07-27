package com.demo.controlStatements;

public class SwitchBlockDemo {
	
	public static void main(String[] args) {
		
		String messageType =getMessageType(1);
		System.out.println(messageType);
		
	}
	
	public static String getMessageType(int number) {
	   switch (number) {
	case 1:
		
		return "voice message";
		
	case 2:
		return "text message";
		
	case 3:
		return "phone call";
		
	case 4:
		return "email";
		
	default:
		return "there is no message communication"; 
		
	}
	}
	

}
