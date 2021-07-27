package com.demo.loop;

public class LoopDemo {

	public static void main(String[] args) {
		
		
		//print 1 to 10
		//1,2,3,4,5,6,8,9,10
		
		//1,2,3,4,8,9,10
		//continue
		for(int i=1;i<=10;i++) {
			
			if(i==5||i==6||i==7) {
				continue;
			}
			//System.out.println(i);
		}
		
		//1,2,3,4,5,6...100
		
		
     for(int i=1;i<=100;i++) {
			
			System.out.println(i);
			if(i==6) {
				break;
			}
		}
		
		
		

	}

}
