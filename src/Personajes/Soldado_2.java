package Personajes;

import javax.swing.ImageIcon;

import Principal.Celda;
import Visitor.Visitor;

public class Soldado_2 extends Personaje {
	public Soldado_2(Celda c) {
		super(c);
		vida = 100;
		costo = 50;
		danio = 1;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_2_Estatico.gif")));
		
	}

	@Override
	public void atacar() {
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_2_Atacando.gif")));
		
	}

	@Override
	public void esperar() {
		// TODO Auto-generated method stub
		
	}

 
	
}