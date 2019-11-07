package Objetos;

import java.util.Iterator;

import Principal.Celda;


public class Estallar extends Thread{
	/*
}

	protected Bomba bomba;
	protected Celda celda;
	
	public Estallar(Bomba b,Celda c)
	{
		bomba=b;
		celda = c;
	}
	
	public void run()
	{
		try {
			sleep(2000);
			bomba.estallar();
			sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean parar = false;
		Celda sig;
		int cont = 0;
		Contenido aux;
		
		if(celda!=null){
			while(cont<80) {
				cont++;
				//ver
				siguiente = miCelda.getMapa().getCelda(miCelda.getFila(),miCelda.getColumna()-cont);
				if(siguiente!=null) {
					aux = siguiente.getContenido();
					if(aux !=null ) {
						aux.aceptar(miVisitor);
						//System.out.println("Encontre alguien wachin");
						encontre=true;
						entregarPW.terminate();
						this.destruir();
						//mover = false;
						
					}
				}
		}
			while(cont<160 && !parar){
				cont++;
				sig = celda.getMapa().getCelda(celda.getFila(), celda.getColumna()-cont);
				if(sig!=null){
					if(aux.getCelda().!=null)		{
						aux.destruir();
					}
				else
					parar = true;
				}
			
			parar=false;
			
		
			cont=0;
			while(cont<160 && !parar)
			{
				cont++;
				sig = celda.getMapa().getCelda(celda.getFila(), celda.getColumna()+cont);
				if(sig!=null)
				{
					Iterator<Contenido> it = sig.getContenido();
					while(it.hasNext())
					{
						aux = it.next();
						if(aux!=null)
						{
							aux.destruir();
						}
					}
				}
				else
				{
					parar=true;
				}
			}
		}
		
		bomba.destruir();
	}
	*/
	
}