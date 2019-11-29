package Disparos;

import javax.swing.ImageIcon;

import Principal.Celda;
import Visitor.Visitor;

public class BolaFuego extends DisparoPersonaje{
	public BolaFuego(Celda c) {
		super(c);
		danioAtaque = 20;
		velocidad = 1;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/BolaDeFuego.gif")));
		moverme = new MoverDisparoPersonaje(this);
		moverme.start();
		
	}

	@Override
	public boolean aceptar(Visitor v) {
	 
		return false;
	}

}
