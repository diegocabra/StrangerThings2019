package Enemigos;
import java.util.Iterator;

import Objetos.Contenido;
import Principal.Celda;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;
 

public abstract class Enemigo  extends Contenido{
	protected MoverEnemigo moverme;
	protected int danioAtaque,monedas,velocidad,puntos,posicion;
	protected boolean caminando;
	protected Visitor miVisitor;
	
	
	public Enemigo(Celda c, boolean b) {
		super(c);
		caminando = true;
		danioAtaque = 0;
		puntos = 0;
		posicion = 1;
		miVisitor = new VisitorEnemigo(this);
	}
		
	public int getVelocidad () {
		return velocidad;
	}
	
	public int getDanioAtaque()
	{
		return danioAtaque;
	}
	
	public void setCaminando(boolean b) {
		caminando = b;
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
		
		if(siguiente == null) {
			//Terminar juego
		}
		else {
			while(cont<80 && mover) {
				cont++;
				siguiente = miCelda.getMapa().getCelda(miCelda.getFila(),miCelda.getColumna()-cont);
				if(siguiente!=null) {
					aux = siguiente.getContenido();
					if(aux !=null && aux.aceptar(miVisitor)) {
						mover = false;
					}
				}
			}
			if(mover && caminando) {
				System.out.println("Continuo caminando");
				caminar();
				miCelda.setContenido(null);
				miCelda = miCelda.getIzquierda();
				if(miCelda != null)
					miCelda.setContenido(this);
			}
		}
	}
	
			 
	public boolean aceptar(Visitor v) {
			return v.visitarEnemigo(this);
	}
		 
	public abstract void caminar();
	public abstract void atacar();
	
}


