package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;
import Graficos.ElevenGrafico;
import Principal.Celda;

public class Soldado_1 extends Personaje {
	
	protected GenerarBolaDeFuego generarBolas;
	public Soldado_1(Celda c) {
		super(c);
		vida = 1000;
		costo = 100;
		danio = 9;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_1.gif")));
		generarBolas = new GenerarBolaDeFuego(this);
		generarBolas.start();
		
	}
	
	public void destruir() {
	}
	
	public void atacar() {
		//cambiar Sprite (ATACANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_1.gif")));
	}
	
	public void esperar() {
		//cambiar Sprite (ESPERANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_1.gif")));

	}
	
}
