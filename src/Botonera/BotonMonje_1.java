package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.*;
import Principal.Market;

public class BotonMonje_1 extends Boton {
	protected Market market;
	
	public BotonMonje_1() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonmonje1());
		this.setBounds(100, 20, 90, 90);
		//this.setText("222222221");
		JLabel botoncito= new JLabel();
		ImageIcon iconobtn = new ImageIcon("/Sprites/muro.png");
	//	botoncito.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/muro.png")));
		this.setIcon(iconobtn);
		//setIcon(new ImageIcon(this.getClass().getResource("/Sprites/Monje_1_Atacando.gif"
		//this.setRolloverIcon (new ImageIcon("/src/Sprites/Face_1.png"));
		//Boton.setPressedIcon (new ImageIcon("abre.gif"));
	}
	
	public Personaje generateEntidad() {
		return new Monje_1();
		}

	class OyenteBotonmonje1 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Personaje p =generateEntidad();
		market.setFabricado(new Monje_1());
		}
	}
}



