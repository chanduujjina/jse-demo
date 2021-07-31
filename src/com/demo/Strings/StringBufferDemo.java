package com.demo.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("select * from employee");
		Employee employee = getSearchCriterria();
		
		if(employee.getId()!=0) {
			buffer.append(" where id ="+employee.getId());
		}
		
		if(employee.getName()!=null) {
			buffer.append(" and name ="+employee.getName());
		}
		
		System.out.println(buffer.toString());

	}
	
	public static Employee getSearchCriterria() {
		return new Employee(1, "chandu", 0, 0);
	}

}
