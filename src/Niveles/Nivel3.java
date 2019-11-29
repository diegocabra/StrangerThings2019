package Niveles;

import java.util.Random;

import Enemigos.Enemigo;
import Enemigos.Monstruo;
import Enemigos.MonstruoCinco;
import Enemigos.MonstruoCuatro;
import Enemigos.MonstruoDos;
import Enemigos.MonstruoTres;
import Objetos.Agua;
import Objetos.Muro;
import Objetos.Objeto;
import Principal.Celda;
import Principal.Juego;
import herramientas.Coleccion;

public class Nivel3 extends Nivel{
	
	protected Coleccion<String> Oleadas;
	
	public Nivel3(Juego l) {
		juego = l;
		

		monedasIniciales=200;
		Oleadas = new Coleccion<String>();
		String s = "22345124";
		Oleadas.add(s);

	}
 
	public void run () {
		try {
			juego.cambiarNivelEtiqueta(3);
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
					if(random1 %2 == 0)
						powerUp = true;
					
					switch (Proximo) {
	                case '1':  nuevo = new Monstruo(celda,powerUp);
	                         break;
	                case '2':  nuevo = new MonstruoDos(celda,powerUp);
	                         break;
	                case '3':  nuevo = new MonstruoTres(celda,powerUp);
	                         break;
	                case '4':  nuevo = new MonstruoCuatro(celda,powerUp);
	                		 break;
	                case '5':  nuevo = new MonstruoCinco(celda,powerUp);
	       		 			 break;
	            	}
					celda.agregar(nuevo);
					juego.agregar(nuevo);
					juego.agregarEnemigo(nuevo);
					sleep(1000);
					
				}
			}				 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	
	
	
	
	public Nivel siguienteNivel() {
		return new Nivel3(null);
	}

	 
	public Nivel reiniciarNivel() {
		return new Nivel3(null);
	}

}
