package Personajes;

import Objetos.Elemento;
import Principal.Celda;

public abstract class Personaje extends Elemento{
	protected float fuerza;

	
	public Personaje (Celda c) {
		super(c);
	}
	
	 
	public void setFuerza (int f ) {
		fuerza = f;
	}
	
	public float getFuerza (){
		return fuerza;
	}
	
	public void setVida(int v)
	{
		vida = v;
	}
	
	
	
	

}
