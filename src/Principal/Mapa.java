package Principal;

import javax.swing.JPanel;

import Objetos.Contenido;


public class Mapa {
	private Celda mapa[][];
	private int columnas, filas;
	protected Contenido obs;
	protected Juego logica;
	
	
	
	public Mapa(int f,int c, Juego l) {
		this.filas = f;
		logica = l;
		this.columnas = c;
		this.mapa = new Celda[filas][columnas];
		
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				this.mapa[i][j] = new Celda( i, j,this);
			}
		}
		
	}
	
	public Juego getJuego () {
		return logica;
	}
	
	public Celda getCelda(int f, int c)
	{
		Celda toReturn = null;
		if(f>=0 && f<mapa.length)
			if(c>=0 && c<mapa[0].length)
				toReturn = mapa[f][c];
		return toReturn;
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
		mapa[x][y].setContenido(o);
	}
	
	public void insertarObjetos() {
	}
	

}
