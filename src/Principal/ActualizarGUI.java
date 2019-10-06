package Principal;


public class ActualizarGUI extends Thread{

	protected volatile boolean execute;
	protected MapaGUI gui;
	
	public ActualizarGUI(MapaGUI g)
	{
		gui = g;
	}
	
	public void terminate()
	{
		execute = false;
	}
	
	public void run()
	{
		execute = true;
		
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(execute)
		{
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gui.actualizar();
			gui.repaint();
		}
	}
}
