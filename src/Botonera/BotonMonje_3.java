package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Objetos.Contenido;
import Personajes.*;
import Principal.Market;

public class BotonMonje_3 extends Boton {


	protected Market market;
	
	public BotonMonje_3() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje3());
		this.setBounds(220, 20, 60, 50);
		this.setText("Monje Negro");
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/Face_3_open.png"));
		this.setIcon(iconobtn);
	}
	
	public Contenido generateEntidad() {
		return new Monje_3();
		}

	class OyenteBotonmonje3 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Contenido p =generateEntidad();
		market.setFabricado(new Monje_3());
		}
	}
}

