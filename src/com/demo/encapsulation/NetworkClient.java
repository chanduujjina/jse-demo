package com.demo.encapsulation;

public class NetworkClient {

	public static void main(String[] args) {
		
		NetworkInfo info1 = new NetworkInfo(1, "ATT", "ATT providers", true);
		
		NetworkInfo info2 = new NetworkInfo(2, "Verizon", "Verizon providers", true);
		
		DataPlan verizonPlan = new DataPlan(1, "buggati", 600);
	
		Carrier carrier = new Verizon(info2,verizonPlan);
		
		System.out.println(carrier);

	}

}
