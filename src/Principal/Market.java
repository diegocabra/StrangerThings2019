package Principal;

import Personajes.Personaje;

public class Market {
	protected Personaje fabricado;
	protected int monedas;
	protected static Market m;
	public final int monedasInicio=250;
	
	public static Market getInstance() {
		if(m == null) {
			m = new Market();
		}
		return m;			
	}

	private Market() {
		monedas=monedasInicio;
		fabricado=null;
	}


	
	//descontar monedas del juego 

	public Personaje getPersonajeFabricado() {
		Personaje toReturn = null ;
		
		if (fabricado!=null)
			toReturn=fabricado;
		return toReturn;
		//si no no hace nada .
	}

	public void setFabricado(Personaje p) {
		
			fabricado=p;
	}
	public boolean alcanza() {
	boolean	toreturn=false;
		if (fabricado.getCosto()<=getMonedas())// alcanza(); habilita oro 
			toreturn=true;
		return toreturn;
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

