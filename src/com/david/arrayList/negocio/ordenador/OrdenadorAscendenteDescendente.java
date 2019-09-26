package com.david.arrayList.negocio.ordenador;

import java.util.Comparator;

import com.david.arrayList.beans.Persona;

public class OrdenadorAscendenteDescendente implements Comparator<Persona>{
	
	
	public static final int ORDENACION_ASCENDENTE = 1;
	public static final int ORDENACION_DESCENDENTE = 2;
	/*
	 * CRITERIO DE ORDENACION
	 * 1: ASCENDENTE
	 * 2: DESCENDENTE
	 * POR DEFECTO: ASCENDENTE
	 */
	private int criterioPeso;
	private int criterioEdad;
	
	public OrdenadorAscendenteDescendente() {
		
		criterioPeso = ORDENACION_ASCENDENTE;
		criterioEdad = ORDENACION_ASCENDENTE;

	}
	
	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		if(p1.getEdad() > p2.getEdad()) {
			if(criterioEdad == ORDENACION_ASCENDENTE)
				return 1;
			else 
				return -1;
		}
		else if(p1.getEdad() < p2.getEdad()) {
			if(criterioEdad == ORDENACION_ASCENDENTE)
				return -1;
			else
				return 1;
		}
		else if(p1.getEdad() == p2.getEdad()) {
			if(p1.getPeso() > p2.getPeso()) {
				if(criterioPeso == ORDENACION_ASCENDENTE)
					return 1;
				else 
					return -1;
			}
			else if(p1.getPeso() < p2.getPeso()) {
				if(criterioPeso == ORDENACION_ASCENDENTE)
					return -1;
				else
					return 1;
			}
			else return 0;
		}
		else return 0;
	}
	
	public void setMetodoOrdenacionPeso(int metodoPeso) {
		
		criterioPeso = metodoPeso;
	}
	
	public void setMetodoOrdenacionEdad(int metodoEdad) {
		
		criterioEdad = metodoEdad;
	}

}
