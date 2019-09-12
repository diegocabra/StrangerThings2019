package Principal;

import javax.swing.JPanel;

import Objetos.Contenido;

public class Mapa {
	private Celda mapa[][];
	private int columnas, filas;
	protected Contenido obs;
	
	public Mapa(int f,int c) {
		this.filas = f;
		this.columnas = c;
		this.mapa = new Celda[filas][columnas];
		
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				this.mapa[i][j] = new Celda( i, j);
				this.mapa[i][j].setElemento(null);
			}
		}
		
	}
	
	public Celda getCelda(int x, int y){
		if((x < this.filas) && (x >= 0) && (y < this.columnas) && (y >= 0)) {
			return this.mapa[x][y];
		}
		return null;
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getColumna() {
		return columnas;
	}

	public int getFila() {
		return filas;
	}
	
	public void setCeldaMapa(int x , int y , Contenido o) {
		mapa[x][y].setElemento(o);
	}
	
	public void insertarObjetos() {
	}
	

}
