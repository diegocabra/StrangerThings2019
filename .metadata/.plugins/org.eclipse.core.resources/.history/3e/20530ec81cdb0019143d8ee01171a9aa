package Principal;



import Personajes.Eleven;

public class Logica {
	
	private static int tamanioCelda = 80;
	protected static int columnas = ((700 - 80 ) / tamanioCelda)+2;
    protected static int filas = ((500 - 40) / tamanioCelda)+1;
	protected Mapa mapaCombate;
	protected int oro;
	public Logica () {
		mapaCombate = new Mapa(columnas,filas);
		oro=500;
	}
	

	public Eleven crearEleven(int x,int y) {		
		Eleven toReturn = null;
		Celda c = mapaCombate.getCelda(x, y);
		c.getElemento();
		if(c.getElemento() == null) {
			Eleven el = new Eleven(c);
			toReturn = el;
			c.setElemento(el);	
			
		}
		
		return toReturn;
	}
	
	public Mapa getMap() {
		return mapaCombate;
	}
}
