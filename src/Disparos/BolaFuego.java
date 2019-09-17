package Disparos;

import javax.swing.ImageIcon;

import Principal.Celda;

public class BolaFuego extends DisparoPersonaje{
	public BolaFuego(Celda c) {
		super(c);
		danioAtaque = 300;
		velocidad = 1;
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/BolaDeFuego.gif")));
		
	}

}
