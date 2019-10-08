package Personajes;

import javax.swing.ImageIcon;

import Principal.Celda;

public class Soldado_3 extends Personaje {
	public Soldado_3(Celda c) {
		super(c);
		vida = 100;
		costo = 50;
		danio = 2;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_3_Estatico.png")));
		
		}

		@Override
		public void atacar() {
			grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Soldado_3_Atacando.gif")));
			
		}

		@Override
		public void esperar() {
			// TODO Auto-generated method stub
			
		}
}