package com.demo.collection.list;

import java.util.Comparator;

import com.demo.collection.list.pojo.Employee;

public class EmpIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getId()-emp2.getId();
	}

}
