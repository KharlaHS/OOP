package com.generation;

public class Main {
	public static void main(String[] args ) { //taco son los objetos
		Tacos taco1 = new Tacos("Masa Azul", "Suadero", 2, "MEdiana", 30);
		/*
		taco1.tipoDeTortilla = "Masa Azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tamanioDeTortilla = "Mediana";
		taco1.precio = 30;
		taco1.subirPrecio(5.5f);
		*/
		
		
		
		Tacos taco2 = new Tacos();
		taco2.setTipoDeTortilla ("Harina");
		taco2.setTipoDeGuisado ("Bisteck");
		taco2.setNumeroDeTortilla  (1);
		taco2.setTamanioDeTortilla  ("Grande");
		taco2.setPrecio  (42.6f);
		taco2.setTipoDeTortilla  ("Trigo");
		
		Tacos taco3 = new Tacos("Maiz");
		
		System.out.println(taco2);
		/*
		System.out.println(taco1);//se llama el método toString por default
		
		System.out.println(taco3);
		*/
	}
	
}
