package com.eldenlords;

public class Salida extends Casilla{
	public Salida() {
		super();
		this.salida = true;
		this.imagen = "!";
		this.habilitada = true;
	}
	
	@Override
	public void activarEvento() {
		
	}
}
