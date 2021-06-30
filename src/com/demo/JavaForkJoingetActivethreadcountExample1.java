package com.demo;

import java.util.concurrent.ForkJoinPool;

public class JavaForkJoingetActivethreadcountExample1 {
public static void main(String[] args) {
	int proc = Runtime.getRuntime().availableProcessors();
    
    System.out.println("Number of available core in the processor is: "
        + proc);
    
 // get no. of threads active
    ForkJoinPool pool = ForkJoinPool.commonPool();
    
    System.out.println("Number of active thread before invoking: "
            + pool.getActiveThreadCount());
    
    StoreRecursionAction action = new StoreRecursionAction(StoreService.getInstance());
    
    pool.invoke(action);
    
    System.out.println("Number of active thread after invoking: "
        + pool.getActiveThreadCount());
    System.out.println("Common Pool Size is: "
                       + pool.getPoolSize());
}
}
