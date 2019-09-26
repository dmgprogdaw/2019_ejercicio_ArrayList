package com.david.arrayList.negocio.ordenador;

import java.util.Comparator;
import com.david.arrayList.beans.Persona;

public class OrdenadorPersonas implements Comparator<Persona>{
	
	/*
	 * CRITERIO DE ORDENACION
	 * 1: EDAD
	 * 2: EDAD
	 * 3: POR EDAD Y SI LA EDAD ES IGUAL POR PESO
	 * POR DEFECTO: POR PESO
	 */
	private int criterio = 2;	
	
	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub

		switch (criterio){
			case 1:
				return p1.getEdad()-p2.getEdad();
			case 2: 
				return p1.getPeso()-p2.getPeso();
			default:
				return p1.getPeso()-p2.getPeso();
		}
		
	}

	public void ordenatePeso() {
		// TODO Auto-generated method stub
		criterio = 2;
	}
	
	public void ordenateEdad() {
		// TODO Auto-generated method stub
		criterio = 1;
	}
}
