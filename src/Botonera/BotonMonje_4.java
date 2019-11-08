package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Objetos.Contenido;
import Personajes.*;
import Principal.Market;

public class BotonMonje_4 extends Boton {


	protected Market market;
	
	public BotonMonje_4() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje4());
		this.setBounds(205, 20, 60, 50);
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/Face_4_open.png"));
		this.setIcon(iconobtn);
	}
	
	public Contenido generateEntidad() {
		return new Monje_4();
		}

	class OyenteBotonmonje4 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Contenido p =generateEntidad();
		market.setFabricado(new Monje_4());
		}
	}
}
