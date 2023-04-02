package br.com.adamis.threads;

public class Thread1 implements Runnable {

	private int cont = 0;
	
	public Thread1(Integer cont) {
		this.cont = cont;
	}
	
	public void run() {
		try {
			System.out.println("THREAD "+cont+" INICIADO");
			for (int i = 0; i < 5; i++) {
				Thread.sleep(cont);	
			}			
			System.err.println("THREAD "+cont+" FINALIZADO");
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
}
