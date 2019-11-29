package Personajes;

import javax.swing.ImageIcon;

import Disparos.GenerarBolaDeFuego;

import Principal.Celda;

public class Monje_1 extends Personaje {

	protected GenerarBolaDeFuego generarBolas;

	public Monje_1() {
		super();
		vida = 100;
		costo = 30;
		danio = 2;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_1_Atacando.gif")));

	}

	public void setCelda(Celda c) {
		miCelda=c;
		generarBolas = new GenerarBolaDeFuego(this);
		generarBolas.start();
		
		}

 

	public void atacar() {
		//cambiar Sprite (ATACANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_1_Atacando.gif")));
	}

	public void esperar() {
		//cambiar Sprite (ESPERANDO)
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_1_Atacando.gif")));

	}
	
	public void destruir() {
		super.destruir();
		generarBolas.terminate();
	}

}
