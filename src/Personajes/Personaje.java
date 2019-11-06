package Personajes;

import Disparos.GenerarBolaDeFuego;
import Objetos.Contenido;
import Principal.Celda;
import Visitor.Visitor;

public abstract class Personaje extends Contenido{
	protected float danio;
	protected boolean esperando;
	protected GenerarBolaDeFuego generarBolas;
	public Personaje () {
		super();
		esperando = true;
	}
	
	 public void setCelda(Celda c) {
		 miCelda=c;
	 }
	 
	public void setDanio (float f ) {
		danio = f;
	}
	
	public float getDanioAtaque (){
		return danio;
	}
	
	public void setVida(int v)
	{
		vida = v;
	}
	
	public boolean getEsperando() {
		return esperando;
	}
	
	public int getCosto() {
		return costo;
	}
	
	public void destruir()
	{
		super.destruir();
	}
	
	 
	public boolean aceptar(Visitor v) {
		 v.visitarPersonaje(this);
		return false;
	}
	
	public abstract void atacar();
	
	public abstract void esperar();
	
	
	

}
