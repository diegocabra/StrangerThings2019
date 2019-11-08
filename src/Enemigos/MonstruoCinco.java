 package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class MonstruoCinco  extends Enemigo{
	
	public MonstruoCinco (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 3;
		velocidad = 1;
		puntos = 300;
		monedas = 100;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/gCaminando.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
	//	grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/gCaminando.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Golem_atacando_2.gif")));
	}
	
	public void destruir() {
		super.destruir();
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien_muriendo_2.gif")));
	}

	  
	

}
