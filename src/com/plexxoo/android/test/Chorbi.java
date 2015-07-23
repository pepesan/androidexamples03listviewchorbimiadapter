package com.plexxoo.android.test;

import java.io.Serializable;

public class Chorbi implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID 
									= 4790750695855662142L;

	private Long	id;
	
	private String nombre;
	
	private String numero;
	
	public Chorbi() {
		super();
		this.nombre = "";
		this.numero = "";
		this.id=(long)0;
	}

	public Chorbi(String nombre, String numero,Long id) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
