package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Principal.Celda;
import Visitor.Visitor;

public class Monje_2 extends Personaje {
	public Monje_2() {
		super();
		vida = 100;
		costo = 50;
		danio = 3;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_2_esperando.gif")));

	}
	public void setCelda(Celda c) {
		miCelda=c;

	}


@Override
public void atacar() {
	grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_2_Atacando.gif")));

}

@Override
public void esperar() {
	// TODO Auto-generated method stub

}



}