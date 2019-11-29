package Principal;


import java.util.Random;

import javax.swing.JLabel;

import Enemigos.Enemigo;
import Enemigos.Monstruo;
import Niveles.Nivel;
import Niveles.Nivel1;
import Objetos.Contenido;
import Personajes.Monje_1;
import herramientas.Coleccion;
 



public class Juego {
	
	protected Nivel nivel;
	protected int cantFilas,cantColumnas, puntos;
	protected  MapaGUI gui;
	protected boolean terminarJuego;
	protected Mapa mapaCombate;
	protected Coleccion<Enemigo> enemigos;
	protected ActualizarGUI actualizar;
	
	
	public Juego (int f, int c) {
		cantFilas = f;
		cantColumnas = c*80;
		mapaCombate = new Mapa(cantFilas,cantColumnas,this);
		terminarJuego = false;
		
		nivel = new Nivel1(this);
		enemigos = new Coleccion<Enemigo>();
	
		
		gui = new MapaGUI(this);
		gui.getMarket().reiniciarOro();
		//insertarEnemigos();
		nivel.start();
		actualizar();
		
	}
	
	public Juego(Nivel n,int p, int f, int c) {
		terminarJuego = false;
		cantFilas = f;
		cantColumnas = c*80;
		mapaCombate = new Mapa(cantFilas,cantColumnas,this);
		
		nivel = n;
		n.setJuego(this);
		puntos = p;
		//monedas = nivel.getMonedasIniciales();
		
		enemigos = new Coleccion<Enemigo>();
		gui = new MapaGUI(this);
		nivel.start();
		actualizar();
		
		
	}
	

	public Mapa getMap() {
		return mapaCombate;
	}

	public int getFilas()
	{
		return cantFilas;
	}
	
	public int getColumnas()
	{
		return cantColumnas;
	}
	
	
	public void agregarEnemigo(Enemigo e) {
		enemigos.add(e);		
	}
	
	public void eliminarEnemigo(Enemigo e) {
		enemigos.remove(e);
		if (enemigos.isEmpty())
			finalizarJuego(true);
	}
	public void agregar(Contenido c) {
		if(c.getGrafico() != null) {
			gui.agregar(c.getGrafico());
		}
	}
	
	
	public void insertarRandom() {
		Celda c = new Celda (5,5,mapaCombate);
		Monstruo m = new Monstruo(c,true);
			
	}
	
	public void actualizar()
	{
		actualizar = new ActualizarGUI(gui);
		actualizar.start();
	}
	
	public void incrementarPuntos(int p) {
		puntos+=p;		
	}
	
	public int getPuntos() {
		return puntos;
	}

	
	public void finalizarJuego (boolean win) {
		if(!terminarJuego) {
			terminarJuego = true;
			int puntosAux = puntos;
			actualizar.terminate();
			boolean JugarDeNuevo = gui.terminar(win);
			
			if(JugarDeNuevo) {
				if(win) {
					if (nivel.siguienteNivel()==null)
						new Juego(6,10);
					else new Juego(nivel.siguienteNivel(),puntosAux,cantFilas,cantColumnas/80);
				}
				else {
					new Juego(nivel.reiniciarNivel(),0,cantFilas,cantColumnas/80);
				}
			}
		}
	}
	
	public void cambiarNivelEtiqueta(int n) {
		gui.cambiarNivel(n);
	}
	
	public void setBombas() {
		gui.setBombas();
	}
	
	public Market getMarket(){
		return gui.getMarket();
	}
}
 

