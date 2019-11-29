package Objetos;

import javax.swing.ImageIcon;

import Principal.Celda;

public class Muro extends Objeto {
	
	public Muro (Celda c) {
		super(c);
		vida = 900;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/pared.png")));

	}
	
	public Muro() {
		super();
		vida = 100;
		costo = 20;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/pared.png")));

	}
	
	public void destruir() {
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/explosion.gif")));
		super.destruir();
		
		
		
	}

}
