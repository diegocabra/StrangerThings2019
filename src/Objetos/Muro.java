package Objetos;

import javax.swing.ImageIcon;

import Principal.Celda;

public class Muro extends Objeto {
	
	public Muro (Celda c) {
		super(c);
		vida = 150;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Muro.png")));

	}
	
	public void destruir() {
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/explosion.gif")));
		super.destruir();
		
		
		
	}

}
