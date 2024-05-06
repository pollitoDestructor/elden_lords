package com.eldenlords;

public class Preguntona extends Casilla {
	public Preguntona() {
		super();
		this.imagen = "?";
		this.habilitada = true;
	}
	@Override
	public void hacerCamino() {
		this.imagen = "¿";
	}
}
