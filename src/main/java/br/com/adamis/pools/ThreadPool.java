package br.com.adamis.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	private static ExecutorService executor;  
	
	public static ExecutorService getExecutor() {
		if(executor == null || executor.isShutdown() || executor.isTerminated()) {
			executor = Executors.newFixedThreadPool(3);//creating a pool of 5 threads			
		}
		return executor;
	}
	
	public static boolean checkExecutorIsTerminate() {
		return executor.isTerminated();
	}
	
	
	
	
}
