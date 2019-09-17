package Disparos;

import Objetos.Elemento;
import Principal.Celda;

public class DisparoPersonaje extends Elemento {
	protected int danioAtaque,velocidad;
	
	public DisparoPersonaje(Celda c) {
		super(c);
		danioAtaque = 0;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public int getDanioAtaque() {
		return danioAtaque;
	}

	
}
