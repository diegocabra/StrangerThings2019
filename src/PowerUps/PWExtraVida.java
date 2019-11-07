package PowerUps;

import javax.swing.ImageIcon;

import Personajes.Personaje;
import Principal.Celda;

public class PWExtraVida extends PowerUp{
	public PWExtraVida(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/PWVerde.gif")));	
	}
	
	public void getPowerUp(Personaje p) {
		System.out.println("Entre a duplicar vida -----MI vida antes era:"+p.getVida());
		p.setVida(p.getVida()*2);
		System.out.println("Mi vida ahora es "+p.getVida());
	}

}
