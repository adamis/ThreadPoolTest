package br.com.adamis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import br.com.adamis.threads.Thread1;

public class Main {


	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		int cont = 0;

		for (int i = 0; i < 3; i++) {			
			executor.submit(new Thread1(cont));
			cont++;
		}

		executor.shutdown();

		try {
			System.err.println("Call 1");	
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.err.println("FIM DA Main.java");

	}

}
