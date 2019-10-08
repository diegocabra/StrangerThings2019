package Botonera;

import javax.swing.JButton;

import Personajes.Personaje;

@SuppressWarnings("serial")
public abstract class Boton extends JButton {

	public abstract Personaje generateEntidad();
	
	
}
