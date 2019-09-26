package Personajes;

import Objetos.Contenido;
import Principal.Celda;

public abstract class Personaje extends Contenido{
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
	
	public void destruir()
	{
		super.destruir();
	}
	
	
	
	

}
