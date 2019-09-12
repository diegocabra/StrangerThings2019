package Principal;
import javax.swing.JPanel;

public class Mapa {
	private  Elemento matriz [][];
	private int fila;
	private int columna; 
		
	
	public Mapa(int f, int c) {
		fila =f;
		columna=c;
		matriz= new Elemento[f][c];
		for (int i=0; i<f;i++)
			for (int j=0; j<c;j++)
				matriz[i][j].setElemento(null);
				
		}

	public boolean celdaLibre(int f, int c) {
		boolean toReturn=false;
		if (matriz[f][c]==null)
			toReturn=true;
		return toReturn;
	}
	
	
	
	
}
