package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class MonstruoDos  extends Enemigo{
	
	public MonstruoDos (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 2;
		velocidad = 15;
		puntos = 100;
		monedas = 100;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/goblin_atacando_2.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/goblin_caminando_2.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/goblin_atacando_2.gif")));
	}
	
	public void destruir() {
		super.destruir();
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien_muriendo_2.gif")));
	}

	  
	

}
