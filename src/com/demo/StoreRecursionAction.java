package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class StoreRecursionAction extends RecursiveAction {
	
	private List<Integer> storeList;
	private String gtin;
	
	private static final int threshHold = 100;
	
	public StoreRecursionAction(StoreInfo storeInfo) {
		this.storeList = storeInfo.getStorenumber();
		this.gtin = storeInfo.getGtin();
	}
 
@Override
protected void compute() {
	
	if(storeList.size()>threshHold) {
		//split it
		ForkJoinTask.invokeAll(createSubTasks());
	}
	else {
		processing(this.gtin,this.storeList);
	}
	
}

private List<StoreRecursionAction> createSubTasks() {
	storeList.size();
	//find the subtask count
	
	List<StoreRecursionAction> subtasklist = new ArrayList<>();
	
	int subTaskCount = storeList.size()/threshHold;
	
	int remainingcount = storeList.size()%threshHold;
	
	
	int startindex=0;
	int endindex = threshHold;
	for(int i=1;i<=subTaskCount;i++) {
		subtasklist.add(new StoreRecursionAction(new StoreInfo(this.gtin, storeList.subList(startindex, endindex))));
		startindex= endindex;
		endindex= endindex+threshHold;
	}
	
	if(remainingcount>0) {
		subtasklist.add(new StoreRecursionAction(new StoreInfo(this.gtin, storeList.subList(subTaskCount*threshHold, storeList.size()))));
	}
	
	
	return subtasklist;
	
}

private void processing(String gstn,List<Integer> storeList) {
   
    System.out.println("list is - (" + storeList + ") - was processed by " 
    	      + Thread.currentThread().getName());
}
}
