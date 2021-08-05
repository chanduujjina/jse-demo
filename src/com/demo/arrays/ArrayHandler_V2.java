package com.demo.arrays;

public class ArrayHandler_V2 {
	
	public static void main(String[] args) {
		Sample [] sampleList = insertDataInfo();
		printDataInfo(sampleList);
	}
	
	
	public static Sample [] insertDataInfo() {
		
		Sample [] sampleList = new Sample[3];
		
		sampleList[0]= new Sample(1, "blood", "blood test for severity", "dig1");
		sampleList[1]= new Sample(2, "Urine", "Urine test for Daibetis", "dig2");
		sampleList[2]= new Sample(3, "test", "Urine test for tes3", "dig3");
		
		return sampleList; 
	}
	
    public static void printDataInfo(Sample [] sampleList) {
		
		for(int i=0 ;i<sampleList.length;i++) {
			System.out.println(sampleList[i]);
		}
	}

}
