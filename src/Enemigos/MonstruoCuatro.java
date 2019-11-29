package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class MonstruoCuatro  extends Enemigo{
	
	public MonstruoCuatro (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 10;
		velocidad = 3;
		puntos = 200;
		monedas = 100;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/GCaminando2.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
	//	grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/GCaminando2.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/GCaminando2.gif")));
	}
	
	public void destruir() {
		super.destruir();
	
	}

	  
	

}
