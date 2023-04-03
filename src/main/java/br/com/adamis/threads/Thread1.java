package br.com.adamis.threads;

public class Thread1 implements Runnable {

	private int cont = 0;
	
	public Thread1(Integer cont) {
		this.cont = cont;
	}
	
	public void run() {
		try {
			System.out.println("THREAD "+cont+" INICIADO SLEEP: "+(1000+getRandomNumber(1000, 5000)));
			for (int i = 0; i < 2; i++) {
				Thread.sleep(1000+getRandomNumber(1000, 10000));	
			}			
			System.err.println("THREAD "+cont+" FINALIZADO");
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
