package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Graficos.ElevenGrafico;
import Principal.Celda;

public class Eleven extends Personaje {
	
	protected GenerarBolaDeFuego generarBolas;
	public Eleven(Celda c) {
		super(c);
		vida = 1000;
		costo = 100;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/S1.gif")));
		generarBolas = new GenerarBolaDeFuego(this);
		generarBolas.start();
		
	}
	
	public void destruir() {
	}
	
	public void atacar() {
		//cambiar Sprite (ATACANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/S1.gif")));
	}
	
	public void esperar() {
		//cambiar Sprite (ESPERANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/S1.gif")));

	}
	
}
