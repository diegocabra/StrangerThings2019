package Niveles;
import Principal.Juego;

public abstract class Nivel extends Thread {

	protected Juego juego;
	protected int monedasIniciales;
	
	public abstract Nivel siguienteNivel();
	public abstract Nivel reiniciarNivel();
	
	public void setJuego(Juego j)
	{
		juego = j;
	}
	
	public int getMonedasIniciales()
	{
		return monedasIniciales;
	}
}
//asdasd