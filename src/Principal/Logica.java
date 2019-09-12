package Principal;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.Eleven;

public class Logica {
	
	private static int tamanioCelda = 80;
	protected static int columnas = ((700 - 80 ) / tamanioCelda)+2;
    protected static int filas = ((500 - 40) / tamanioCelda)+1;
    protected MapaGUI gui;
	protected Mapa mapaCombate;
	
	
	public Logica (MapaGUI g) {
		mapaCombate = new Mapa(columnas,filas);		
		gui = g;
	}
	

	public Eleven crearEleven(int x,int y) {		
		Eleven toReturn = null;
		Celda c = mapaCombate.getCelda(x, y);
		c.getElemento();
		if(c.getElemento() == null) {
			Eleven el = new Eleven(c);
			toReturn = el;
			c.setElemento(el);	
			gui.agregar(el.getGrafico());
			/*Falta insertar graficamete 
			JLabel l = el.getGrafico(0);
			panelMapa.add(l);
			l.repaint();
			*/
			
		}
		
		return toReturn;
	}
	
	public Mapa getMap() {
		return mapaCombate;
	}
}
