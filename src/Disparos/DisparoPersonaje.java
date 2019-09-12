package Disparos;

import Objetos.Contenido;
import Principal.Celda;

public class DisparoPersonaje extends Contenido {
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
