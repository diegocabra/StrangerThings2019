package Niveles;
import java.util.Random;

import Enemigos.Enemigo;
import Enemigos.Monstruo;
import Objetos.Agua;
import Objetos.Contenido;
import Objetos.Muro;
import Objetos.Objeto;
import Principal.Juego;
 
import herramientas.Coleccion;
import Principal.Celda;
public class Nivel1 extends Nivel{
	
	protected Coleccion<String> Oleadas;
	
	public Nivel1(Juego l) {
		juego = l;
		monedasIniciales=200;
		Oleadas = new Coleccion<String>();
		String s = "MMMMMMMMMMMM";
		Oleadas.add(s);

	}
 
	public void run () {
		try {
					
			Random r1 = new Random();
			int random1 = r1.nextInt(juego.getFilas());
			int random2 =  r1.nextInt(juego.getColumnas()-80);
			
			if(random2<100 && juego.getColumnas()>100)
				random2+=100;
			
			Objeto muro = new Muro(juego.getMap().getCelda(random1,random2));
			juego.getMap().getCelda(random1,random2).agregar(muro);
			juego.agregar(muro);
			
			
			random1 = r1.nextInt(juego.getFilas());
			random2 =  r1.nextInt(juego.getColumnas()-80);
			
			if(random2<100 && juego.getColumnas()>100)
				random2+=100;
			
			Objeto agua = new Agua(juego.getMap().getCelda(random1,random2));
			juego.getMap().getCelda(random1, random2).agregar(agua);
			juego.agregar(agua);
			
			 
			for(String s:Oleadas) {
				sleep(5000);
				for(int i = 0;i<s.length();i++) {
					random1 = r1.nextInt(juego.getFilas());
					Celda celda = juego.getMap().getCelda(random1,juego.getColumnas()-1);
					Enemigo nuevo = null;
					char Proximo = s.charAt(i);
					
					boolean powerUp = false;
					random1 = r1.nextInt(100);
					if(random1 %5 == 0)
						powerUp = true;
					
					switch (Proximo) {
	                case 'M':  nuevo = new Monstruo(celda,powerUp);
	                         break;
	                case 'O':  nuevo = new Monstruo(celda,powerUp);
	                         break;
	                case 'D':  nuevo = new Monstruo(celda,powerUp);
	                         break;
	                case 'C':  nuevo = new Monstruo(celda,powerUp);
	                		 break;
	                case 'H':  nuevo = new Monstruo(celda,powerUp);
	       		 			 break;
	            	}
					celda.agregar(nuevo);
					juego.agregar(nuevo);
					juego.agregarEnemigo(nuevo);
					sleep(8000);
					
				}
			}				 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	
	
	
	
	public Nivel siguienteNivel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nivel reiniciarNivel() {
		// TODO Auto-generated method stub
		return null;
	}

}
