package Disparos;

import Personajes.Eleven;
import Principal.Celda;
import Principal.Juego;
 
public class GenerarBolaDeFuego extends Thread{
	
	protected volatile boolean execute;
	
	protected Eleven el;
	protected Celda celda;
	protected Juego juego;
	
	public GenerarBolaDeFuego(Eleven e) {
		el = e;
		celda = el.getCelda().getDerecha();
		juego = celda.getMapa().getJuego();
	}
	
	public void terminate(){
		execute = false;
	}
	
	public void run()
	{
		this.execute = true;
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(execute){
			if(celda!=null){ 
				DisparoPersonaje dp = new BolaFuego(celda);
				celda.agregar(dp);				
				juego.agregar(dp);
			}
			else{
				terminate();
			}
			
			try {
				sleep(4300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
	
	

 
