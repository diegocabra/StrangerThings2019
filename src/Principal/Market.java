package Principal;

import Objetos.Contenido;
import Personajes.Personaje;

public class Market {
	protected Contenido fabricado;
	protected int monedas;
	protected static Market m;
	public final int monedasInicio=250;
	protected int cantidadBombas;
	
	public static Market getInstance() {
		if(m == null) {
			m = new Market();
		}
		return m;			
	}

	private Market() {
		monedas=monedasInicio;
		fabricado=null;
		cantidadBombas=0;
	}


	public Contenido getContenidoFabricado() {
		Contenido toReturn = null ;
		
		if (fabricado!=null)
			toReturn=fabricado;
		return toReturn;
		//si no no hace nada .
	}

	public void setFabricado(Contenido p) {
		
			fabricado=p;
	}
	
	public boolean alcanza() {
	boolean	toreturn=false;
		if (fabricado.getCosto()<=getMonedas())// alcanza(); habilita oro 
			toreturn=true;
		return toreturn;
	}

	public int getMonedas(){
		return monedas;
	}

	public void decrementarMonedas(int m){
		monedas-=m;
	}
	
	public void incrementarMonedas(int m) {
		monedas+=m;
	}

	public void incrementarBomba(){
		cantidadBombas++;
	}
	
	public void decrementarBomba() {
		cantidadBombas--;
	}
	
	public int getCantidadBombas() {
		return cantidadBombas;
	}
	
	public boolean alcanzaBomba() {
		boolean	toreturn=false;
	if (fabricado.getCosto()<=getCantidadBombas())// alcanza(); habilita oro 
		toreturn=true;
	return toreturn;
	}
	
	public void reiniciarOro() {
		monedas=monedasInicio;
	}
	
}



