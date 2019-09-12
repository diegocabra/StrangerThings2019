package Principal;

import Objetos.Contenido;

public class Celda {
	
	protected Contenido elemento;
	protected int fila;
	protected int columna;
	
	public Celda(int f, int c) {
		fila=f;
		columna=c;
		elemento = null;	
	}
	
	public Contenido getElemento() {
		return elemento;
	}
	
	public void setElemento(Contenido elem) {
		elemento= elem;
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
	

}
