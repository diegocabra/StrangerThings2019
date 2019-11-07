package Botonera;

import javax.swing.JButton;

import Objetos.Contenido;

@SuppressWarnings("serial")
public abstract class Boton extends JButton {

	public abstract Contenido generateEntidad();
	
	
}
