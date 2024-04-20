package com.eldenlords;

public class Casilla {
	protected boolean habilitada;
	protected String imagen;
	protected boolean salida;
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
	public String getImagen() {
		return this.imagen;
	}
	public void hacerCamino() {
		this.imagen = "*";
	}
}