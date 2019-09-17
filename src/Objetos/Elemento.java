package Objetos;


//import Graficos.ElementoGrafico;
import Principal.Celda;


public abstract class Elemento {

	protected Celda miCelda;
	protected int vida;
	
	public Elemento(Celda c){
		miCelda = c;
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
	
	
}
