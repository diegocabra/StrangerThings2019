package Personajes;

import javax.swing.ImageIcon;

import Graficos.ElevenGrafico;
import Principal.Celda;

public class Eleven extends Personaje {
	public Eleven(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Eleven.png")));
		
	}
	
}
