package com.demo.object;

public class InventoryClient {

	public static void main(String[] args) {
		
		
		
		Inventory inv1 = new Inventory();
		System.out.println(inv1);
		
		//single arg constructor
		
		Inventory inv2 = new Inventory(1);
		System.out.println(inv2);
		
		//two arg constructor
		
		Inventory inv3 = new Inventory(1,"test");
		System.out.println(inv3);
		
		//3 arg constructor
		
		Inventory inv4 = new Inventory(1,"test","jewelary");
		System.out.println(inv4);
		
		
		// 4  arg constrctor
		Inventory inv5 = new Inventory(1,"test","jewelary","tote");
		
		System.out.println(inv5);
		
		  // 4  arg constrctor
		Inventory inv6 = new Inventory(1,"test","clothes","open side container");
				
			System.out.println(inv6);
		
		
	}

}
