package com.david.arrayList.error;

public class FueraDeRangoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FueraDeRangoException(String causa) {
		
		super(causa);
	}
}
