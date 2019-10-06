package Principal;


import Objetos.Contenido;
 

public class Celda {
	
	protected Contenido elemento;
	protected int columna;
	protected int fila;
	protected Mapa mapa;

	
	public Celda(int f, int c, Mapa m) {
		mapa =m;
		fila=f;
		columna=c;
		elemento = null;	
	}
	
	
	
	public Celda getIzquierda () {
		Celda toReturn = null;
		if(columna -1 >= 0)
			toReturn = mapa.getCelda(fila,columna-1);
		return toReturn;
	}
	
	public Celda getDerecha() {
		Celda toReturn = null;
		if(columna +1 < mapa.getColumna());
			toReturn = mapa.getCelda(fila, columna +1);
		
		return toReturn;
	}
	
	public void setContenido(Contenido elem) {
		elemento= elem;
	}
	
	public Contenido getContenido() {
		return elemento;
	}
	

	public int getFila(){
		return fila;
	}
	
	public int getColumna(){
		return columna;
	}
	public void set(int x, int y) {
		fila = x;
		columna = y;
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public void agregar(Contenido c) {
		elemento = c;
	}
	

}
