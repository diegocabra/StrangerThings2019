package Disparos;

import Personajes.Personaje;
import Personajes.Monje_1;
import Principal.Celda;
import Principal.Juego;
 
public class GenerarBolaDeFuego extends Thread{
	
	protected volatile boolean execute;
	
	protected Personaje el;
	protected Celda celda;
	protected Juego juego;
	
	public GenerarBolaDeFuego(Personaje e) {
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
				sleep(1300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
	
	

 
