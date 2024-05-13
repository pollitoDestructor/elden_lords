package com.eldenlords;

public class Preguntona extends Casilla {
	public Preguntona() {
		super();
		this.imagen = "?";
		this.habilitada = true;
	}
	
	public void activarEvento() {

	}
	@Override
	public void hacerCamino() {
		this.imagen = "¿";
	}
}
