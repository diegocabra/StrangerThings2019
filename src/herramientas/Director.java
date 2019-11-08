package herramientas;

import PowerUps.PWAtaque;
import PowerUps.PWBomba;
import PowerUps.PWExtraVida;
import PowerUps.PWProteccion;
import PowerUps.PowerUp;
import Principal.Celda;

public class Director {

	public PowerUp crearPowerUP(Celda c,int opcion){
		
		PowerUp toReturn = null;
		switch(opcion)
		{
		case 1:
		{
			toReturn = new PWAtaque(c);
 
			break;
		}
		case 2:
		{
			toReturn = new PWBomba(c);
			break;
		}
		case 3:
		{
			toReturn = new PWExtraVida(c);
			break;
		}
		case 4:
		{
			toReturn = new PWProteccion(c);
			break;
		}
		}
		return toReturn;
	}
}
