package Enemigos;
import java.util.Iterator;

import Objetos.Contenido;
import Principal.Celda;
 

public abstract class Enemigo  extends Contenido{
	protected MoverEnemigo moverme;
	protected int danioAtaque,monedas,velocidad,puntos,posicion;
	protected boolean caminando;
	
	
	public Enemigo(Celda c, boolean b) {
		super(c);
		caminando = true;
		danioAtaque = 0;
		puntos = 0;
		posicion = 1;
	}
		
	public int getVelocidad () {
		return velocidad;
	}
	
	public int getDanioAtaque()
	{
		return danioAtaque;
	}
	
	public boolean getCaminando()
	{
		return caminando;
	}
	
	public void destruir() {
		moverme.terminate();
		if(miCelda!= null) {
			//Juego j = miCelda.getMapa().getJuego();
			super.destruir();
			
		}
	}
	
	public void mover() {
		//System.out.println("entre a mover alien");
		boolean mover = true;
		Celda siguiente = miCelda.getIzquierda();
		int cont = 0;
		Contenido aux;
		
		/*
		if(siguiente == null) {
			//Terminar juego
		}
		else {
			//Tendria que moverme pixel a pixel¿
			while(cont<80 && mover) {
				//System.out.println("Entre");
				cont++;
				//siguiente = miCelda.getMapa().getCelda(miCelda.getFila(),miCelda.getColumna()-cont);
			
			
			}
			 
		*/
		 
			caminar();
			miCelda.setContenido(null);
			miCelda = miCelda.getIzquierda();
			miCelda.setContenido(this);
			 
	}
		 
	 
	
	
	
	public abstract void caminar();
	public abstract void atacar();
	
}


