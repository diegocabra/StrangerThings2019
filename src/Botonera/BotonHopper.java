package Botonera;

import Personajes.Hopper;
import Principal.Celda;

public class BotonHopper extends Boton {
	
	
	public Hopper generateEntidad(Celda c) {
		return new Hopper(c);}
	}

