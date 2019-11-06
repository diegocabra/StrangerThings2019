package Objetos;

import javax.swing.ImageIcon;

import Principal.Celda;
 

public class Agua extends Objeto {

	public Agua(Celda c) {
		super(c);
		vida=Integer.MAX_VALUE;
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Charco.png")));
		
		TemporizadorAgua t = new TemporizadorAgua(this);
		t.start();
	}
	

}
