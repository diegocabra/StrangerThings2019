package Botonera;

import Personajes.Eleven;
import Principal.Celda;

public class BotonEleven extends Boton {
	
	
	public Eleven generateEntidad(Celda c) {
		return new Eleven(c);}
	}

