package com.demo.arrays;

public class ArrayHandler_V1 {

	public static void main(String[] args) {
		
		int numberList [] = new int[] {1,2,3,5,8,9};
		
		//create new array from numberList having the number >=5
		int count =0;
		int newNumberList [] = new int[getSize(numberList)];
		for(int i =0;i<numberList.length;i++) {
			//check the  condtions
			
			
			if(numberList[i]>=5) {
				//copy the same to new Array 
				
				newNumberList[count] = numberList[i];
				count++;
			}
		}
		
		//iterate the array for print
		
		for(int j =0;j<newNumberList.length;j++) {
			System.out.println(newNumberList[j]);
		}

	}
	
	
	
	/**
	 * @param numberList
	 * @return
	 * purpose of this method is to count the numbers which are greater than 5
	 */
	public static int getSize(int numberList []) {
		int count =0;
		for(int i =0;i<numberList.length;i++) {
			//check the  condtions
			
			
			if(numberList[i]>=5) {
				
				count++;
			}
		}
		return count;
	}

}
