package com.demo.inheritance;

import java.util.ArrayList;

public class RelationShipDemo {
public static void main(String[] args) {
		
		
		
		//create Employee list
		
		ArrayList<EmployeeInfo> employeeList = new ArrayList<>(); 
		
		//create employee data
		
		EmployeeInfo info1 = new ContractEmployee("ibm", "01jan2018-03jan-2021", 1, "gouse", "guntur", "male", 6,"Contract");
		EmployeeInfo info2 = new PermanentEmployee(true, true, 120000, 2, "Sai", "Hyderabad", "male", 2,"Pemanent");
		EmployeeInfo info3 = new PermanentEmployee(true, true, 220000, 3, "Divya", "Vijayawada", "female", 6,"Pemanent");
		
		//add employee data to list
		
		employeeList.add(info1);
		employeeList.add(info2);
		employeeList.add(info3);
		
		Ogranization org = new Ogranization("infosys", "pocharam,hydreabad", employeeList);
		
		System.out.println(org);
		
		System.out.println(org.getEmployeeInfo());
		
		
	}


}
