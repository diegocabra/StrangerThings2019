package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class MonstruoTres  extends Enemigo{
	
	public MonstruoTres (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 6;
		velocidad = 3;
		puntos = 150;
		monedas = 100;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Orco_caminando.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
	//	grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Orco_caminando.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Orco_atacando.gif")));
	}
	
	public void destruir() {
		super.destruir();
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Alien_muriendo_2.gif")));
	}

	  
	

}
