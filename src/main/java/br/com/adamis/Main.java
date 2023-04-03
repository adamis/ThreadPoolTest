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
		
		Thread.sleep(15000);
		
		System.err.println("Adicionando Thread: "+cont);
		ThreadPool.getExecutor().execute(new Thread1(cont));
		cont++;
		
		Thread.sleep(1000);
		System.err.println("Adicionando Thread: "+cont);
		ThreadPool.getExecutor().execute(new Thread1(cont));
		cont++;
		
		ThreadPool.getExecutor().shutdown();

        System.err.println("FIM DA Main.java");

        
        
       
	}
	
}
