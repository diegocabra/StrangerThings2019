package PowerUps;

import javax.swing.ImageIcon;

import Objetos.Bomba;
import Personajes.Personaje;
import Principal.Celda;
import Principal.Market;

public class PWBomba extends PowerUp {
	protected Market market;
	
	public PWBomba(Celda c) {
		super(c);
		 market = Market.getInstance();
		 grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/granada.png")));
	}
	
	public void getPowerUp(Personaje p) {
		if(miCelda != null) {
			market.incrementarBomba();
		}
	}

}
