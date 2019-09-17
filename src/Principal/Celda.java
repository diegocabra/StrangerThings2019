package Principal;

import Objetos.Elemento;

public class Celda {
	
	protected Elemento elemento;
	protected int fila;
	protected int columna;
	
	public Celda(int f, int c) {
		fila=f;
		columna=c;
		elemento = null;	
	}
	
	public Elemento getElemento() {
		return elemento;
	}
	
	public void setElemento(Elemento elem) {
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
