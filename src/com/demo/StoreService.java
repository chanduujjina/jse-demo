package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StoreService {
	
	private static StoreInfo info;
	
	private StoreService() {
		
	}
	
	
	public static StoreInfo getInstance() {
		info = new StoreInfo("si2",getStoreList());
		return info;
	}
	
	private static List<Integer> getStoreList() {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=242;i++) {
			list.add(i);
		}
		
		return list;
	}
	

}
