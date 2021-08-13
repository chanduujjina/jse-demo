package com.demo.logical;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		String value =null;
		
		
        getString_v1(value);
        
        getString_v2(value);
        
        
        getString_v3(value);
        getString_v4(value)
;
	}

	private static void getString_v3(String value) {
		try {
			value = "test1 try ";
			int number = Integer.parseInt(value);
			System.exit(0);//unreachable code
			
		}
		catch(Exception ex) {
			value = " test1 catch";
			
		}
		finally {
			value = value+" test1 finally";
			
		}
		System.out.println(value);
		
	}
	
	private static void getString_v4(String value) {
		try {
			value = "123";
			int number = Integer.parseInt(value);
			System.out.println(value);
			System.exit(0);//reachable code
			
		}
		catch(Exception ex) {
			value = " test1 catch";
			
		}
		finally {
			value = value+" test1 finally";
			
		}
		System.out.println(value);
		
	}

	private static void getString_v2(String value) {
		
		try {
			value = "test1 try ";
			int number = Integer.parseInt(value);
			
			
		}
		catch(Exception ex) {
			value = " test1 catch";
			
		}
		finally {
			value = value+" test1 finally";
			
		}
		System.out.println(value);
	}

	private static void getString_v1(String value) {
		try {
			value = "test1 try ";
			
			
		}
		catch(Exception ex) {
			value = " test1 catch";
			
		}
		finally {
			value = value+" test1 finally";
			
			
		}
		
		System.out.println(value);
	}

}
