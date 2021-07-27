package com.demo;

public class AbstractClassDemo {

	public static void main(String[] args) {
	
		BaseNetwork airtel = new Airtel();
		
		//get configuration details of airtel
		
		String airtelConf= airtel.getConfigutarion();
		
		System.out.println(airtelConf);
		
		//get data plan of airtel
	
		System.out.println(airtel.getDataPlan());
		
		
        BaseNetwork idea = new Idea();
		
		//get configuration details of idea
		
		String ideaConf= idea.getConfigutarion();
		
		System.out.println(ideaConf);
		
		//get data plan of idea
	
		System.out.println(idea.getDataPlan());
		

	}

}
