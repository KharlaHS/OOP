package com.generation;

public class Tacos {
	
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;
	
	//getters y setters 
	//todos los metodos getter y setter deben ser públicos
	public String getTipoDeTortilla() {
		return this.tipoDeTortilla ;
		
	}
	
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla >=1 && numeroDeTortilla < 3) {//0 - 4
			this.numeroDeTortilla = numeroDeTortilla;
		}
		else {
			throw new IllegalArgumentException("La cantidad de Tortillas no es válido");
			//this.numeroDeTortilla = numeroDeTortilla;
		}
		
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	//el constructor nos ayuda a inicializar objetos
	public Tacos() {// esto es un constructor vacio cuando necesita tiempo para preparar su taco
		
	}
	
	public Tacos(String tipoDeTortilla) { //lo que va dentro de los () son parametros
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public Tacos(String tipoDeTortilla, 
				 String tipoDeGuisado, 
				 int numeroDeTortilla, 
				 String tamanioDeTortilla, 
				 float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender () {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento ) {
		//este metodo lo usamos para aumentar el precio, float aumento es un parametro
		precio = precio + aumento;
	}
	
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
