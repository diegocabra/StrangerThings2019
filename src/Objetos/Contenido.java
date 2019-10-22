package Objetos;

import javax.swing.JLabel;

import Principal.Celda;
import Visitor.Visitor;

public abstract class Contenido {
	protected JLabel grafico;
	protected Celda miCelda;
	protected int vida,costo;
	
	public Contenido(Celda c){
		miCelda = c;
		grafico = new JLabel();	
		vida = 0;
		costo = 0;
	}
	
	public Contenido() {
		grafico= new JLabel();
		vida=0;
		costo=0;
	}
	public void decrementarVida(float f)
	{
		vida-=f;
	}
	
	public int getCosto()
	{
		return costo;
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
	
	public void destruir()
	{
		if(grafico!=null){
			grafico.setIcon(null);
			grafico=null;
		}
		if(miCelda != null)
			miCelda.setContenido(null);
		
	}
	public abstract boolean aceptar(Visitor v);
		
}
