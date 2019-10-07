package Niveles;
import java.util.Random;

import Enemigos.Enemigo;
import Enemigos.Monstruo;
import Objetos.Muro;
import Personajes.Soldado_1;
import Principal.Juego;
import herramientas.Coleccion;
import Principal.Celda;
public class Nivel1 extends Nivel{
	
	protected Coleccion<String> Oleadas;
	
	public Nivel1(Juego l) {
		juego = l;
		monedasIniciales=200;
		Oleadas = new Coleccion<String>();
		String s = "MMMM";
		Oleadas.add(s);

	}

	//OLEADAS
	/*
	public void run () {
		
		Random r1 = new Random();
		int Rnd1 = r1.nextInt(juego.getFilas());
		try {
			for(String s:Oleadas) {
				sleep(5000);
				
				for(int i =0;i<s.length();i++) {
					Rnd1 = r1.nextInt(juego.getFilas());
					Celda celda = juego.getMap().getCelda(Rnd1, juego.getColumnas()-1);
					Enemigo monstruo = new Monstruo(celda,false);
					char Proximo = s.charAt(i);
					
					celda.agregar(monstruo);
					juego.agregar(monstruo);
					juego.agregarEnemigo(monstruo);
					sleep(8000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	*/
	public void run () {
		try {
			
			/*
			Celda celdaEleven = juego.getMap().getCelda(0, 6*80);
			Eleven el = new Eleven(celdaEleven);
			celdaEleven.agregar(el);
			juego.agregar(el);
			*/
			
			Celda celdaMuro = juego.getMap().getCelda(2,5*80);
			Muro muro = new Muro(celdaMuro);
			celdaMuro.agregar(muro);
			juego.agregar(muro);
			
			Celda celdaMuro2 = juego.getMap().getCelda(1,5*80);
			Muro muro2 = new Muro(celdaMuro2);
			celdaMuro2.agregar(muro2);
			juego.agregar(muro2);
			
			
			Random r1 = new Random();
			//int Rnd1 = r1.nextInt(juego.getFilas());
			Celda celda = juego.getMap().getCelda(3, 7*80);
			Enemigo monstruo = new Monstruo(celda,false);			
			celda.agregar(monstruo);
			juego.agregar(monstruo);
			juego.agregarEnemigo(monstruo);
			
			
			Celda celda2 = juego.getMap().getCelda(1, 8*80);
			Enemigo monstruo2 = new Monstruo(celda2,false);			
			celda2.agregar(monstruo2);
			juego.agregar(monstruo2);
			juego.agregarEnemigo(monstruo2);
			
			
			
			 
			sleep(8000);
				 
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
