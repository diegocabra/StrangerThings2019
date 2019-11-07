package Objetos;

import Principal.Celda;

public class Estallar extends Thread{
	protected Bomba bomba;
	protected Celda celda;
	
	public Estallar(Bomba b,Celda c)
	{
		bomba=b;
		celda = c;
	}
	
	public void run(){
		try {
			sleep(2000);
			bomba.estallar();
			sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		boolean parar = false;
		Celda siguiente;
		int cont = 0;
		Contenido aux;
		
		if(celda!=null){
			while(cont<160 && !parar) {
				cont++;
				//ver
				siguiente = celda.getMapa().getCelda(celda.getFila(),celda.getColumna()-cont);
				if(siguiente!=null) {
					aux = siguiente.getContenido();
					if(aux !=null ) {
						System.out.println("----Entre a estallar");
						aux.destruir();
						//mover = false;
						
					}
				}
				else
					parar = true;
			}
		}
		
		cont = 0;
		while(cont<160 && !parar) {
			cont++;
			//ver
			siguiente = celda.getMapa().getCelda(celda.getFila(),celda.getColumna()+cont);
			if(siguiente!=null) {
				aux = siguiente.getContenido();
				if(aux !=null ) {
					aux.destruir();
					//mover = false;
					
				}
			}
			else
				parar = true;
		}
		
		bomba.destruir();
	}	
	
}