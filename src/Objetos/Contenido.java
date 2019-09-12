package Objetos;

import javax.swing.JLabel;

import Graficos.ContenidoGrafico;
import Principal.Celda;


public abstract class Contenido {
	protected JLabel grafico;
	protected Celda miCelda;
	protected int vida;
	
	public Contenido(Celda c){
		miCelda = c;
		grafico = new JLabel();		 
	}
	
	 
	
	public void setCelda(Celda c) {
		miCelda = c;
	}
	
	public Celda getCelda () {
		return miCelda;
	}

	public int getVida() {
		return vida;
	}
	
	public void setVida(float f) {
		vida -=f;
	}
	
	public JLabel getGrafico() {	
		return grafico;
	}
	
	
	
	
	
	
	
}
