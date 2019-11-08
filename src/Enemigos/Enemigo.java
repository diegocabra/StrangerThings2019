package Enemigos;
 

import java.util.Random;
import Principal.Market;
import Objetos.Contenido;
import PowerUps.PowerUp;
import Principal.Celda;
import Principal.Juego;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;
import herramientas.Director;
 

public abstract class Enemigo  extends Contenido{
	protected MoverEnemigo moverme;
	protected int danioAtaque,monedas,velocidad,puntos,posicion;
	protected boolean caminando,bonus;
	protected Visitor miVisitor;
	protected Director director;
	protected Market market;
	
	public Enemigo(Celda c, boolean b) {
		super(c);
		market=Market.getInstance();
		caminando = true;
		danioAtaque = 0;
		puntos = 0;
		miVisitor = new VisitorEnemigo(this);
		bonus = b;
		if(bonus) 
			director = new Director();
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
			Juego j = miCelda.getMapa().getJuego();
			market.incrementarMonedas(monedas);
			j.incrementarPuntos(puntos);
			j.eliminarEnemigo(this);
			super.destruir();
			if(bonus) {
				Random r = new Random();
				//PowerUp nuevo = director.crearPowerUP(miCelda, (r.nextInt(4)+1));
				PowerUp nuevo = director.crearPowerUP(miCelda, 2);
				if(nuevo != null && miCelda != null) {
					miCelda.agregar(nuevo);
					j.agregar(nuevo);
				}
				
			}		
		}
		
	}
	
	public void mover() {
	 
		boolean mover = true;
		Celda siguiente = miCelda.getIzquierda();
		int cont = 0;
		Contenido aux;
		
		if(siguiente == null) {
			miCelda.getMapa().getJuego().finalizarJuego(false);
		}
		else {
			while(cont<80 && mover) {
				cont++;
				//ver
				siguiente = miCelda.getMapa().getCelda(miCelda.getFila(),miCelda.getColumna()-cont);
				if(siguiente!=null) {
					aux = siguiente.getContenido();
					if(aux !=null && aux.aceptar(miVisitor)) {
						mover = false;
					}
				}
			}
			if(mover && caminando) {
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


