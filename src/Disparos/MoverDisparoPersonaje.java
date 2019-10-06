package Disparos;

public class MoverDisparoPersonaje extends Thread {
	protected volatile boolean execute;
	protected DisparoPersonaje disparoPersonaje;
	
	public MoverDisparoPersonaje(DisparoPersonaje d)
	{
		disparoPersonaje = d;
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
				sleep(3*disparoPersonaje.getVelocidad());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			disparoPersonaje.mover();
		}
	}
}