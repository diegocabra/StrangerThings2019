package PowerUps;

import javax.swing.ImageIcon;

import Personajes.Personaje;
import Principal.Celda;

public class PWAtaque extends PowerUp {
	public PWAtaque(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/PWAzul.gif")));

	}
	
	public void getPowerUp(Personaje p ) {
		p.setDanio(p.getDanioAtaque()*2);
	}

}
