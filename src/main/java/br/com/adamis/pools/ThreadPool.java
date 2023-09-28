package br.com.adamis.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	private ExecutorService executor;  
	
	public ExecutorService getExecutor() {
		if(executor == null || executor.isShutdown() || executor.isTerminated()) {
			executor = Executors.newFixedThreadPool(3);//creating a pool of 5 threads			
		}
		return executor;
	}
	
	public boolean checkExecutorIsTerminate() {
		return executor.isTerminated();
	}
	
	
	
	
}
