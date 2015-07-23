package com.plexxoo.android.test;

import java.io.Serializable;

public class SuperModelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 964813130403847968L;
	
	private Long id;
	
	private Float altura;
	
	private Float peso;
	
	private String nombre;

	public SuperModelo() {
		super();
		this.id = (long)0;
		this.altura = (float)0.0;
		this.peso = (float)0.0;
		this.nombre="";
	}
	
	public SuperModelo(Long id, Float altura, 
						Float peso,String nombre) {
		super();
		this.id = id;
		this.altura = altura;
		this.peso = peso;
		this.nombre=nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "SuperModelo [id=" + id + ", altura=" + altura + ", peso="
				+ peso + ", nombre=" + nombre + "]";
	}
	
	public String toStringComplete() {
		return "SuperModelo [id=" + id + ", altura=" + altura + ", peso="
				+ peso + ", nombre=" + nombre + "]";
	}
	
	

}
