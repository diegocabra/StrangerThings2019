package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Principal.Celda;

public class Soldado_5 extends Personaje {
	protected GenerarBolaDeFuego generarBolas;
	public Soldado_5(Celda c) {
		super(c);
		vida = 100;
		costo = 50;
		danio = 2;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_5_Estatico.gif")));
		generarBolas = new GenerarBolaDeFuego(this);
		generarBolas.start();
		
		}

		@Override
		public void atacar() {
			grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_5_Estatico.gif")));
			
		}

		@Override
		public void esperar() {
			// TODO Auto-generated method stub
			
		}
}