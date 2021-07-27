package com.demo.object;

public class EmployeeClient {

	public static void main(String[] args) {
		
		//Sai data
		//create an object for employee data
		Employee saiData = new Employee();
		
		saiData.setId(1);
		
		saiData.setName("Sai");
		
		saiData.setSalary(1000000);
		
		saiData.setGender("male");
		
		saiData.setDeptName("it");
		
		System.out.println(saiData.getName());
		
		
		
		
      Employee saiData1 = new Employee();
		
		saiData1.setId(1);
		
		saiData1.setName("Sai");
		
		saiData1.setSalary(1000000);
		
		saiData1.setGender("male");
		
		saiData1.setDeptName("it");
		
		System.out.println(saiData1);
		
		//gouse data
		
				Employee gouseData = new Employee();
				
				gouseData.setId(2);
				
				gouseData.setName("Gouse");
				
				gouseData.setSalary(1000000);
				
				gouseData.setGender("male");
				
				gouseData.setDeptName("it");
				
				System.out.println(gouseData);
		
		if(saiData.hashCode()==gouseData.hashCode() && saiData.equals(gouseData)) {
			System.out.println("data in both objects are same");
		}
		else {
			System.out.println("data in both objects are not same");
		}
		
		
		

	}

}
