package com.demo.clone;

public class ShallowCloneDemo {

	public static void main(String[] args) {
	
		//create object for product
		Product product = new Product();
		
		//set the data to product
		
		product.setProductId(1);
		product.setProductName("tv");
		product.setProductType("electronic");
		//take the copy of an object to another object
		
		Product product1 = product;
		
		product1.setPrice(10000);
		
		System.out.println(product);
		
		System.out.println(product1);

	}

}
