package Objetos;

import java.util.Random;

public class TemporizadorAgua extends Thread {
	public Agua agua;
	
	public TemporizadorAgua(Agua a) {
		agua = a;
	}
	
	public void run() {
		try {
			Random r = new Random();
			
			int s = r.nextInt(20);
			s = (s+10)*1000;
			sleep(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		agua.destruir();
		this.interrupt();
		
	}
}
