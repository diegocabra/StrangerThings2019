package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
import Visitor.Visitor;

public class Monstruo  extends Enemigo{
	
	public Monstruo (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 1;
		velocidad = 5;
		puntos = 50;
		monedas = 50;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Ogro_caminando.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Ogro_caminando.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Ogro_atacando.gif")));
	}
	
	public void destruir() {
		super.destruir();
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien_muriendo_2.gif")));
	}

	  
	

}
