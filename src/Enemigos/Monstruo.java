package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
import Visitor.Visitor;

public class Monstruo  extends Enemigo{
	
	public Monstruo (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 3;
		velocidad = 10;
		puntos = 150;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Robot_1_caminando.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Robot_1_caminando.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Robot_1_atacando.gif")));
	}
	
	public void destruir() {
		super.destruir();
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien_muriendo_2.gif")));
	}

	  
	

}
