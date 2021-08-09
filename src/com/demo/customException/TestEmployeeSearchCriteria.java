package com.demo.customException;

import org.junit.Test;

public class TestEmployeeSearchCriteria {
	
	EmployeeCriteria criteria = new EmployeeCriteria();
	
	@Test(expected=ValidationException.class)
	public void testValidateEmployeeInfo_invalidId() throws ValidationException {
		
		criteria.validateEmployeeInfo(new Employee(-1, "chandu", 100000, 6, "AEWPU4902R"));
	}
	
	@Test(expected=ValidationException.class)
	public void testValidateEmployeeInfo_invalidName() throws ValidationException {
		
		criteria.validateEmployeeInfo(new Employee(1, "chandu@129", 100000, 6, "AEWPU4902R"));
	}
	
	@Test(expected =ValidationException.class)
     public void testValidateEmployeeInfo_invalidPanCard() throws ValidationException {
		
		criteria.validateEmployeeInfo(new Employee(1, "chandu", 100000, 6, "@AEWPU4902R"));
	}


}
