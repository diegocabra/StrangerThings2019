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
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/bomba.gif")));
	}
	
	public void getPowerUp(Personaje p) {
		if(miCelda != null) {
			System.out.println("Capture bomba ---------");
			market.incrementarBomba();
		//	miCelda.getMapa().getJuego().incrementarBomba();
			
			//Creo bomba para probar estallar
			//Bomba b = new Bomba(miCelda);
		}
	}

}
