package PowerUps;

import javax.swing.ImageIcon;

import Personajes.Personaje;
import Principal.Celda;

public class PWExtraVida extends PowerUp{
	public PWExtraVida(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/corazon.png")));	
	}
	
	public void getPowerUp(Personaje p) {
		p.setVida(p.getVida()*2);
	}

}
