package com.david.arrayList.negocio.ListaPersonas;

import java.util.ArrayList;
import java.util.Iterator;
import com.david.arrayList.beans.Persona;
import com.david.arrayList.error.FueraDeRangoException;
import com.david.arrayList.negocio.ordenador.OrdenadorPersonas;

public class ListaPersonas {
	
	//Usaremos un arrayList internamente para funcionar
		private ArrayList<Persona> listaInterna;

		
		public ListaPersonas() {
			
			listaInterna = new ArrayList<Persona>();
		}
		
		/**
		 * Esta operacion introduce un objeta Persona en la
		 * ListaPersonas
		 * 
		 * @param persona Persona a insertar
		 */
		public void addPersona(Persona persona) {
			
			//uso la lista y me ayudo de ella
			listaInterna.add(persona);
		}
		
		public int getTamanio() {
			
			//devuelve el tamaño de la lista
			return listaInterna.size();
		}
		
		/**
		 * Recoge la Persona indicada por el indice
		 * 
		 * @param index la posición de la Persona solicitada
		 * @return El objeto Persona en esa posicion
		 * @throws FueraDeRangoException error producido
		 */
		public Persona getPersona(int index) throws FueraDeRangoException {
			
			if((index >= 0)&&(index < listaInterna.size())) {
				return listaInterna.get(index);
			}
			
			throw new FueraDeRangoException("Te has colado en el tamaño");
		}
		
		/*
		 * Devuelve un itinerador*/
		public Iterator<Persona> getPersonas() {
			
			return listaInterna.iterator();
		}
		
		/*
		 * Ordenador de la lista que necesita un Comparator para poder ordenarse
		 * @param 
		 */
		public void ordenar(OrdenadorPersonas op) {
//			
			listaInterna.sort(op);
		}
}
