/**
 * 
 */
package es.esit.ull.PAI.Practica13;

/**
 * @author Jorge Alonso Hernandez
 * E-mail: alu0100767803@ull.edu.es
 * Fecha: 12/05/2016
 * Asignatura: Programación de Aplicaciones Interactivas
 * Version: 1
 * Comentario: 
 */

public class Celulas {
	private boolean[][] celulasActuales;
	private boolean[][] celulasSiguientes;
	private final int NUMERO_CELULAS = 50;
	
	public Celulas(){
		celulasActuales = new boolean[NUMERO_CELULAS][NUMERO_CELULAS];
		celulasSiguientes = new boolean[NUMERO_CELULAS][NUMERO_CELULAS];
	}
	
	public void calcularSiguiente() {
		for (int i = 0; i < getNUMERO_CELULAS() - 1; i++) {
			for (int j = 0; j < getNUMERO_CELULAS() - 1; j++) {
				setCelulasSiguientes(i, j, estado(i, j));
				
			}
		}
		actualizarActual();
	}
	
	public void actualizarActual() {
		for(int i = 0; i < getNUMERO_CELULAS(); i++){
			for(int j = 0; j < getNUMERO_CELULAS(); j++){
				setCelulasActuales(i, j, getCelulasSiguientes(i,j));
			}
		}
	}
	
	private boolean estado(int i, int j){
		int vecinos = 0;
		
		if (i > 0){
			if (getCelulasActuales(i - 1, j)) 
				vecinos++;
		}
		
		if (getCelulasActuales(i + 1, j)) 
			vecinos++;
		
		if(j > 0){
			if (getCelulasActuales(i , j - 1)) 
				vecinos++;
		}
		
		if (getCelulasActuales(i , j + 1)) 
			vecinos++;
		
		if(i > 0 && j > 0){
			if (getCelulasActuales(i - 1 , j - 1)) 
				vecinos++;
		}
		if(i > 0){
			if (getCelulasActuales(i - 1 , j + 1)) 
				vecinos++;
		}
		
		if (getCelulasActuales(i + 1 , j + 1)) 
			vecinos++;
		
		if(j > 0){
			if (getCelulasActuales(i + 1 , j - 1)) 
				vecinos++;
		}
		if(getCelulasActuales(i, j) == true){
			if (vecinos  == 2 || vecinos == 3) 
				return true;
			else
				return false;
		}	
		else{
			if(vecinos == 3)
				return true;
			else 
				return false;
		} 	
	}
	
	/*
	 * -------------------------------------- Getters y Setters ----------------------------------------------------------
	 */
	
	public void setCelulasActuales(int i, int j, boolean valor){
		celulasActuales[i][j] = valor;
	}
	
	public void setCelulasSiguientes(int i, int j, boolean valor){
		celulasSiguientes[i][j] = valor;
	}
	
	public boolean getCelulasSiguientes(int i, int j){
		return celulasSiguientes[i][j];
	}
	
	public boolean getCelulasActuales(int i, int j){
		return celulasActuales[i][j];
	}

	public boolean[][] getCelulasActuales() {
		return celulasActuales;
	}

	public void setCelulasActuales(boolean[][] celulasActuales) {
		this.celulasActuales = celulasActuales;
	}

	public boolean[][] getCelulasSiguientes() {
		return celulasSiguientes;
	}

	public void setCelulasSiguientes(boolean[][] celulasSiguientes) {
		this.celulasSiguientes = celulasSiguientes;
	}

	public int getNUMERO_CELULAS() {
		return NUMERO_CELULAS;
	}
	
}
