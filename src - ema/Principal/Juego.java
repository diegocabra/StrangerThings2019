package Principal;


import java.util.Random;

import javax.swing.JLabel;

import Enemigos.Enemigo;
import Enemigos.Monstruo;
import Niveles.Nivel;
import Niveles.Nivel1;
import Objetos.Contenido;
import Personajes.Eleven;
import herramientas.Coleccion;
 



public class Juego {
	
	protected Nivel nivel;
	protected int cantFilas,cantColumnas,monedas;
	protected  MapaGUI gui;
	protected Mapa mapaCombate;
	protected Coleccion<Enemigo> enemigos;
	protected ActualizarGUI actualizar;
	
	public Juego (int f, int c) {
		cantFilas = f;
		cantColumnas = c*80;
		mapaCombate = new Mapa(cantFilas,cantColumnas,this);		
		
		nivel = new Nivel1(this);
		enemigos = new Coleccion<Enemigo>();
		monedas = nivel.getMonedasIniciales();
		
		
		gui = new MapaGUI(this);
		//insertarEnemigos();
		nivel.start();
		actualizar();
		
	}
	
	//TERCER SPRINT
	public void insertarEnemigos() {
		Random r1 = new Random();
		int Rnd1 = r1.nextInt(cantFilas);
		Celda celda = mapaCombate.getCelda(Rnd1, cantColumnas-1);
		Enemigo monstruo = new Monstruo(celda,false);			
		celda.agregar(monstruo);
		agregar(monstruo);
		agregarEnemigo(monstruo);
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
	
	//////////////////////////
	public void agregarEnemigo(Enemigo e) {
		enemigos.add(e);		
	}
	
	public void agregar(Contenido c) {
		if(c.getGrafico() != null) {
			gui.agregar(c.getGrafico());
		}
	}
	
	/*Metodo Tercer Spring [Movimiento de personaje]
	 * Creo un personaje y lo muevo por el mapa
	 */
	
	public void insertarRandom() {
		Celda c = new Celda (5,5,mapaCombate);
		Monstruo m = new Monstruo(c,true);
			
	}
	
	private void actualizar()
	{
		actualizar = new ActualizarGUI(gui);
		actualizar.start();
	}
	
	public int getMonedas()
	{
		return monedas;
	}

	public void decrementarMonedas(int m)
	{
		monedas-=m;
	}
}
