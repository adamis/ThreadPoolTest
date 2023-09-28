package br.com.adamis.threads;

public class Thread1 implements Runnable {

	private int cont = 0;
	
	public Thread1(Integer cont) {
		this.cont = cont;
	}
	
	public void run() {
		try {
			Long time = (long) (1000+getRandomNumber(1000, 3000));
			
			System.out.println("THREAD "+cont+" INICIADO SLEEP: "+time);
			//for (int i = 0; i < 2; i++) {
				Thread.sleep(time);	
			//}		
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		System.err.println("THREAD "+cont+" FINALIZADO");
	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
