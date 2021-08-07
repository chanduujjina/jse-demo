package com.demo.compileTimeexception;

public class ClassNotFoundExceptionDemo {

	public Object getObject(String className) {
		
		//by using reflection api to load the class runtime
		Object obj = null;
		try {
			// to load the class runtime
		Class cls=	Class.forName(className);
		
		//to create object using default constructor for the loaded class
		
		try {
			obj = cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return obj;
	}

}
