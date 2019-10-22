package Personajes;

import javax.swing.ImageIcon;

import Principal.Celda;

public class Monje_3 extends Personaje {
	public Monje_3() {
		super();
		vida = 100;
		costo = 50;
		danio = 2;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_3_esperando.gif")));

	}
	public void setCelda(Celda c) {
		miCelda=c;

	}


	@Override
	public void atacar() {
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_3_Atacando.gif")));

	}

	@Override
	public void esperar() {
		// TODO Auto-generated method stub

	}
}