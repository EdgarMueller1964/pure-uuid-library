package com.thinkenterprise.uuid.domain;


/**
 * Enum propose List of Tyle Format. 
 *
 * @author Michael Sch�fer
 * @author Ahmed Amedlous
 * @author Dr. Edgar M�ller
 */
public enum TypeFormat {

	VIDE("Nothing"),
	Z85("z85"),
	B16("b16"),
	STD("std");

	private final String typeFormat;

	private TypeFormat(String typeFormat) {
		this.typeFormat = typeFormat;
	}

	public String getTypeFormat() {
		return typeFormat;
	}	

}
