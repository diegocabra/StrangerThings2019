package PowerUps;

import javax.swing.ImageIcon;

import Personajes.Personaje;
import Principal.Celda;

public class PWProteccion extends PowerUp {
	
	public PWProteccion(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/PWRojo.gif")));		
	}
	
	public void getPowerUp(Personaje p) {
		int vidaAnterior = p.getVida();
		p.setVida(Integer.MAX_VALUE);
		TiempoProteccion tiempo = new TiempoProteccion(p,vidaAnterior);
		tiempo.start();
	}

}
