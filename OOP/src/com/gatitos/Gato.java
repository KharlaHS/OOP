package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//constructor...source> generate constructorfields> elige los elementos> aceptar
	 public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	//getters y setters 
	//todos los metodos getter y setter deben ser públicos
	public String getNombre() {
		return this.nombre ;
		
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas >=0 && patas < 5) {//0 - 4
			this.patas = patas;
		}
		else {
			throw new IllegalArgumentException("El número de patas no es válido");
		}
		
		//this.patas = patas;
	}
	
	public boolean isAdoptado() {//no se pone get en boolean, sino is
		return this.adoptado;	 //is porque hace una pregunta
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	//Método toString
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	
	
	
	 
	
}
