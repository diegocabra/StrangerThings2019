package PowerUps;

import javax.swing.ImageIcon;

import Objetos.Bomba;
import Personajes.Personaje;
import Principal.Celda;

public class PWBomba extends PowerUp {
	
	public PWBomba(Celda c) {
		super(c);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/bomba.gif")));
	}
	
	public void getPowerUp(Personaje p) {
		if(miCelda != null) {
			System.out.println("Capture bomba ---------");
			miCelda.getMapa().getJuego().incrementarBomba();
			//Creo bomba para probar estallar
			Bomba b = new Bomba(miCelda);
		}
	}

}
