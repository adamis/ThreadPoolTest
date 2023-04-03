package br.com.adamis;

import br.com.adamis.pools.ThreadPool;
import br.com.adamis.threads.Thread1;

public class Main {

	
	public static void main(String[] args) throws InterruptedException {
		
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			ThreadPool.getExecutor().execute(new Thread1(cont));
			cont++;
		}
		//Thread.sleep(15000);
		//System.err.println("TIME LIMITE PLUS");
		
		for (int i = 0; i < 5; i++) {
			ThreadPool.getExecutor().execute(new Thread1(cont));
			cont++;
		}
		
		//Thread.sleep(15000);
		//System.err.println("TIME LIMITE PLUS");
		
		ThreadPool.getExecutor().execute(new Thread1(cont));
		cont++;
		
		//Thread.sleep(15000);
		//System.err.println("TIME LIMITE PLUS");
		
		ThreadPool.getExecutor().execute(new Thread1(cont));
		cont++;
		
		ThreadPool.getExecutor().shutdown();  
        //while (!ThreadPool.checkExecutorIsTerminate()) { 
        	//Thread.sleep(1000);
        	//System.err.println("WAIT ...");
        //}
        	
    	//Thread.sleep(15000);
        System.err.println("FIM DA Main.java");
//        ThreadPool.getExecutor().execute(new Thread1(cont));
//        
//        ThreadPool.getExecutor().shutdown();
//        ThreadPool.getExecutor().shutdown();
        
        
       
	}
	
}
