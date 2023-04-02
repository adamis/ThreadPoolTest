package br.com.adamis.threads;

public class Thread2 implements Runnable {

	public void run() {
		
		try {
			System.err.println("THREAD2 INICIADO");
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);	
			}			
			System.err.println("THREAD2 FINALIZADO");
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}

}
