package Personajes;

import Objetos.Contenido;
import Principal.Celda;
import Visitor.Visitor;

public abstract class Personaje extends Contenido{
	protected float danio;
	protected boolean esperando;
	
	public Personaje (Celda c) {
		super(c);
		esperando = true;
	}
	
	 
	public void setDanio (int f ) {
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
