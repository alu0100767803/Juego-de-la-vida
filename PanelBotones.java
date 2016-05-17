/**
 * 
 */
package es.esit.ull.PAI.Practica13;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author Jorge Alonso Hernandez
 * E-mail: alu0100767803@ull.edu.es
 * Fecha: 12/05/2016
 * Asignatura: Programación de Aplicaciones Interactivas
 * Version: 1
 * Comentario: Clase que crea el panel de botones de la aplicación
 */
public class PanelBotones extends JPanel{
	
	private final int ANCHO_ICONO = 32;
  private final int ALTO_ICONO = -1;
	
	private final String INICIO = "Inicio";
	private final String FIN = "Fin";
	private final String PAUSA = "Pausar";
	private final String REANUDAR = "Reanudar";
	private final String PASO = "Paso";
	
	private JButton inicio;
	private JButton fin;
	private JButton pausa;
	private JButton paso;
	private JButton reanudar;
	private JSlider velocidad;
	private JButton informacion;
	
	private ImageIcon icono;
	private ImageIcon iconoEscala;
	
	public PanelBotones(){
		setLayout(new GridLayout(2, 1));
		
		icono = new ImageIcon("i.PNG");
    iconoEscala = new ImageIcon(icono.getImage().getScaledInstance(getANCHO_ICONO(), getALTO_ICONO(), java.awt.Image.SCALE_DEFAULT));
		
		inicio = new JButton(getINICIO());
		fin = new JButton(getFIN());
		pausa = new JButton(getPAUSA());
		reanudar = new JButton(getREANUDAR());
		paso = new JButton(getPASO());
		velocidad = new JSlider();
		informacion = new JButton(iconoEscala);
		
		informacion.setBorder(null);
		informacion.setContentAreaFilled(false);
		
		JPanel arriba = new JPanel();
		JPanel abajo = new JPanel();
		
		arriba.add(velocidad);
		abajo.add(inicio);
		abajo.add(fin);
		abajo.add(pausa);
		abajo.add(reanudar);
		abajo.add(paso);
		abajo.add(informacion);
		
		add(arriba);
		add(abajo);
	}

	/*
	 * -------------------------------------- Getters y Setters ----------------------------------------------------------
	 */
	
	public JButton getInicio() {
		return inicio;
	}

	public void setInicio(JButton inicio) {
		this.inicio = inicio;
	}

	public JButton getFin() {
		return fin;
	}

	public void setFin(JButton fin) {
		this.fin = fin;
	}

	public JButton getPausa() {
		return pausa;
	}

	public void setPausa(JButton pausa) {
		this.pausa = pausa;
	}

	public JButton getPaso() {
		return paso;
	}

	public void setPaso(JButton paso) {
		this.paso = paso;
	}

	public String getINICIO() {
		return INICIO;
	}

	public String getFIN() {
		return FIN;
	}

	public String getPAUSA() {
		return PAUSA;
	}

	public String getPASO() {
		return PASO;
	}

	public JButton getReanudar() {
		return reanudar;
	}

	public void setReanudar(JButton reanudar) {
		this.reanudar = reanudar;
	}

	public JSlider getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(JSlider velocidad) {
		this.velocidad = velocidad;
	}

	public String getREANUDAR() {
		return REANUDAR;
	}

	public JButton getInformacion() {
		return informacion;
	}

	public void setInformacion(JButton informacion) {
		this.informacion = informacion;
	}

	public ImageIcon getIcono() {
		return icono;
	}

	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}

	public ImageIcon getIconoEscala() {
		return iconoEscala;
	}

	public void setIconoEscala(ImageIcon iconoEscala) {
		this.iconoEscala = iconoEscala;
	}

	public int getANCHO_ICONO() {
		return ANCHO_ICONO;
	}

	public int getALTO_ICONO() {
		return ALTO_ICONO;
	}
	
}
