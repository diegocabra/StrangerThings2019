package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Botonera.BotonMonje_1.OyenteBotonmonje1;
import Objetos.Contenido;
import Objetos.Muro;
import Personajes.Monje_1;
import Principal.Market;

public class BotonMuro extends Boton {
	protected Market market;
	
	public BotonMuro() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonMuro());
		this.setBounds(335,25,60,50);
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/pared.png"));
		this.setIcon(iconobtn);
	
	}
	
	public Contenido generateEntidad() {
		return new Muro();
		}

	class OyenteBotonMuro implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Contenido p =generateEntidad();
			market.setFabricado(new Muro());
		}
	}
}