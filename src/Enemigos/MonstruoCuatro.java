package Enemigos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class MonstruoCuatro  extends Enemigo{
	
	public MonstruoCuatro (Celda c, boolean b) {
		super(c,b);
		vida = 100;
		danioAtaque = 2;
		velocidad = 15;
		puntos = 100;
		monedas = 100;
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Golem_caminando.gif")));
		
		moverme = new MoverEnemigo(this);
		moverme.start();
	}
	
	public void caminar() {
		caminando = true;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Golem_caminando.gif")));
		
	}
	
	public void atacar() {
		caminando = false;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Golem_caminando.gif")));
	}
	
	public void destruir() {
		super.destruir();
	
	}

	  
	

}
