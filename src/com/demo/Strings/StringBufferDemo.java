package com.demo.Strings;

public class StringBufferDemo {

	public  String getDynamicQuery(Employee employee) {
		
		StringBuffer buffer = new StringBuffer("select * from employee");
		
		
		int count =0;
		if(employee==null) {
			return buffer.toString();
		}
		if(employee.getId()!=0) {
			
			buffer.append("  where id ="+employee.getId());
			count++;
		}
		
		if(employee.getName()!=null) {
			if(count==0) {
				buffer.append(" where");
			}
			else {
				buffer.append(" and");	
			}
			buffer.append("  name ="+employee.getName());
			count++;
		}
		
		if(employee.getExperince()!=0) {
			if(count==0) {
				buffer.append(" where");
			}
			else {
				buffer.append(" and");	
			}
			buffer.append(" experince ="+employee.getExperince());
			count++;
		}
		
		if(employee.getSalary()!=0) {
			if(count==0) {
				buffer.append(" where");
			}
			else {
				buffer.append(" and");	
			}
			buffer.append(" salary ="+employee.getSalary());
			count++;
		}
		
		
		return buffer.toString();

	}
	
	

}
