package com.demo.encapsulation;

import com.demo.encapsulation.BaseNetwork;

public class Airtel extends BaseNetwork{

	@Override
	public String getDataPlan() {
		
		return "2gb/day unlimted voice callls std and local";
	}

}
