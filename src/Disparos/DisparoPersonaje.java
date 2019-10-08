package Disparos;

import java.util.Iterator;

import Objetos.Contenido;
import Principal.Celda;
import Visitor.Visitor;
import Visitor.VisitorDisparoPersonaje;


public abstract class DisparoPersonaje extends Contenido {
	protected MoverDisparoPersonaje moverme;
	protected int danioAtaque, velocidad;
	protected Visitor miVisitor;
	
	public DisparoPersonaje(Celda c)
	{
		super(c);
		danioAtaque = 1;
		miVisitor = new VisitorDisparoPersonaje(this);
	}
	
	public int getVelocidad()
	{
		return velocidad;
	}
	
	public int getDanioAtaque()
	{
		return danioAtaque;
	}
	
	public void mover(){
		boolean mover = true;
		
		if(miCelda!=null){
			Celda siguiente = miCelda.getDerecha();
			int cont = 0;
			Contenido aux;
			if(siguiente!=null){
				while(cont<80 && mover)	{
					cont++;
					siguiente = miCelda.getMapa().getCelda(miCelda.getFila(), miCelda.getColumna()+cont);
					if(siguiente!=null){
						aux = siguiente.getContenido();
						if(aux!= null && aux.aceptar(miVisitor)) {
							mover = false;
						}
					}
				}
			}				
			if(mover){
				miCelda.setContenido(null);
				miCelda = miCelda.getDerecha();
				if(miCelda != null)					//Caso en donde llega al límite del mapa
					miCelda.agregar(this);
			}
			else{
				destruir();
			}
		}
		else{
			destruir();
		}
	}
		
	
	
	public void destruir()
	{
		moverme.terminate();
		super.destruir();
	}
	
	public boolean aceptar(Visitor v){
		return v.visitarDisparoPersonaje(this);
	}
}