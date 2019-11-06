package Principal;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

import Objetos.Contenido;
import Personajes.Personaje;


import Botonera.*;

public class MapaGUI extends JFrame{

	protected int cantFilas,cantColumnas,alto,ancho,fabricado,cantidadBombas;	


	protected Juego juego;
	protected Mapa mapa;	
	protected JPanel contentPane;
	protected JPanel panelJuego,panelOpciones;
	protected JPanel panel_1;
	protected JPanel panel_2;
	protected JPanel panel_3;

	protected JLabel etiqueta,etiquetaPuntos,etiquetaMonedas,etiquetaInformacion,etiquetaMarket;
	protected Boton BotonMonje1;
	protected Boton BotonMonje2;
	protected Boton BotonMonje3;
	protected Market market;



	public MapaGUI(Juego j) {
		market = Market.getInstance();

		juego = j;
		mapa = juego.getMap();
		cantFilas = juego.getFilas();
		cantColumnas = juego.getColumnas();
		alto = cantFilas * 80;
		ancho = cantColumnas;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(ancho+6, alto+189);

		panelOpciones = new JPanel();
		inicializarPanelBotones();

		panelJuego = new JPanel();
		inicializarPanelJuego();

		//Panel con etiqueta de fondo
		JPanel panelFondo = new JPanel();
		panelFondo.setLayout(null);
		panelFondo.setBounds(0, 160, ancho, alto);
		panelFondo.setOpaque(false);

		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/piso.png")));
		fondo.setBounds(0, 0, ancho, alto);
		panelFondo.add(fondo);


		//Panel combate

		getContentPane().add(panelJuego);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().add(panelOpciones);

		getContentPane().add(panelFondo);
		this.setResizable(false);
		this.setVisible(true);

	}

	public void agregar(JLabel l) {

		panelJuego.add(l);
	}

	private void inicializarPanelBotones(){
		panelOpciones.setLayout(null);
		panelOpciones.setBorder(BorderFactory.createLineBorder(Color.black));
		panelOpciones.setBounds(0,0, ancho, 160);
		/*---------------------------------Botones Monje 1-2-3 ------------------------------------*/
		BotonMonje1 =new BotonMonje_1();
		BotonMonje2 = new BotonMonje_2();
		BotonMonje3 =new BotonMonje_3();
		panelOpciones.add(BotonMonje1);
		panelOpciones.add(BotonMonje2);
		panelOpciones.add(BotonMonje3);


		etiquetaMarket = new JLabel("MarketPlace");
		etiquetaMarket.setBounds(120, 0, 500, 25);
		etiquetaInformacion = new JLabel("");
		etiquetaInformacion.setBounds(5, 140, 500, 25);
		etiquetaMonedas = new JLabel("Monedas: "+market.getMonedas());
		etiquetaMonedas.setBounds(ancho-220,0 , 100, 20);

		panelOpciones.add(etiquetaMarket);
		panelOpciones.add(etiquetaInformacion);
		panelOpciones.add(etiquetaMonedas);

	}

	private class OyenteEliminar implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{

		}
	}


	public void incrementarBomba(){
		cantidadBombas++;
	}




	private class OyentePanelMouse implements MouseListener {		
		public void mousePressed(MouseEvent e)
		{

			int i = e.getY() / 80 ;
			int j = e.getX() ;
			Celda aux = mapa.getCelda(i, j);
			Personaje PersonajeFabricado=market.getPersonajeFabricado();
			if ((PersonajeFabricado!=null)&&(market.alcanza()))
			{
				PersonajeFabricado.setCelda(aux);
				aux.setContenido(PersonajeFabricado);
				market.decrementarMonedas(PersonajeFabricado.getCosto());
				etiquetaMonedas.setText("Monedas: "+market.getMonedas());
				juego.agregar(PersonajeFabricado);
				etiquetaInformacion.setText("");
				juego.actualizar();
				market.setFabricado(null); // reinicia atributo Personaje fabricado 
			}
			else	if ((PersonajeFabricado!=null)&&(market.alcanza()==false))
				etiquetaInformacion.setText("NO DISPONE DE DINERO SUFICIENTE");

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}



	public void actualizar() {
		for(int i = 0;i <cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				Contenido c = mapa.getCelda(i,j).getContenido();
				if(c != null) {
					etiqueta = c.getGrafico();
					if(etiqueta != null) {
						etiqueta.setBounds(j,i*80,80,80);
					}
				}
			}
		}
		/*
		etiquetaPuntos.setText("Puntos: "+juego.getPuntos());
		etiquetaMonedas.setText("Monedas: "+juego.getMonedas());
		*/
		if(cantidadBombas>0) 
			btnBombas.setEnable(true);
		else
			btnBombas.setEnable(false);

		
		
	}

	private void inicializarPanelJuego() {
		panelJuego.setLayout(null);
		panelJuego.setBackground(new Color(135,206,255));
		panelJuego.setBounds(0, 160, ancho, alto);
		panelJuego.setOpaque(false);
		panelJuego.addMouseListener(new OyentePanelMouse());

		for(int i = 0;i<cantFilas;i++) {
			for(int j=0; j<cantColumnas;j++) {
				Contenido c = mapa.getCelda(i,j).getContenido();
				if(c != null) {
					etiqueta = c.getGrafico();
					if(etiqueta != null) {
						etiqueta.setBounds(j,i*80,80,80);
						panelJuego.add(etiqueta);
					}
				}
			}
		}
	}

	public boolean terminar(boolean gano)
	{
		
		boolean respuesta=false;
		
		if(gano)
		{
			int seleccion = JOptionPane.showOptionDialog( null,"¡GANASTE! :D",
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
					  new Object[] { "Siguiente Nivel", "Cerrar"},"Siguiente Nivel");
					      
			if(seleccion==0) respuesta = true;
			else respuesta = false;
		}
		else
		{
			int seleccion = JOptionPane.showOptionDialog( null,"¡PERDISTE! :(",
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
					  new Object[] { "Jugar de Nuevo", "Cerrar"},"Jugar de Nuevo");
					      
			if(seleccion==0) respuesta = true;
			else respuesta = false;
		}
		
		this.dispose();
		return respuesta;
	}
	
	public void activarPowerUp() {
		
	}


}
