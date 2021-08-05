package com.demo.loop;

public class SortArray {
	
	public static void main(String[] args) {
		int numberList [] = new int[] {5,1,8,6,7,2};
		
		int temp=0;
		
		//compare and swap
		//start the iterator from zero index
		//n=0,1,2,3
	    for(int n=0;n<numberList.length;n++) {
	    	
	    	//start the iterator from next index
	    	for(int m =n+1;m<numberList.length;m++) {
	    		
	    		//check whether previous index is greater than next index if true just swap
	    		if(numberList[n]<numberList[m]) {
	    			
	    			//swap technique
	    			 temp = numberList[n];
	    			 numberList[n] = numberList[m];
	    			 numberList[m]= temp;
	    		}
	    		
	    		
	    	}
	    }
		
	    //iterate the elements from array to print the result
	    
	    for(int i=0;i<numberList.length;i++) {
	    	System.out.print(" "+numberList[i]);
	    }
	    
	    
	    
		
	}
	
	


}
