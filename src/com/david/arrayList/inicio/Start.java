package com.david.arrayList.inicio;

import com.david.arrayList.beans.Persona;
import com.david.arrayList.negocio.ListaPersonas.ListaPersonas;
import com.david.arrayList.negocio.ordenador.OrdenadorAscendenteDescendente;
import com.david.arrayList.negocio.ordenador.OrdenadorPersonas;
import com.david.arrayList.print.ImprimirConsola;

public class Start {

	public static void main(String[] args) {
//		System.out.println("Hola Fleming");
		
		Persona persona1 = new Persona();
		persona1.setNombre("Diego");
		persona1.setApellidos("Gonzalez Martin");
		persona1.setTelefono("123456789");
		persona1.setCiudad("Moreda");
		persona1.setEdad(22);
		persona1.setPeso(120);
		
		Persona persona2 = new Persona();
		persona2.setNombre("Pelayo");
		persona2.setApellidos("Alonso Fernandez");
		persona2.setTelefono("987654321");
		persona2.setCiudad("Corigos");
		persona2.setEdad(21);
		persona2.setPeso(30);
		
		Persona persona3 = new Persona();
		persona3.setNombre("David");
		persona3.setApellidos("Menéndez García");
		persona3.setTelefono("123789456");
		persona3.setCiudad("Corigos");
		persona3.setEdad(22);
		persona3.setPeso(455);
		
		Persona persona4 = new Persona();
		persona4.setNombre("Angel");
		persona4.setApellidos("Fernandez Velasco");
		persona4.setTelefono("741963456");
		persona4.setCiudad("Corigos");
		persona4.setEdad(22);
		persona4.setPeso(80);
		
		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);
		lista.addPersona(persona2);
		lista.addPersona(persona3);
		lista.addPersona(persona4);
		
		OrdenadorAscendenteDescendente op = new OrdenadorAscendenteDescendente();
		op.setMetodoOrdenacionEdad(OrdenadorAscendenteDescendente.ORDENACION_DESCENDENTE);
		op.setMetodoOrdenacionPeso(OrdenadorAscendenteDescendente.ORDENACION_ASCENDENTE);
		lista.ordenar(op);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
	}
}
