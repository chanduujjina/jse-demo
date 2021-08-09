package com.demo.customException;

public class EmployeeCriteria {
	
	public void validateEmployeeInfo(Employee employee) throws ValidationException {
		
		//pattern matches
		//".*[^0-9].*"
		
		if(employee.getId()<=0) {
			throw new ValidationException("number should be postive");
		}
		
		if(employee.getName().isEmpty() || !employee.getName().matches("^[a-zA-Z]*$")) {
			throw new ValidationException("name should not be empty and should be alphabetical");
		}
		
		if(employee.getPanNumber().isEmpty() || !employee.getPanNumber().matches("^[a-zA-Z0-9]+$")) {
			throw new ValidationException("pan number should not be empty and should be alpha numeric");
		}
	}

}
