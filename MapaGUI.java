package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Personajes.Eleven;





public class MapaGUI extends JFrame{
	
	
	protected Logica l;
	protected Mapa map;	
	protected JPanel contentPane;
	protected JPanel panelCombate;
	protected JPanel panel_1;
	protected JPanel panel_2;
	protected JPanel panel_3;
	
	
	protected Logica logica;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapaGUI frame = new MapaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public MapaGUI() {
		
		logica = new Logica(this);
		map = logica.getMap();
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 5, 1350, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Panel combate
		panelCombate = new JPanel();
		panelCombate.setBorder(null);
		panelCombate.setBounds(334, 84, 700, 500);
		contentPane.add(panelCombate);
		panelCombate.setLayout(null);
		panelCombate.setBackground(Color.yellow);
		
		/*
		panel_1.setBorder(null);
		panel_1.setBounds(10, 11, 325, 649);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2.setBorder(null);
		panel_2.setBounds(334, 584, 1000, 76);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		panel_3.setLayout(null);
		panel_3.setBorder(null);
		panel_3.setBounds(334, 84, 1000, 500);
		contentPane.add(panel_3);s
		*/
		JButton botonEleven = new JButton("Eleven");
		botonEleven.setBounds(10,0,132,76);
		contentPane.add(botonEleven);
		
		
		//ACCION BOTON ELEVEN
		ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCombate.addMouseListener(new java.awt.event.MouseAdapter() {
					boolean estadoBoton1 = true;
					public void mousePressed(MouseEvent e) {
						if (estadoBoton1) {
							int x=e.getX() ;
							int y=e.getY() ;
							/*filas / columnas -> corresponde a la posicion en la matriz */
							int filas = y / 80;
							int columnas = x /80;
							//System.out.println("Columna : "+ columnas + "  Filas: "+filas);
							estadoBoton1 = false;
							ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Sprites/eleven.png"));
							 JLabel eleven = new JLabel();
							 eleven.setIcon(imagen1);
							 panelCombate.add(eleven);
							 eleven.setBounds(x,y,100,100);
							
						    
						 
						}

					}});
			}};
			
			botonEleven.addActionListener(a1);
		
	}
	
	public void agregar(JLabel l) {
	
		panelCombate.add(l);
	}



}
