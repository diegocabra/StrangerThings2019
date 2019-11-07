package Objetos;


import javax.swing.ImageIcon;

import Principal.Celda;

 

public class Bomba extends Objeto {

	protected Estallar estallar;
	
	public Bomba()
	{
		super();
		vida = 100;
		
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/bomba.gif")));

		/*
		vida=Integer.MAX_VALUE;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/Bomba.gif")));
		
		estallar = new Estallar(this,miCelda);
		estallar.start();
		*/
	}
	
	
	public void setCelda(Celda c) {
		miCelda=c;
		estallar.start();
	}
	/*
	
	public void estallar()
	{
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/Explosion.gif")));
	}
	*/
}