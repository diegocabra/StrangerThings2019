package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Principal.Celda;

public class Monje_5 extends Personaje {
	protected GenerarBolaDeFuego generarBolas;
	public Monje_5() {
		super();
		vida = 100;
		costo = 1500;
		danio = 25;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_5_esperando.gif")));
	//	generarBolas = new GenerarBolaDeFuego(this);
		//generarBolas.start();
		}
	
	public void setCelda(Celda c) {
		miCelda=c;
		atacar();
	}
		@Override
		public void atacar() {
			grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_5_atacando.gif")));
			
		}

		@Override
		public void esperar() {
			// TODO Auto-generated method stub
			
		}
}