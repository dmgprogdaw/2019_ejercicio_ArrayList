package com.david.arrayList.print;

import java.util.Iterator;

import com.david.arrayList.beans.Persona;
import com.david.arrayList.error.FueraDeRangoException;
import com.david.arrayList.negocio.ListaPersonas.ListaPersonas;

public class ImprimirConsola {
	
	public static void imprimirListaPersonas(ListaPersonas lista) {
		
		for(int i=0;i<lista.getTamanio(); i++) {
			
			//Comprobamos que no haya errores e imprimimos la impresion
			try {
				Persona persona = lista.getPersona(i);				
				imprimirPrivado(persona);
			}
			catch(FueraDeRangoException e) {
				System.out.println("ERROR");
			}
		}
	}
	
	/**
	 * Metodo estatico que imprime con un iterador
	 * @param lista iterador de Persona
	 */
	public static void imprimirListaPersonas(Iterator<Persona> lista) {
		
		while(lista.hasNext()) {
			
			Persona persona = lista.next();
			imprimirPrivado(persona);
		}
	}
	
	public static void imprimirPrivado(Persona persona) {
		
		System.out.println("**************");
		System.out.println(persona.getNombre() + ", " + persona.getApellidos() + ", " + persona.getTelefono() + ", " + persona.getCiudad() + ", " + persona.getEdad() +
				", " + persona.getPeso());
	}
}
