package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.collection.list.pojo.Employee;

public class EmployeeService {

	public static void main(String[] args) {
		
		List<Employee> employeeList = getEmployeeList();
		
		//sort by id(ascending/descending order)
		Collections.sort(employeeList,new EmpIdComparator());
		
		System.out.println("sort by id: "+employeeList);
		
		//sort by name(ascending/descending order)
		Collections.sort(employeeList,new EmpNameComparator());
		
		System.out.println("sort by name: "+employeeList);
		

	}

	private static List<Employee> getEmployeeList() {
		
		List<Employee> employeeList = new ArrayList();
		
		employeeList.add(new Employee(1,"Akash","male",50000));
		employeeList.add(new Employee(3,"Vasu","male",40000));
		employeeList.add(new Employee(2,"Aravindh","male",60000));
		employeeList.add(new Employee(4,"Srinivas","male",90000));
		employeeList.add(new Employee(6,"Srinivas","male",90000));
		employeeList.add(new Employee(5,"Sravani","female",70000));
		employeeList.add(new Employee(8,"Vasavi","female",80000));
		
		
		//sort by name
		//sort by gender
		//sort by salary
		return employeeList;
	}

}
