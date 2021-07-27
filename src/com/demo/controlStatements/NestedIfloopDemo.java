package com.demo.controlStatements;

public class NestedIfloopDemo {

	public static void main(String[] args) {
		
		String messageType =getMessageType(10);
		System.out.println(messageType);

	}
	
	public static String getMessageType(int number) {
		if(number ==1) {
			return "voice message";
		}
		else if(number ==2) {
			return "text message";
		}
		
		else if(number ==3) {
			return "phone call";
		}
		
		else if(number ==4) {
			return "email";
		}
		
		return "there is no message communication";
	}
	

}
