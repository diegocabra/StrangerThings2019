package Objetos;


import javax.swing.ImageIcon;

import Principal.Celda;

 

public class Bomba extends Objeto {

	protected Estallar estallar;
	
	public Bomba(Celda c)
	{
		super(c);
		
		vida=Integer.MAX_VALUE;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/bomba.gif")));
		
		estallar = new Estallar(this,miCelda);
		estallar.start();
		
	}
	
	
	public void estallar()
	{
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Explosion.gif")));
	}
}