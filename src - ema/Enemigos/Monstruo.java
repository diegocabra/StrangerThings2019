package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;

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
	}
	
	
	

}
