/**
 * 
 */
package es.esit.ull.PAI.Practica13;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Jorge Alonso Hernandez
 * E-mail: alu0100767803@ull.edu.es
 * Fecha: 12/05/2016
 * Asignatura: Programación de Aplicaciones Interactivas
 * Version: 1
 * Comentario: Clase que crea el panel de botones de la aplicación
 */

public class Controlador extends JPanel{
	
	private PanelBotones panelBotones;
	private PanelCelulas panelCelulas;
	private VentanaDatos ventanaDatos;

	public Controlador(){
		setLayout(new BorderLayout());

		panelBotones = new PanelBotones();
		panelCelulas = new PanelCelulas();
		ventanaDatos = new VentanaDatos();
		
		add(BorderLayout.CENTER, panelCelulas);
		add(BorderLayout.SOUTH, panelBotones);
		
		anyadirListeners();
	}
	
	public void anyadirListeners(){
		getBotonPausa().addActionListener(new Listener());
		getBotonReanudar().addActionListener(new Listener());
		getBotonInicio().addActionListener(new Listener());
		getBotonFin().addActionListener(new Listener());
		getBotonPaso().addActionListener(new Listener());
		getBotonInformacion().addActionListener(new Listener());
	}

	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getBotonPausa()){
				getPanelCelulas().pausar();
			}
			
			else if(e.getSource() == getBotonReanudar()){
				getPanelCelulas().reanudar();
			}
			
			else if(e.getSource() == getBotonInicio()){
				getPanelCelulas().empezar();
			}
			
			else if(e.getSource() == getBotonFin()){
				
			}
			
			else if(e.getSource() == getBotonPaso()){
				getPanelCelulas().getCelulas().calcularSiguiente();
				repaint();
			}
			
			else if(e.getSource() == getBotonInformacion()){
				getVentanaDatos().setVisible(true);
			}
			
		}
		
	}



	/*
	 * -------------------------------------- Getters y Setters ----------------------------------------------------------
	 */
	
	public JButton getBotonInformacion(){
		return getPanelBotones().getInformacion();
	}
	
	public JButton getBotonFin(){
		return getPanelBotones().getFin();
	}
	
	public JButton getBotonInicio(){
		return getPanelBotones().getInicio();
	}
	
	public JButton getBotonPaso(){
		return getPanelBotones().getPaso();
	}
	
	public JButton getBotonPausa(){
		return getPanelBotones().getPausa();
	}
	
	public JButton getBotonReanudar(){
		return getPanelBotones().getReanudar();
	}
	
	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelCelulas getPanelCelulas() {
		return panelCelulas;
	}

	public void setPanelCelulas(PanelCelulas panelCelulas) {
		this.panelCelulas = panelCelulas;
	}

	public VentanaDatos getVentanaDatos() {
		return ventanaDatos;
	}

	public void setVentanaDatos(VentanaDatos ventanaDatos) {
		this.ventanaDatos = ventanaDatos;
	}

	

}
