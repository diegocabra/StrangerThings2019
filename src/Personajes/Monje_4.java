package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Principal.Celda;

public class Monje_4 extends Personaje {
	protected GenerarBolaDeFuego generarBolas;
	public Monje_4() {
		super();
		vida = 100;
		costo = 1000;
		danio = 6;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_4_esperando.gif")));
		
		}

		@Override
		public void atacar() {
			grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_4_esperando.gif")));
			}

		@Override
		public void esperar() {
			// TODO Auto-generated method stub
			}
		
		public void setCelda(Celda c) {
			miCelda=c;
			generarBolas = new GenerarBolaDeFuego(this);
			generarBolas.start();
			
			}	
		 
		public void destruir() {
			super.destruir();
			generarBolas.terminate();
		}
	 
		
}