package Botonera;

import javax.swing.JButton;

import Personajes.Personaje;
import Principal.Celda;

public abstract class Boton extends JButton {

	public abstract Personaje generateEntidad(Celda c);
	
	
}
