package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
import Visitor.Visitor;

public class Monstruo  extends Enemigo{
	
	public Monstruo (Celda c, boolean b) {
		super(c,b);
		vida = 1000;
		danioAtaque = 4;
		velocidad = 10;
		puntos = 150;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien-caminando-2.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien-caminando-2.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/A1.gif")));
	}
	
	public void destruir() {
		super.destruir();
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien-muriendo-1.gif")));
	}

	  
	

}
