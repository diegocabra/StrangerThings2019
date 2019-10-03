package Botonera;

import Personajes.Dustin;
import Principal.Celda;

public class BotonDustin extends Boton {
	
	
	public Dustin generateEntidad(Celda c) {
		return new Dustin(c);}
	}

