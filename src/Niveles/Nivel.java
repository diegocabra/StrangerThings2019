package Niveles;
import Principal.Juego;

public abstract class Nivel extends Thread {

	protected Juego juego;
	protected int monedasIniciales;
	protected int monedasAux;
	
	public abstract Nivel siguienteNivel();
	public Nivel reiniciarNivel() {
		if (monedasAux>juego.getMarket().getMonedas())
			juego.getMarket().incrementarMonedas(monedasAux-juego.getMarket().getMonedas());
		else if (monedasAux<juego.getMarket().getMonedas())
			juego.getMarket().decrementarMonedas(juego.getMarket().getMonedas()-monedasAux);
		return new Nivel1(juego);
		}
	
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