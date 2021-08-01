package com.demo.Strings.test;

import org.junit.Assert;
import org.junit.Test;

import com.demo.Strings.Employee;
import com.demo.Strings.StringBufferDemo;

public class StringBufferTest {
	
	
	StringBufferDemo demo = new StringBufferDemo();
	
	@Test
	public void testGetDynamicQuery_null() {
	
		String sql =demo.getDynamicQuery(null);
		System.out.println(sql);
		Assert.assertEquals("select * from employee",sql);
		
	}
	

	@Test
	public void testGetDynamicQuery() {
	
		String sql =demo.getDynamicQuery(new Employee(0, null, 0, 0));
		System.out.println(sql);
		Assert.assertEquals("select * from employee",sql);
		
	}
	
		
		@Test
		public void testGetDynamicQuery_id() {
		
			String sql =demo.getDynamicQuery(new Employee(1, null, 0, 0));
			System.out.println(sql);
			Assert.assertEquals("select * from employee  where id =1",sql);
			
		}
		
		@Test
		public void testGetDynamicQuery_name() {
		
			String sql =demo.getDynamicQuery(new Employee(0, "chandu", 0, 0));
			System.out.println(sql);
			Assert.assertEquals("select * from employee where  name =chandu",sql);
			
		}
		
		@Test
		public void testGetDynamicQuery_idAndName() {
		
			String sql =demo.getDynamicQuery(new Employee(1, "chandu", 0, 0));
			System.out.println(sql);
			
			
		}
		
		@Test
		public void testGetDynamicQuery_idAndNameAndSalary() {
		
			String sql =demo.getDynamicQuery(new Employee(1, "chandu",70000 , 0));
			System.out.println(sql);
			
			
		}
	

}
