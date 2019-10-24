package PowerUps;

import Personajes.Personaje;

public class TiempoProteccion extends Thread {
	protected volatile boolean execute;
	protected Personaje personaje;
	protected int vida;
	
	public TiempoProteccion(Personaje p,int v)
	{
		personaje=p;
		vida = v;
	}
	
	public void terminate()
	{
		execute = false;
	}
	
	public void run()
	{
		this.execute = true;
		
		while(execute)
		{
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(personaje!=null)
			{
				personaje.setVida(vida);
			}

		}
	}
}
