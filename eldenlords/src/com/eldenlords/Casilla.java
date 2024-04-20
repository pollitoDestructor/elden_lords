package com.eldenlords;

public class Casilla {
	private boolean habilitada;
	private String imagen;
	private boolean salida;
	public Casilla() {
		this.imagen = "#";
		this.habilitada = false;
		this.salida = false;
	}
	public void habilitarCasilla() {
		this.imagen = "·";
		this.habilitada = true;
	}
	public void activarEvento() {
		
	}
	public boolean esSalida() {
		return this.salida;
	}
	public boolean estaHabilitada() {
		return this.habilitada;
	}
}