package Botonera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Botonera.BotonMonje_2.OyenteBotonmonje2;
import Objetos.Bomba;
import Objetos.Contenido;
import Personajes.Monje_2;
import Principal.Market;

public class BotonBomba extends Boton {


	protected Market market;
	
	public BotonBomba() {
		market = Market.getInstance();
		this.addActionListener(new OyenteBotonBomba());
		this.setBounds(450,25, 60, 50);
		ImageIcon iconobtn = new ImageIcon(this.getClass().getResource("/Sprites/granadaBtn.png"));
		this.setIcon(iconobtn);
		//setEnabled(false);
	
	}
	
	public Contenido generateEntidad() {
		return new Bomba();
		}

	class OyenteBotonBomba implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Contenido p =generateEntidad();
			if(market.getCantidadBombas()>0) {
				setEnabled(true);
				market.setFabricado(new Bomba());
				market.decrementarBomba();
			}
			else {
			//	setEnabled(false);
			}
		}
	}
}
